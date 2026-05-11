//Exercício 19: Faça um metodo chamado exercicio19 que recebe um inteiro e retorna um array
//de String preenchido com valores recebidos via Teclado.

package ExercíciosArrays_Algoritmos;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio19
{
    Scanner sc = new Scanner(System.in);

    String[] exercicio19(int inteiro)
    {
        String[] arrayStrings = new String[inteiro];
        System.out.printf("Recebendo %d strings...\n", inteiro);
        for(int i = 0; i < inteiro; i++)
        {
            System.out.printf("String %d: ", i+1);
            arrayStrings[i] = sc.nextLine();
        }
        return arrayStrings;
    }

    public static void main(String[] args)
    {
        Exercicio19 objeto = new Exercicio19();

        System.out.print("Entre com o número de strings do array: ");
        int numero = objeto.sc.nextInt(); //Recebendo o inteiro
        objeto.sc.nextLine();

        String[] array = objeto.exercicio19(numero); //Executando metodo

        System.out.print("O array de strings foi preenchido -->  "); //Exibindo  array de string
        System.out.print(Arrays.toString(array));
    }
}
