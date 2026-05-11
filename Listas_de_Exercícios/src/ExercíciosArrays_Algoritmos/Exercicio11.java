//Exercício 11: Faça um metodo chamado exercicio11 que recebe um array de inteiros e um
//inteiro x e retorna o elemento da posição x do array.

package ExercíciosArrays_Algoritmos;

import java.util.Scanner;

public class Exercicio11
{
    int exercio11(int[] inteiros, int numero)
    {
        int i;
        for(i = 0; i<inteiros.length; i++)
        {
            if(inteiros[i] == numero) return i;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        Exercicio11 objeto = new Exercicio11();
        int[] inteiros = {23,46,23,12,45,67,65,22,14};

        System.out.print("Informe o número a ser encontrado no array: ");
        num = sc.nextInt();

        if(objeto.exercio11(inteiros, num) == -1) System.out.print("O número não está no array.");
        else System.out.printf("O número está na posição %d do Array.", objeto.exercio11(inteiros, num));
    }
}
