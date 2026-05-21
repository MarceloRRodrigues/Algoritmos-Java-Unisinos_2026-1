public class teste<E>
{
    void main()
    {
        SinglyLinkedList lista = new SinglyLinkedList();

        lista.insertLast("c");
        lista.insertFirst("b");
        lista.insertLast(22);
        lista.insert("alou",2);
        System.out.println(lista.search(23));
        System.out.println(lista.search(22));

        System.out.println(lista.toString() + " número de elementos: " + lista.numElements());

        lista.remove(1);
        lista.removeFirst();

        System.out.print(lista.toString() + " número de elementos: " + lista.numElements());

        lista.insertLast("aeiou");
        E var = (E) lista.get(lista.numElements()-1);
        System.out.print(var);
    }
}
