/*
Crie uma classe chamada Placa, que possui dois atributos: letras e números (utilize os dois atributos do tipo String).
Crie o construtor, métodos de acesso e toString() para esta classe.

Crie uma classe chamada OrdenaPlaca. Nesta classe, você deve escolher 2 métodos de ordenação diferentes (dentre os 3 que trabalhamos)
para realizar a ordenação de um array de placas: um dos métodos deve ordenar um array de objetos do tipo Placa (recebido por parâmetro)
em relação às letras, ou seja em ordem alfabética;
o outro metodo deve ordenar um array de objetos do tipo Placa (recebido por parâmetro) em relação aos números (em ordem crescente).
As assinaturas dos métodos são:

private void algoritmoDeOrdenacao1(Placa[] placas)

private void algoritmoDeOrdenacao2(Placa[] placas)

Depois disso, ainda na classe OrdenaPlaca, você deve criar um metodo chamado ordena, que recebe por parâmetro um array de objetos
do tipo Placa. Este metodo chama os métodos de ordenação criados anteriormente para que o array fique ordenado de acordo com as letras
das placas, em ordem alfabética.

ENTRETANTO, é possível que existam placas com as mesmas letras.
Quando isto acontecer, seu metodo deve garantir que as placas ficarão ordenadas também pelo número
 */

public class Exercício4
{
    public static void main()
    {
        Placa[] placas = new Placa[(int)(Math.random()*100+1)];

        for(int i=0; i<placas.length; i++){
            String numero = "";
            for(int j=0; j<4; j++)
                numero += (int)(Math.random()*10);
            String letras = "";
            for(int j=0; j<3; j++)
                letras += (char)((int)(Math.random()*26) + 65);
            placas[i] = new Placa(letras, numero);
        }

        OrdenaPlaca op = new OrdenaPlaca();
        op.ordena(placas);

        for(Placa p: placas)
            System.out.println(p.toString());
    }
}

class Placa
{
    String letras, numero;

    public Placa(String letras, String numero)
    {
        this.letras = letras;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return letras + "-" + numero;
    }
}

class OrdenaPlaca
{
    public void ordena(Placa[] placas)
    {
        algoritmoDeOrdenacao1(placas);
        algoritmoDeOrdenacao2(placas);

    }


    private void algoritmoDeOrdenacao2(Placa[] placas) //BubbleSort (Letras)
    {
        System.out.print("\nComeçando BubbleSorting ->\n\n");
        int ordenado, cont = 0;

        do
        {
            cont++; //contagem de iterações.
            System.out.printf("Iteração número %d...\n", cont);
            ordenado = 0;
            for (int i = 0; i < placas.length - 1; i++) {
                if (placas[i].letras.compareTo(placas[i+1].letras) > 0) {
                    Placa menor = placas[i + 1];
                    placas[i + 1] = placas[i];
                    placas[i] = menor;
                    ordenado++; //ordenou algum número
                }
            }
        }while(ordenado!=0); //enquanto algum numero tiver sido ordenado, repete.

    }

    private void algoritmoDeOrdenacao1(Placa[] placas) //InsertionSort (Número)
    {
        int cont = 0;
        System.out.print("\n\nComeçando Inserção ->\n\n");
        for (int i = 1; i < placas.length; i++) //percorre todos os elementos do seg. não ord.
        {
            Placa chave = placas[i]; // Valor que será inserido na posição correta
            int j = i; // Índice usado para percorrer a parte ordenada

            // Move os elementos maiores que a chave uma posição à direita
            while (j > 0 && Integer.parseInt(placas[j - 1].numero) > Integer.parseInt(chave.numero)){
                placas[j] = placas[j - 1];
                j--;
            }

            // Insere a chave na posição correta
            placas[j] = chave;

            //Identifica qual é a iteração atual.
            cont++;
            System.out.printf("Iteração %d...\n", cont);

        }
    }
}
