//Exercício 14: Faça um metodo chamado exercicio14 que recebe um array de inteiros e retorna
//a posição do maior elemento do array.

package ExercíciosArrays_Algoritmos;

public class Exercicio14
{
    int exercicio14(int[] array)
    {
        int maior, pos = -1;
        maior = array[0];

        for(int i = 1; i<array.length; i++)
        {
            if(array[i] > maior)
            {
                maior = array[i];
                pos = i;
            }

        }
        return pos;
    }

    public static void main(String[] args)
    {
        Exercicio14 objeto = new Exercicio14();

        int[] array = {132, 34,54,123,678,3,909,2000,353,-10000};

        System.out.printf("A posição do maior elemento do array é: %d", objeto.exercicio14(array));
    }
}