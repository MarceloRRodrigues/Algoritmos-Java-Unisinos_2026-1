//Exercício 17: Faça um metodo chamado exercicio17 que recebe dois arrays de inteiros e
//retorna true caso eles sejam iguais e false caso sejam diferentes.

package ExercíciosArrays_Algoritmos;

public class Exercicio17
{
    boolean exercicio17(int[] array1, int[] array2)
    {
        int aux = 0;
        if(array1.length == array2.length)
        {
            for(int i = 0; i<array1.length; i++)
            {
                if(array1[i] != array2[aux]) return false;
                aux++;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Exercicio17 objeto = new Exercicio17();
        int[] array1 = {1,2,3,4,5,7};
        int[] array2 = {1,2,1,4,5,7};

        if(objeto.exercicio17(array1,array2)) System.out.print("Os arrays são iguais.");
        else System.out.print("Os arrays são diferentes.");
    }
}
