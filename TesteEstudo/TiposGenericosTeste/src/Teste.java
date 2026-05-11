public class Teste
{
    static void main()
    {

        Box<Integer> box = new Box<>(); //ou new Box<Integer>();

        box.add(20); //ou box.add(new Integer(20))
        System.out.print(box.get());
    }

}

class Box<T>
{
    T object;

    public void add(T o)
    {
        object = o;
    }
    public T get()
    {
        return object;
    }
}
