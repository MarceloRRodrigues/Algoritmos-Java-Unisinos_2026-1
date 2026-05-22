public class StaticStack<E> implements Stack<E>
{
    private int numElements = 0;

    // Índice do elemento no topo da pilha
    protected int top;

    // Array que armazena as referências para os elementos
    protected E elements[];

    // Constroi uma pilha com um tamanho máximo
    public StaticStack(int maxSize) {
        elements = (E[])new Object[maxSize];
        top = - 1;
    }

    @Override
    public int numElements() {
        return numElements;
    }

    @Override
    public boolean isEmpty() {
        if(top == -1) return true;
        else return false;
    }

    @Override
    public boolean isFull() {
        if(top >= elements.length-1) return true;
        else return false;
    }

    @Override
    public E top() throws UnderflowException {
        if(isEmpty()) throw new UnderflowException("Pilha está vazia!");
        return elements[top];
    }

    @Override
    public void push(E element) throws OverflowException {
        if(isFull()) throw new OverflowException("Pilha está cheia!");
        elements[top+1] = element;
        top++;
        numElements++;
    }

    @Override
    public E pop() throws UnderflowException {
        if(isEmpty()) throw new UnderflowException("Pilha está vazia!");
        E pop = elements[top];
        elements[top] = null;
        top--;
        numElements--;
        return pop;
    }
    public String toString() {
        if (isEmpty())
            return "[Empty]";
        else {
            String s = "[";
            for (int i = numElements() - 1; i >= 0; i--) {
                s += "\n" + elements[i];
            }
            s += "\n]";
            return s;
        }
    }
}
