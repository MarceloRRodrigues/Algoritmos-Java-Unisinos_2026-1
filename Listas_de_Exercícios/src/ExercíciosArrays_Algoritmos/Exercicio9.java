//Exercício 9: Faça um metodo chamado exercicio9 que recebe um array de inteiros e retorna a
//média de todos os elementos do array.

package ExercíciosArrays_Algoritmos;

public class Exercicio9
{
    double exercicio9(int[] array)
    {
        double soma = 0;
        for(int i = 0; i < array.length; i++)
        {
            soma += array[i];
        }
        return soma/array.length; //Calculo da media dos valores
    }

    public static void main(String[] args)
    {
        Exercicio9 objeto = new Exercicio9(); //Instanciando objeto da classe
        int[] inteiros = {33, 49, 85, 27, 8, 11}; //Array de inteiros

        System.out.printf("A média de todos os elementos do arrays é = %.2f", objeto.exercicio9(inteiros));
    }
}
