//Implemente um metodo split que divide a lista em duas partes. A lista corrente deve
//ficar somente com os elementos da início até uma posição antes da indicada, e o
//metodo deve retornar uma nova lista contendo os elementos da posição indicada até
//o final.
//public List<E> split(int pos)

public class e13
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

        System.out.print(lista1.split(5));
    }
}
