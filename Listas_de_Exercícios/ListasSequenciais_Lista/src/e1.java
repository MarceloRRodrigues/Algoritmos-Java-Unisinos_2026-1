//Implemente um metodo, em uma classe qualquer, que receba como parâmetro uma
//lista sequencial de números inteiros (objetos do tipo Integer) e retorne um vetor
//contendo apenas os números pares desta lista. Para isso utilize a seguinte assinatura:
//public Integer[] evenNumbers(List<Integer> lista)

import java.util.Arrays;

public class e1
{
    public static void main()
    {
        e1 objeto = new e1();

        int tamanho_lista = 10;
        int elemento = 10;
        List<Integer> lista= new StaticList<>(tamanho_lista); //instancia com o tipo Integer

        for(int i = 0; i< tamanho_lista; i++) //preenche a lista com valores aleatórios de 5 em 5.
        {
            lista.insert(elemento, i);
            elemento = elemento + 5;
        }
        System.out.print(Arrays.toString(objeto.evenNumbers(lista))); //printa o retorno da função evenNumbers
    }

    public Integer[] evenNumbers(List<Integer> lista)
    {
        int qtd_pares = 0;
        for(int i = 0; i<lista.numElements(); i++) //percorre os elementos da lista
        {
            if((lista.get(i) % 2) == 0) qtd_pares++; //se for par, soma a quantidade de pares.
        }

        Integer[] array = new Integer[qtd_pares]; //instancia array de Integer.
        int pos = 0;

        for(int i = 0; i<lista.numElements(); i++) //armazena os pares no array
        {
            if((lista.get(i) % 2) == 0)
            {
                array[pos] = lista.get(i);
                pos++;
            }
        }
        return array;
    }
}