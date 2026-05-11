//Exercício 15: Faça um metodo chamado exercicio15 que recebe um array de inteiros e retorna
//o menor elemento do array.

package ExercíciosArrays_Algoritmos;

public class Exercicio15
{
    int exercicio15(int[] array)
    {
        int menor;
        menor = array[0];

        for(int i = 1; i<array.length; i++)
        {
            if(array[i] < menor) menor = array[i];
        }
        return menor;
    }

    public static void main(String[] args)
    {
        Exercicio15 objeto = new Exercicio15();

        int[] array = {132, 34,54,123,678,300,909,200,353,10000};

        System.out.print("O menor elemento do array é: " + Integer.toString(objeto.exercicio15(array)));
    }
}

