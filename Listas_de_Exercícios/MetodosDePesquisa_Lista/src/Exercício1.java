//Mostre (indique a ordem em que as posições são percorridas no próprio vetor)
// os passos realizados pela pesquisa sequencial e pela pesquisa binária no vetor abaixo
// para encontrar o valor 95.

public class Exercício1
{
    public static void main()
    {
        Exercício1 objeto = new Exercício1();
        int[] array = new int[]{10, 34 ,65 ,76 ,78 , 81, 86, 87, 90, 95, 104, 120};

        int retornoSequencial = objeto.PesquisaSequencial(95, array);

        if(retornoSequencial != -1)
        {
            System.out.printf("\nO número foi encontrado na posição %d do array (Pesquisa Sequencial)\n", retornoSequencial);
        }
        else System.out.print("\nO número não foi encontrado no array (Pesquisa Binária\n");

        int retornoBinario = objeto.PesquisaBinaria(95, array);

        if(retornoBinario != -1)
        {
            System.out.printf("\nO número foi encontrado na posição %d do array (Pesquisa Binária)\n", retornoBinario);
        }
        else System.out.print("\nO número não foi encontrado no array (Pesquisa Binária)\n");
    }

    public int PesquisaSequencial(int arg, int[] array)
    {
        System.out.println("Iniciando Pesquisa Sequencial...");
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("Verificando a posição %d...\n", i);
            if(array[i] == arg) return i;
        }
        return -1;
    }

    public int PesquisaBinaria(int arg, int[] array)
    {
        System.out.print("\nIniciando Pesquisa Binária...");
        int inf = 0, sup = array.length-1;
        int media;

        while(inf <= sup)
        {
            media = (inf + sup) /2;
            System.out.printf("\nverificando a posição %d do array", media);

            if(arg < array[media]) sup = media - 1;
            else if(arg > array[media])  inf = media +1;
            else return media;
        }
        return -1;
    }
}
