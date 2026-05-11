// Implemente um metodo que recebe duas listas t1 e t2 e copia os elementos da
//segunda para o início da primeira.
//public void prependList(List<Double> t1, List<Double> t2)

public class e3
{
    static void main()
    {
        e3 obj = new e3();

        //listas não podem ultrapassar 10 elementos
        List<Double> lista1 = new StaticList<>(10);
        List<Double> lista2 = new StaticList<>(10);

        lista1.insert(34.5,0);
        lista1.insert(12.6,1);
        lista1.insert(7.3,2);

        lista2.insert(2.1,0);
        lista2.insert(10.8,1);
        lista2.insert(90.72,2);

        obj.prependList(lista1, lista2);
        System.out.print(lista1);
    }

    public void prependList(List<Double> t1, List<Double> t2)
    {
        for(int i = 0; i < t2.numElements(); i++)
        {
            t1.insert(t2.get(i), i);
        }
    }

}
