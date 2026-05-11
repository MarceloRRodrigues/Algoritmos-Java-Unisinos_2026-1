//Implemente um metodo que inverte a ordem dos elementos da lista.
//public void flip()

public class e7
{
    static void main()
    {
        StaticList<Character> lista1 = new StaticList<>(10);

        lista1.insert('A',0);
        lista1.insert('B',1);
        lista1.insert('C',2);
        lista1.insert('D',3);
        lista1.insert('E',4);
        lista1.insert('F',5);
        lista1.insert('G',6);

        lista1.flip();
        System.out.print(lista1);
    }
}
