//Exercício 5: Faça um metodo chamado exercicio5 que recebe um array de boolean e retorna
//um array de inteiros contendo 1 nas posições que são true e 0 nas posições que são false

package ExercíciosArrays_Algoritmos;

import java.util.Arrays;

public class Exercicio5
{
    int[] bolToInt(boolean[] arrayBol)
    {
        int[] arrayInteiros = new int[arrayBol.length]; //cria um array de inteiros do mesmo tamanho do array recebido

        for(int i = 0; i <arrayBol.length; i++)
        {
            if(arrayBol[i] == true) arrayInteiros[i] = 1; //se o elemento do array recebido for true, o elemento da mesma posição em arrayInteiros é 1.
            else arrayInteiros[i] = 0; //se for false, é 0.
        }
        return arrayInteiros;
    }

    public static void main(String[] args)
    {
        Exercicio5 objeto = new Exercicio5(); //Instanciando objeto da classe

        boolean[] booleanos = {false,false,true,false,true,true}; //Array recebido pelo metodo

        String arrayOutput = Arrays.toString(objeto.bolToInt(booleanos)); //Transforma array de inteiros em string para ser exibida na saída
        System.out.print("O array de inteiros correspondente é: " + arrayOutput);
    }

}
