//Exercício 12: Faça um metodo chamado exercicio12 que recebe um array de double e retorna
//true caso algum elemento seja negativo, e false caso todos sejam positivos

package ExercíciosArrays_Algoritmos;

//retorna true caso algum elemento do array recebido seja negativo, e false caso todos sejam positivos

public class Exercicio12
{
    boolean exercicio12(double[] array)
    {
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] < 0) return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Exercicio12 objeto = new Exercicio12();
        double[] array = {34.5,567.99,211.3,5.2,66.5};

        System.out.printf("O retorno do método é: %b", objeto.exercicio12(array));
    }
}
