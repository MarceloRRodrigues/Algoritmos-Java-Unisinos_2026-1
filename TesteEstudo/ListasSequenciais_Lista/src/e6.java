//Implemente um metodo que troca de lugar os objetos localizados nas posições
//passadas como parâmetro. Se alguma das posições for inválida, deve ser gerada a
//exceção do Java IndexOutOfBoundsException.
//public void swap(int pos1, int pos2)

public class e6
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

        System.out.print("Lista antes da troca: " + lista1);
        lista1.swap(0,5);
        System.out.print("\nLista depois da troca: " + lista1);

    }
}
