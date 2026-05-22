//Exercício 2: Implemente, em uma classe qualquer, um metodo recursivo que soma todos os elementos contidos
// em uma lista simplesmente encadeada de inteiros recebida por parâmetro.

public class Exercicio2
{
    public static void main() {
        Exercicio2 objeto = new Exercicio2();

        SinglyLinkedList<Integer> lista = new SinglyLinkedList<>();
        lista.insertFirst(8);
        lista.insertLast(9);
        lista.insertLast(77);
        lista.insertLast(35);
        lista.insertLast(824);

        System.out.println("A soma dos números é = " + objeto.sumElements(lista));
    }
    public int sumElements(SinglyLinkedList<Integer> lista) throws UnderflowException
    {
        if(lista.isEmpty()) throw new UnderflowException("A lista está vazia!");

        int pos = 0;
        return sumElements(lista, pos);
    }
    private int sumElements(SinglyLinkedList<Integer> lista, int pos)
    {
        //Se a posição atual da lista for a última... retorna o valor da posição atual
        if((pos) == lista.numElements()-1) return lista.get(pos); //caso base

        return lista.get(pos) + sumElements(lista, pos+1);
    }
}
