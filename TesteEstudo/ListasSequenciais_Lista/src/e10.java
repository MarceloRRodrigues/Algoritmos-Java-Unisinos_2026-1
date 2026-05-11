//Implemente um metodo equals para a lista. Uma lista será igual a outra se contiver os
//mesmos elementos, dispostos na mesma ordem. Para comparar os elementos, use
//também o metodo equals. Pesquise como desenvolver o metodo equals de um objeto
//no Java.

public class e10
{
    static void main()
    {
        StaticList<Character> lista1 = new StaticList<>(10);
        StaticList<Character> lista2 = new StaticList<>(10);

        lista1.insert('A',0);
        lista1.insert('B',1);
        lista1.insert('C',2);

        lista2.insert('A',0);
        lista2.insert('B',1);
        lista2.insert('C',2);

        System.out.print(lista1.equals(lista2));
    }
}
