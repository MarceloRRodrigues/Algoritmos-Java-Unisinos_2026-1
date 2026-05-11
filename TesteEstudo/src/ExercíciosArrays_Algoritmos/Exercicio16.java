//Exercício 16: Faça um metodo chamado exercicio16 que recebe um array de inteiros e retorna
//a posição do menor elemento do array.

package ExercíciosArrays_Algoritmos;

public class Exercicio16
{
    int exercicio16(int[] array)
    {
        int menor, pos = array.length + 1;
        menor = array[0];

        for(int i = 1; i<array.length; i++)
        {
            if(array[i] < menor)
            {
                menor = array[i];
                pos = i;
            }

        }
        return pos;
    }

    public static void main(String[] args)
    {
        Exercicio16 objeto = new Exercicio16();

        int[] array = {132, 34,54,123,678,3,909,2000,353,10000};

        System.out.printf("A posição do menor elemento do array é: %d", objeto.exercicio16(array));
    }
}