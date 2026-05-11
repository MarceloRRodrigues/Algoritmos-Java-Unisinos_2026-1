//Exercício 21: Faça um metodo chamado exercicio21 que recebe um array de double e imprime
//somente as POSIÇÕES (não valores) pares do array

package ExercíciosArrays_Algoritmos;

public class Exercicio21
{
    void exercicio21(double[] array)
    {
        for(int i = 0; i < (array.length); i++)
        {
            if(i % 2 == 0) System.out.printf("%.2f ", array[i]);
        }
    }

    public static void main(String[] args)
    {
        Exercicio21 objeto = new Exercicio21();
        double[] array = {1.2,66.9,353.2,34.3,42.99,122.0};
        System.out.print("Posições pares do array: ");
        objeto.exercicio21(array);
    }
}
