//Mostre (indique a ordem em que as posições são percorridas no próprio vetor)
// os passos realizados pela pesquisa binária no vetor abaixo para encontrar o valor 12.

public class Exercício2
{
    public static void main()
    {
        Exercício2 objeto = new Exercício2();
        int[] array = new int[]{10, 34, 65, 76, 78, 81, 86, 87, 90, 95, 104, 120};

        int retornoBinario = objeto.PesquisaBinaria(12, array);

        if(retornoBinario != -1)
        {
            System.out.printf("\nO número foi encontrado na posição %d do array (Pesquisa Binária)\n", retornoBinario);
        }
        else System.out.print("\nO número não foi encontrado no array (Pesquisa Binária)\n");
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
