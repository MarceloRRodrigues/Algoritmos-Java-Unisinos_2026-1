//Exercício 6: Faça um metodo chamado exercicio6 que recebe dois arrays de inteiros, e retorna
//um terceiro array com todos os elementos dos dois arrays.

package ExercíciosArrays_Algoritmos;

import java.util.Arrays;

public class Exercicio6 {

    int[] mergeArrays(int[] array1, int[] array2)
    {
        int aux = array1.length;
        int[] array3 = new int[(array1.length + array2.length)]; //instanciando array (seu tamanho será a soma dos tamanhos dos arrays 1 e 2.

        for(int i = 0; i < array1.length; i++) array3[i] = array1[i]; //copia o array 1 para o array 3

        for(int i = 0; i < array2.length; i++) //copia o array2 para o array 3 nas posições restantes
        {
            array3[aux] = array2[i];
            aux++;
        }
        return array3;
    }

    public static void main(String[] args)
    {
        Exercicio6 objeto = new Exercicio6(); // Instanciando objeto da classe
        int[] Inteiros1 = {1,9,8,9}; //Array 1
        int[] Inteiros2 = {0,0,0,2,0,0,4}; //Array2

        String arrayOutput = Arrays.toString(objeto.mergeArrays(Inteiros1,Inteiros2)); //Transforma array em string para ser exibida na saída
        System.out.print("O array de inteiros correspondente é: " + arrayOutput);
    }

}
