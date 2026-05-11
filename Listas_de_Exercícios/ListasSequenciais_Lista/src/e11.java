//Implemente um método clone para a lista. Esse método deve retornar uma nova lista
//contendo os mesmos elementos da atual. Os elementos em si não devem ser
//duplicados.

public class e11
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

        System.out.print(lista1.Clone());
    }
}
