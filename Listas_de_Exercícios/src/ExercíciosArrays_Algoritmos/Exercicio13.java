//Exercício 13: Faça um metodo chamado exercicio13 que recebe um array de inteiros e retorna
//o maior elemento do array.

package ExercíciosArrays_Algoritmos;

public class Exercicio13
{
    int exercicio13(int[] array)
    {
        int maior;
        maior = array[0];

        for(int i = 1; i<array.length; i++)
        {
            if(array[i] > maior) maior = array[i];
        }
        return maior;
    }

    public static void main(String[] args)
    {
        Exercicio13 objeto = new Exercicio13();

        int[] array = {132, 34,54,123,678,3,909,200,353,-10000};

        System.out.print("O maior elemento do array é: " + Integer.toString(objeto.exercicio13(array)));
    }
}
