//Exercício 4: Faça um metodo chamado exercicio4 que recebe um array de String e uma String x
//por parâmetro. Este metodo retorna a posição em que a String x está no array, ou -1 se a
//String x não estiver no array.

package ExercíciosArrays_Algoritmos;
import java.util.Scanner;

public class Exercicio4
{
    int exercicio4(String[] arrayString, String palavra)
    {
        for(int i = 0; i < arrayString.length; i++)
        {
            if(arrayString[i].equalsIgnoreCase(palavra)) return i;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Exercicio4 objeto = new Exercicio4(); //Instanciando o objeto da classe

        String[] palavras = {"arvore", "bola", "sapato", "agua", "cachorro", "elemento"}; //String de palavras

        System.out.print("Entre com a string a ser procurada no array: ");
        String string = sc.nextLine();

        String retorno = Integer.toString(objeto.exercicio4(palavras, string));

        if(objeto.exercicio4(palavras, string) != -1) System.out.print("A posição da string no array é: " + retorno);
        else System.out.print("A string informada não está no array.");
    }

}
