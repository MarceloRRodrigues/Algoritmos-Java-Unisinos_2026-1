//Exercício 8: Faça um metodo chamado exercicio8 que recebe um array de char e imprime na
//tela (na mesma linha) todos os elementos do array.

package ExercíciosArrays_Algoritmos;

public class Exercicio8
{
    void exercicio8(char[] array) //Imprime cada caractere do array na tela, na mesma linha.
    {
        for(int i = 0; i < array.length; i++) System.out.printf("%c ", array[i]);

    }

    public static void main(String[] args)
    {
        Exercicio8 objeto = new Exercicio8(); //Instanciando objeto da classe
        char[] caracteres ={'a','b','c','d','e'}; //Vetor de caracteres recebido

        objeto.exercicio8(caracteres);
    }


}
