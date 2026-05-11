//Exercício 20: Faça um metodo chamado exercicio20 que recebe um array de String e um
//inteiro x. Este metodo exclui (se possível) o elemento da posição, “tapando o buraco” que
//eventualmente possa ter ficado no array. Este metodo retorna o array sem o elemento da
//posição x.

package ExercíciosArrays_Algoritmos;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio20
{
    String[] exercicio20(String[] array, int x)
    {
        String[] novaString = new String[array.length -1];

            if(x == 0) //remoção no início do array
            {
                for(int i = 0; i < (novaString.length); i++) novaString[i] = array[i+1];
            }
            else if(x == (array.length - 1)) //Remoção no final do array
            {
                for(int i = 0; i < (novaString.length); i++) novaString[i] = array[i];
            }
            else //Remoção no meio do array
            {
                for(int i = 0; i < (novaString.length); i++)
                {
                    if(i == x || i > x) novaString[i] = array[i+1];
                    else novaString[i] = array[i];
                }
            }
        return novaString;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Exercicio20 objeto = new Exercicio20();
        String[] arrayStrings = {"teste","unisinos","Marcelo","algoritmos","4semestre","cienciaDaComputação"};

        System.out.print("Array de strings: "); //Exibindo o array de strings
        System.out.println(Arrays.toString(arrayStrings));

        System.out.print("Entre com a posição do array a ser apagada: "); //Coletando a posição a ser apagada.
        int pos = sc.nextInt();

        System.out.print(Arrays.toString(objeto.exercicio20(arrayStrings, pos)));
    }
}
