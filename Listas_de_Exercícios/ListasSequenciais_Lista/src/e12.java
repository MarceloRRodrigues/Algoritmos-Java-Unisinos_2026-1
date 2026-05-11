//Implemente um metodo que remove da lista os elementos compreendidos entre as
//posições ini e fim (inclusive). Ele deve retornar a quantidade de elementos
//removidos.
//public int remove(int ini, int fim)

public class e12
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

        System.out.print(lista1.remove(2,5));
        System.out.print(lista1);
    }
}
