//Nome: Marcelo da Rosa Rodrigues


import java.util.Random;

public class LimaoEntrouNaRoda
{
    private Node inicio, fim;
    private int quantidade;
    private String[] nomes ={"Gabriel","João","Maria", "Natália", "Felipe", "Marcelo", "Matheus","Pedro","Lucas", "Marcos"};
    Random gerador = new Random();

    public LimaoEntrouNaRoda(int quantidade) {
        this.quantidade = quantidade;

        for(int i = 0; i < quantidade; i++)
        {
            Pessoa p = new Pessoa(nomes[i], gerador.nextInt(10, 20));
            Node<Pessoa> pessoaNova = new Node<>(p);

            if (i == 0) inicio = pessoaNova;
            else {
                Node<Pessoa> current = inicio;

                while (current.getNext() != null) {
                    current = current.getNext();
                }

                current.setNext(pessoaNova);

                if(i == quantidade - 1){
                    pessoaNova.setNext(inicio);
                    fim = pessoaNova;
                }
            }
        }

    }
    public void imprimeRoda()
    {
        Node<Pessoa> current = inicio;
        for(int i = 0; i < quantidade; i++)
        {
            System.out.println(current.getElement().toString());
            current = current.getNext();
        }
    }
    public int passaObjeto(int x)
    {
        return x % quantidade;
    }

    public Pessoa removePosicao(int x)
    {
        Node<Pessoa> current = inicio;

        if(x == 0)
        {
            current = fim; // nó anterior ao início
        }
        else {

            for (int i = 0; i < x - 1; i++) {
                current = current.getNext();
            }
        }
        Node<Pessoa> removido = current.getNext();
        current.setNext(current.getNext().getNext());

        if(removido == inicio) inicio = inicio.getNext();
        else if(removido == fim){
            fim = current;
            fim.setNext(inicio);
        }

        quantidade--;
        return removido.getElement();
    }

}
