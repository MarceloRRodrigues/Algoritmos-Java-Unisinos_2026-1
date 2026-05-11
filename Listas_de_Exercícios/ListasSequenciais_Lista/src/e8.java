//Implemente uma sobrecarga do metodo insert que recebe como parâmetro uma lista,
//em vez de um elemento. Esse metodo deve adicionar à lista corrente os elementos
//daquela passada como parâmetro, a partir da posição indicada.

public class e8
{
    static void main()
    {
        StaticList<Character> lista1 = new StaticList<>(10);
        StaticList<Character> lista2 = new StaticList<>(10);

        lista1.insert('A',0);
        lista1.insert('B',1);
        lista1.insert('C',2);

        lista2.insert('D',0);
        lista2.insert('E',1);
        lista2.insert('F',2);
        lista2.insert('G',3);

        lista1.insert( lista2,1);
        System.out.print(lista1);
    }
}
