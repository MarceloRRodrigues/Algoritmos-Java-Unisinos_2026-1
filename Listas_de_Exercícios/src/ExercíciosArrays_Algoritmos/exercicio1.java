//Exercício 1: Faça um metodo chamado exercicio1 que recebe um array de inteiros e imprima-o
//ao contrário

package ExercíciosArrays_Algoritmos;

//O metodo imprime as posições do vetor ao contrário.

public class Exercicio1 {

    void exercicio1(int[] inteiros)
    {
        System.out.print("Vetor ao contrário: ");
        for(int i = (inteiros.length) - 1; i >= 0; i--)
        {
            System.out.printf("%d ", inteiros[i]);
        }
    }

    public static void main(String[] args)
    {
        Exercicio1 objeto = new exercicio1();
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        objeto.exercicio1(vetor);
    }

}
