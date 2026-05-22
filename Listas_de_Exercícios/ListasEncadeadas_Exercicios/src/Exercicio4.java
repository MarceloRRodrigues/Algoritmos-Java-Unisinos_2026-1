//Exercício 4: Implemente, em uma classe qualquer, um metodo que recebe uma lista simplesmente encadeada
// de double e retorna uma pilha estática (objeto StaticStack) com todos os elementos negativos da lista recebida por parâmetro.

public class Exercicio4
{
    static void main()
    {
        Exercicio4 objeto = new Exercicio4();

        SinglyLinkedList<Double> lista = new SinglyLinkedList<>();
        lista.insertFirst(8.2);
        lista.insertLast(-45.5);
        lista.insertLast(71.2);
        lista.insertLast(-35.0);
        lista.insertLast(-824.2);
        lista.insertLast(-9.0);
        lista.insertLast(9.1);
        lista.insertLast(-77.0);
        lista.insertLast(-37.5);
        lista.insertLast(324.6);
        System.out.println((objeto.pilhaNegativa(lista)).toString());
    }
    public StaticStack<Double> pilhaNegativa(SinglyLinkedList<Double> lista)
    {
        StaticStack<Double> pilha = new StaticStack<>(lista.numElements());

        for(int i = 0; i < lista.numElements(); i++)
        {
            if(lista.get(i) < 0) pilha.push(lista.get(i));
        }
        return pilha;
    }

}
