//Exercício 10: Faça um metodo chamado exercicio10 que recebe um array de inteiros e retorna
//a média de todos os elementos pares do array.

package ExercíciosArrays_Algoritmos;

public class Exercicio10
{
    double exercicio10(int[] array)
    {
        double soma = 0, pares = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
            {
                soma += array[i];
                pares++;
            }
        }
        return soma/pares; //Calculo da media dos valores
    }

    public static void main(String[] args)
    {
        Exercicio10 objeto = new Exercicio10(); //Instanciando objeto da classe
        int[] inteiros = {33, 49, 85, 27, 8, 1, 2, 4}; //Array de inteiros
        System.out.printf("A média de todos os elementos PARES do arrays é = %.2f", objeto.exercicio10(inteiros));
    }

}
