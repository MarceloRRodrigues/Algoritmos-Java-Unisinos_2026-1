//Exercício 7: Faça um metodo chamado exercicio7 que recebe dois arrays de inteiros, e retorna
//um terceiro array que possui todos os elementos negativos (dos dois arrays) na primeira parte
//e todos os elementos positivos (inclusive o zero) na segunda parte (dos dois arrays).

package ExercíciosArrays_Algoritmos;

import java.util.Arrays;

public class Exercicio7
{
    int[] exercicio7(int[] array1, int[] array2)
    {
        int aux_min = 0, aux_max = (array1.length + array2.length) - 1;
        int[] array3 = new int[(array1.length + array2.length)]; //instanciando array (seu tamanho será a soma dos tamanhos dos arrays 1 e 2.
        for(int i = 0; i < array1.length; i++) //percorre o array 1
        {
            if(array1[i] < 0 ) //se o número for negativo...
            {
                array3[aux_min] = array1[i];
                aux_min++;
            }
            else if(array1[i] > 0 ) //se o número for positivo...
            {
                array3[aux_max] = array1[i];
                aux_max--;
            }
        }
        for(int i = 0; i < array2.length; i++) //percorre o array 2
        {
            if(array2[i] < 0 )  //se o número for negativo...
            {
                //Preenche o vetor do início até o fim.
                while (array3[aux_min] != 0) aux_min++; //Enquanto a posição em array3 estiver ocupada, avança para a próxima posição
                array3[aux_min] = array2[i];
                aux_min++;
            }
            else if(array2[i] > 0 ) //se o número for positivo...
            {
                //Preenche o vetor do fim ao início.
                while (array3[aux_max] != 0) aux_max--; //Enquanto a posição em array3 estiver ocupada, regride para a posição anterior
                array3[aux_max] = array2[i];
                aux_max--;
            }
        }
        return array3;
    }

    public static void main(String[] args)
    {
        Exercicio7 objeto = new Exercicio7(); // Instanciando objeto da classe
        int[] Inteiros1 = {-3,-180,0,0, 2}; //Array 1
        int[] Inteiros2 = {-1,60,29,-121,-7}; //Array2

        String arrayOutput = Arrays.toString(objeto.exercicio7(Inteiros1,Inteiros2)); //Transforma array em string para ser exibida na saída
        System.out.print("O array de inteiros correspondente é: " + arrayOutput);
    }
}
