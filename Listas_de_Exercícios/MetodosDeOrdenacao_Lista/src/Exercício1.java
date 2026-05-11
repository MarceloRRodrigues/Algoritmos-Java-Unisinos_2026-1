//Mostre os passos necessários para ordenar este array utilizando os métodos:

//Bubble Sort
//Inserção Direta
//Seleção Direta

import java.util.Arrays;

public class Exercício1
{
    static void main()
    {
        Exercício1 objeto = new Exercício1();
        int[] array = new int[]{4, -3, 18, 22, 5, 0, 1, 47, -2, 9};

        System.out.print("\nArray Original: " + Arrays.toString(array));
        System.out.print("\n\nArray Ordenado: " + Arrays.toString(objeto.BubbleSorting(array)));

        array = new int[]{4, -3, 18, 22, 5, 0, 1, 47, -2, 9};

        System.out.print("\nArray Original: " + Arrays.toString(array));
        System.out.print("\n\nArray Ordenado: " + Arrays.toString(objeto.Insercao(array)));

        array = new int[]{4, -3, 18, 22, 5, 0, 1, 47, -2, 9};

        System.out.print("\nArray Original: " + Arrays.toString(array));
        System.out.print("\n\nArray Ordenado: " + Arrays.toString(objeto.Selecao(array)));
    }

    public int[] BubbleSorting(int[] array)
    {
        System.out.print("\nComeçando BubbleSorting ->\n\n");
        int ordenado, cont = 0;

        do
        {
            cont++; //contagem de iterações.
            System.out.printf("Iteração número %d...\n", cont);
            ordenado = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int menor = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = menor;
                    ordenado++; //ordenou algum número
                }
            }
        }while(ordenado!=0); //enquanto algum numero tiver sido ordenado, repete.

        return array;
    }
    /*LÓGICA

    repetir várias passadas:
    para cada par de vizinhos:
        se estiver fora de ordem:
            trocar
     */

    public int[] Insercao(int[] array)
    {
        int cont = 0;
        System.out.print("\n\nComeçando Inserção ->\n\n");
        for(int i = 1; i < array.length; i++) //percorre todos os elementos do seg. não ord.
        {
            int chave = array[i]; // Valor que será inserido na posição correta
            int j = i; // Índice usado para percorrer a parte ordenada

            // Move os elementos maiores que a chave uma posição à direita
            while (j > 0 && array[j - 1] > chave)
            {
                array[j] = array[j - 1];
                j--;
            }

            // Insere a chave na posição correta
            array[j] = chave;

            //Identifica qual é a iteração atual.
            cont++;
            System.out.printf("Iteração %d...\n", cont);

        }
        return array;

        /* LÓGICA Insertion Sort:

    for (cada elemento a partir do segundo) {
        salvar valor atual (chave)
        andar para trás enquanto for maior que a chave
            deslocar elemento para a direita
        inserir chave na posição encontrada
    }
 */
    }

    public int[] Selecao(int[] array)
    {
        System.out.print("\n\nComeçando Seleção Direta ->\n\n");

        int pos_inicial = 0, cont =0;

        do {

            int pos_menor = pos_inicial;

            for (int i = pos_inicial + 1; i < array.length; i++)
            {
                if (array[i] < array[pos_menor]) {
                    pos_menor = i;
                }
            }

            int temp = array[pos_inicial];
            array[pos_inicial] = array[pos_menor];
            array[pos_menor] = temp;

            pos_inicial++;
            System.out.printf("Iteração %d...\n", cont);
            cont++;

        } while (pos_inicial < array.length - 1);

        return array;
    }
    /*Lógica Selection Sort:

    para cada posição i:
        assumir que i é o menor
        para cada elemento depois de i:
            se encontrar menor:
                atualizar posição do menor
        trocar i com o menor encontrado
     */

}
