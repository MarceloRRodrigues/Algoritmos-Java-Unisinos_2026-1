//Exercício 3: Implemente um metodo na classe SinglyLinkedList chamado split,
// que recebe um elemento "divisor" por parâmetro e divide a lista em duas partes:
// antes e depois da primeira ocorrência de "divisor".
// A lista corrente deve ficar com a parte final da lista (ou seja, com os elementos após "divisor").
// O metodo retorna uma lista simplesmente encadeada que possui os elementos do começo da lista corrente até o "divisor",inclusive.

public class Exercicio3
{
    public static void main()
    {
        SinglyLinkedList<Integer> lista = new SinglyLinkedList<>();
        lista.insertFirst(8);
        lista.insertLast(9);
        lista.insertLast(77);
        lista.insertLast(35);
        lista.insertLast(824);

        System.out.println("Nova Lista: " + (lista.split(77)).toString());
        System.out.println("Lista original após o split: " + lista);
    }
}
