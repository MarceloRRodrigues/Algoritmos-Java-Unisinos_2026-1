//Exercício 1: Em uma classe qualquer, implemente o metodo chamado convertToInt,
// que recebe uma lista simplesmente encadeada que armazena apenas números inteiros positivos
// (objetos do tipo Integer). Este metodo deve, ao receber esta lista como parâmetro, retornar o número representado pela lista.

public class Exercicio1{
    static void main() {
        Exercicio1 objeto = new Exercicio1();

        SinglyLinkedList<Integer> lista = new SinglyLinkedList<>();
        lista.insertFirst(8);
        lista.insertLast(9);
        lista.insertLast(77);
        lista.insertLast(35);
        lista.insertLast(824);

        System.out.println(objeto.convertToInt(lista));

    }

    public int convertToInt(SinglyLinkedList<Integer> lista) throws UnderflowException
    {
        if (lista.isEmpty()) throw new UnderflowException("Underflow! A lista está vazia.");
        String numero = "";

        for(int i = 0; i < lista.numElements(); i++)
        {
            numero += lista.get(i);
        }
        return Integer.parseInt(numero);
    }
}
