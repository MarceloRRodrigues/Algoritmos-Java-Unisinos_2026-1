//Exercício 2: Faça um metodo chamado exercicio2 que recebe um array de inteiros e retorna
//um array com as posições invertidas.

package ExercíciosArrays_Algoritmos;

//O metodo recebe um array e retorna outro array com as posições invertidas.

import java.util.Arrays;

public class Exercicio2{

    int[] exercicio2(int[] inteiros)
    {
        int[] inversao = new int[inteiros.length]; //cria um array para os valores invertidos (mesmo tamanho do original)
        int aux = inteiros.length - 1;

        for(int i = 0; i < inteiros.length; i++) //Armazena o fim do Array de inteiros no inicio do array de inversão.
        {
            inversao[i] = inteiros[aux];
            aux--;
        }
        return inversao;
    }

    public static void main(String[] args)
    {
        Exercicio2 objeto = new Exercicio2();
        int[] vetor = {2,0,0,4};

        String retornoString = Arrays.toString(objeto.exercicio2(vetor)); //Transforma o array retornado em string, para que se possa imprimi-lo
        System.out.printf("Array invertido: " + retornoString);
    }
}
