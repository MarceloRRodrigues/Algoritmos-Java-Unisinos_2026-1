//Exercício 18: Faça um metodo chamado exercicio18 que recebe um array de char e retorna
//uma String que representa o array (por exemplo, para o array de posições ‘G’-‘R’-‘E’-‘M’-‘I’-‘S’-
//‘T’-‘A’, o metodo retorna a String “GREMISTA”).

package ExercíciosArrays_Algoritmos;

public class Exercicio18
{
    String exercicio18(char[] array)
    {
        String palavra = "";
        for(int i = 0; i<array.length; i++)
        {
            palavra = palavra + array[i];
        }
        return palavra;
    }

    public static void main(String[] args)
    {
        Exercicio18 objeto = new Exercicio18();
        char[] array = {'h','o','p','e','l','e','s','s'};

        System.out.print("String do array: ");
        System.out.print(objeto.exercicio18(array));
    }
}
