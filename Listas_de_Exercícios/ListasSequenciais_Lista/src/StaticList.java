/**
 * Implementação de uma lista linear com armazenamento estático,
 * baseado em array.
 */

import java.util.Arrays;

public class StaticList<E> implements List<E> {
    private E[] elements;
    private int numElements;

    /**
     * Constrói uma lista com um tamanho máximo.
     * @param maxSize O tamanho máximo da lista
     */
    public StaticList(int maxSize) {
        elements = (E[])new Object[maxSize];
        numElements = 0;
    }

    public int numElements() {
        return numElements;
    }

    public boolean isEmpty() {
        return numElements == 0;
    }

    public boolean isFull() {
        return numElements == elements.length;
    }

    public void insert(E element, int pos) throws OverflowException, IndexOutOfBoundsException{
        // verifica se há espaço na lista
        if (isFull())
            throw new OverflowException();

        // verifica se a posição é válida
        if (pos < 0  ||  pos > numElements)
            throw new IndexOutOfBoundsException();

        // desloca para a direita os elementos necessários,
        // abrindo espaço para o novo
        for (int i = numElements-1; i >= pos; i--)
            elements[i+1] = elements[i];

        // armazena o novo elemento e ajusta o total
        elements[pos] = element;
        numElements++;
    }

    public E remove(int pos) throws UnderflowException, IndexOutOfBoundsException{
        if(isEmpty())
            throw new UnderflowException();

        // verifica se a posição é válida
        if (pos < 0  ||  pos >= numElements)
            throw new IndexOutOfBoundsException();

        // guarda uma refer�ncia temporária ao elemento removido
        E element = elements[pos];

        // desloca para a esquerda os elementos necessários,
        // sobrescrevendo a posição do que está sendo removido
        for (int i = pos; i < numElements-1; i++)
            elements[i] = elements[i+1];

        // define para null a posição antes ocupada pelo último,
        // para que a coleta de lixo possa atuar, e ajusta o total
        elements[numElements-1] = null;
        numElements--;

        return element;
    }

    public E get(int pos) throws IndexOutOfBoundsException{
        // verifica se a posição é válida
        if (pos < 0  ||  pos >= numElements)
            throw new IndexOutOfBoundsException();

        return elements[pos];
    }

    public int search(E element) {
        for (int i = 0; i < numElements; i++)
            if (element.equals(elements[i]))
                return i;

        // se chegar até aqui, é porque não encontrou
        return -1;
    }

    /**
     * Retorna uma representação String da lista.
     * @see java.lang.Object#toString()
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < numElements; i++)
            s += elements[i] + " ";
        return s;
    }

    public boolean remove(E element)
    {
        int pos_elemento = search(element);
        if(pos_elemento == -1) return false;
        else
        {
            remove(pos_elemento);
            return true;
        }
    }
    public void insertAfter(E obj1, E obj2) throws ElementNotFound
    {
        if(search(obj1) != -1)
        {
            int pos = search(obj1) +1;
            for (int i = numElements-1; i >= pos; i--)
                elements[i+1] = elements[i];

            elements[pos] = obj2;
            numElements++;
        }
        else throw new ElementNotFound();
    }

    public void swap(int pos1, int pos2) throws IndexOutOfBoundsException
    {
        if(pos1 >= numElements || pos2 >= numElements) throw new IndexOutOfBoundsException("Posição inválida foi inserida.");
        else
        {
            E aux = elements[pos1];
            elements[pos1] = elements[pos2];
            elements[pos2] = aux;
        }
    }
    public void flip()
    {
        E[] arrayClone = Arrays.copyOf(elements, elements.length);

        int pos = 0;
       for(int i = numElements-1; i>=0; i--)
       {
           elements[pos] = arrayClone[i];
           pos++;
       }
    }
    public void insert(List<E> lista, int pos) throws OverflowException, IndexOutOfBoundsException{
        // verifica se há espaço na lista
        if (numElements + lista.numElements() > elements.length)
            throw new OverflowException();

        // verifica se a posição é válida
        if (pos < 0  ||  pos > numElements)
            throw new IndexOutOfBoundsException();

        // desloca para a direita os elementos necessários,
        // abrindo espaço para o novo
        for (int i = numElements-1; i >= pos; i--)
            elements[i+lista.numElements()] = elements[i];

        int aux = 0;
        for(int i = pos; i<pos+lista.numElements(); i++)
        {
            elements[i] = lista.get(aux);
            aux++;
        }
        numElements += lista.numElements();
    }
    public void dedup()
    {
        for(int i = 0; i < numElements-1;i++)
        {
            for (int j = i+1; j < numElements; j++)
            {
                if(elements[j].equals(elements[i]))
                {
                    remove(j);
                    j--;
                }
            }
        }
    }
    public boolean equals(List<E> lista)
    {
        if(numElements != lista.numElements()) return false;
        for(int i = 0; i < lista.numElements(); i++)
        {
            if(!elements[i].equals(lista.get(i))) return false;
        }
        return true;
    }
    public List<E> Clone()
    {
        StaticList<E> lista2 = new StaticList<>(numElements);

        for(int i = 0; i < numElements; i++)
        {
            lista2.insert(elements[i], i);
        }
        return lista2;
    }
    public int remove(int ini, int fim)
    {
        int cont = 0;

        while(cont < ((fim - ini)+1)){
            remove(ini);
            cont++;
        }
        return cont;
    }
    public List<E> split(int pos)
    {
        StaticList<E> lista2 = (StaticList<E>) Clone();

        lista2.remove(0,pos-1);
        return lista2;
    }
}