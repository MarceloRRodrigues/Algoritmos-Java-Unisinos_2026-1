//Exercício 3: Faça um metodo chamado exercicio3 que recebe um array de inteiros e retorna
//um novo array que contém somente os valores pares do array recebido (não esqueça que você
//deve saber qual o tamanho do array de retorno antes de instanciar).

package ExercíciosArrays_Algoritmos;

import java.util.Arrays;

public class Exercicio3 {

    int[] exercicio3(int[] arrayInteiros)
    {
        int pares = 0, aux = 0;
        String erro = "Não há números pares";

        for(int i = 0; i < arrayInteiros.length; i++) //verifica quantos números pares existem no array
        {
            if(arrayInteiros[i] % 2 == 0 ) pares++;
        }

        int[] arrayPares = new int[pares]; //Instancia o array, agora conhecendo o tamanho.

        for(int i = 0; i < arrayInteiros.length; i++) //armazena os pares no arrayPares
        {
            if(arrayInteiros[i] % 2 == 0 )
            {
                arrayPares[aux] = arrayInteiros[i];
                aux++;
            }

        }
        return arrayPares;
    }

    public static void main(String[] args)
    {
        Exercicio3 objeto = new Exercicio3();
        int[] inteiros = {1,2,3,4};

        if(objeto.exercicio3(inteiros).length != 0)
        {
            String paresString = Arrays.toString(objeto.exercicio3(inteiros)); //Transforma o vetor de pares em string
            System.out.print("Os valores pares do vetor são: " + paresString);
        }
        else System.out.print("O vetor não possui valores pares.");
    }
}
