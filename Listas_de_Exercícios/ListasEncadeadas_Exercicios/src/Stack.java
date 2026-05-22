public interface Stack<E> {

    // ** Return the number of elements in the stack. */
    public int numElements();

    // ** Return whether the stack is empty. */
    public boolean isEmpty();

    // ** Return whether the stack is full. */
    public boolean isFull();

    // ** Inspect the element at the top of the stack .* /
    public E top() throws UnderflowException;

    // ** Insert an element at the top of the stack .* /
    public void push(E element) throws OverflowException;

    // ** Remove the top element from the stack .* /
    public E pop() throws UnderflowException;
}