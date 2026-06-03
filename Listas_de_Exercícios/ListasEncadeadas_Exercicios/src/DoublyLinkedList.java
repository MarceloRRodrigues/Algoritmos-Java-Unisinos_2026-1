public class DoublyLinkedList<E> implements List<E>
{
    protected DNode<E> head; //nodo cabeça da lista
    protected DNode<E> tail; //nodo cauda da lista
    protected int numElements; //número de nodos da lista

    public DoublyLinkedList() {
        numElements = 0;
        head = tail = null;
    }

    @Override
    public int numElements() {
        return numElements;
    }

    @Override
    public boolean isEmpty() {
        if(numElements == 0) return true;
        else return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void insert(E element, int pos) throws NullPointerException, IndexOutOfBoundsException
    {
        if (element == null) throw new NullPointerException();
        if(pos < 0 || pos > numElements) throw new IndexOutOfBoundsException("Posição inválida!");

        if(pos == 0) insertFirst(element);
        else if(pos == numElements) insertLast(element);
        else
        {
            DNode<E> NewNode = new DNode<>(element);
            DNode<E> current = head;
            for(int i = 0; i < pos-1; i++)
            {
                current = current.getNext();
            }
            NewNode.setNext(current.getNext());
            NewNode.setPrevious(current);

            current.getNext().setPrevious(NewNode);
            current.setNext(NewNode);

            numElements++;
        }
    }
    public void insertFirst(E element) throws NullPointerException
    {
        if (element == null) throw new NullPointerException();

        DNode<E> NewNode = new DNode<>(element);

        if(isEmpty()) head = tail = NewNode;
        else
        {
            NewNode.setNext(head);
            head.setPrevious(NewNode);
            head = NewNode;
        }
        numElements++;
    }

    public void insertLast(E element) {
        if (element == null) throw new NullPointerException();

        DNode<E> NewNode = new DNode<>(element);

        if(isEmpty()) head = tail = NewNode;
        else
        {
            tail.setNext(NewNode);
            NewNode.setPrevious(tail);
            tail = NewNode;
        }
        numElements++;
    }

    @Override
    public E remove(int pos) throws UnderflowException, IndexOutOfBoundsException
    {
        if(isEmpty()) throw new UnderflowException("A lista está vazia!");
        if(pos < 0 || pos >= numElements) throw new IndexOutOfBoundsException("A posição é inválida!");

        if(pos == 0) return removeFirst();
        else if(pos == numElements-1) return removeLast();
        else
        {
            DNode<E> current = head;
            DNode<E> removido;
            for(int i = 0; i < pos-1; i++)
            {
                current = current.getNext();
            }
            removido = current.getNext();
            current.setNext(current.getNext().getNext());
            current.getNext().setPrevious(current);
            numElements--;

            return removido.getElement();
        }
    }

    public E removeFirst() throws UnderflowException
    {
        if(isEmpty()) throw new UnderflowException(" A lista está vazia");

        DNode<E> removido;

        if(numElements == 1)
        {
            removido = head;
            head = tail = null;
        }
        else
        {
            head = head.getNext();
            removido = head.getPrevious();
            head.setPrevious(null);
        }
        numElements--;
        return removido.getElement();
    }

    public E removeLast() throws UnderflowException
    {
        if(isEmpty()) throw new UnderflowException(" A lista está vazia");
        DNode<E> removido;

        if(numElements == 1)
        {
            removido = head;
            head = tail = null;
        }
        else
        {
            tail = tail.getPrevious();
            removido = tail.getNext();
            tail.setNext(null);
        }
        numElements--;
        return removido.getElement();
    }

    @Override
    public E get(int pos) throws IndexOutOfBoundsException
    {
        //Se a lista estiver vazia, informará posição inválida.
        if(pos < 0 || pos >= numElements) throw new IndexOutOfBoundsException("Posição inválida!");

        DNode<E> current = head;

        for(int i = 0; i < pos; i++)
        {
            current = current.getNext();
        }
        return current.getElement();
    }

    //pesquisa se o elemento está na lista. Caso esteja, o metodo retorna a posição do elemento na lista.
    public int search(E element) throws NullPointerException
    {
        if(element == null) throw new NullPointerException("Elemento inválido");

        DNode<E> current = head;
        for(int pos = 0; pos < numElements; pos++)
        {
            if(current.getElement().equals(element)) return pos;
            current = current.getNext();
        }
        System.out.println("O elemento não foi encontrado.");
        return -1;
    }
    public String toString() {
        String s = "";
        DNode current = head;

        for (int i = 0; i < numElements; i++)
        {
            s += current.getElement() + " ";
            current = current.getNext();
        }
        return s;
    }
    public void swap(int pos1, int pos2) throws IndexOutOfBoundsException
    {
        if(pos1 < 0 || pos1 >= numElements || pos2 < 0 || pos2 >numElements) throw new IndexOutOfBoundsException("Posição inválida!");

        DNode<E> nodePos1 = head;
        DNode<E> nodePos2 = head;

        for(int i = 0; i < pos1; i++)
        {
            nodePos1 = nodePos1.getNext();
        }
        for(int i = 0; i < pos1; i++)
        {
            nodePos2 = nodePos2.getNext();
        }

    }

}
