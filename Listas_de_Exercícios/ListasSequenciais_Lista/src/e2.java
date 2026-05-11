//Implemente um metodo que recebe duas listas e retorna uma terceira, contendo a
//intercalação dos métodos das duas iniciais. Por exemplo, dadas as listas t1 = (A, B,
//C) e t2 = (D, E, F), a intercalação das duas deve produzir (A, D, B, E, C, F). As listas
//originais não devem ser alteradas.
//public List<Character> mergeLists(List<Character> t1, List<Character> t2)

import java.util.Arrays;

public class e2
{
    static void main()
    {
        e2 obj = new e2();

        List<Character> lista1 = new StaticList<>(10);
        List<Character> lista2 = new StaticList<>(10);

        lista1.insert('A',0);
        lista1.insert('B',1);
        lista1.insert('C',2);

        lista2.insert('D',0);
        lista2.insert('E',1);
        lista2.insert('F',2);
        lista2.insert('G',3);


        System.out.print(obj.mergeLists(lista1, lista2).toString());

    }

    public List<Character> mergeLists(List<Character> t1, List<Character> t2)
    {
        int posT1 = 0, posT2 = 0, total_pos = t1.numElements()+t2.numElements();
        List<Character> lista3 = new StaticList<>(t1.numElements()+t2.numElements()); //tam lista 3 soma tam 1 e 2


        for(int i = 0; i < total_pos; i++)
        {
            if(i % 2 == 0)
            {
                if(posT1 < t1.numElements()) {
                    lista3.insert(t1.get(posT1), i);
                    posT1++;
                }
                else
                {
                    lista3.insert(t2.get(posT2), i);
                    posT2++;
                }
            }
            else
            {
                if(posT2 < t2.numElements())
                {
                    lista3.insert(t2.get(posT2), i);
                    posT2++;
                }
                else
                {
                    lista3.insert(t1.get(posT1), i);
                    posT1++;
                }
            }
        }
        return lista3;
    }

}
