//Implemente um metodo que remove ocorrências múltiplas de elementos na lista. Para
//cada elemento contido na lista, somente a primeira ocorrência deve ser mantida.
//public void dedup()

public class e9
{
    static void main()
    {
        StaticList<Integer> lista1 = new StaticList<>(10);

        lista1.insert(12,0);
        lista1.insert(13,1);
        lista1.insert(12,2);
        lista1.insert(12,3);
        lista1.insert(15,4);
        lista1.insert(12,5);
        lista1.insert(14,6);
        lista1.insert(12,7);

        lista1.dedup();

        System.out.print(lista1);
    }

}
