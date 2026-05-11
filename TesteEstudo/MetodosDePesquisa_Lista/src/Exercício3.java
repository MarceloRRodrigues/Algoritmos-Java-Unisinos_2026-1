//Crie uma versão RECURSIVA do metodo de Pesquisa Binária (baseado na implementação vista em aula).

public class Exercício3
{
    public static void main()
    {
        Exercício3 objeto = new Exercício3();
        int[] array = new int[]{10, 34, 65, 76, 78, 81, 86, 87, 90, 95, 104, 120};

        int retornoBinario = objeto.PesquisaBinaria(87, array);

        if(retornoBinario != -1)
        {
            System.out.printf("\nO número foi encontrado na posição %d do array (Pesquisa Binária)\n", retornoBinario);
        }
        else System.out.print("\nO número não foi encontrado no array (Pesquisa Binária)\n");
    }

    //Métodos recursivos
    public int PesquisaBinaria(int arg, int[] array)
    {
        int inf = 0, sup = array.length-1;
        return PesquisaBinaria(arg, array, inf, sup);
    }

    private int PesquisaBinaria(int arg, int[] array, int inf, int sup)
    {
        if(inf>sup) return -1; //caso base
        int media = (inf + sup) / 2; //recalcula média
        System.out.printf("\nverificando a posição %d do array", media); //mostra posição atual

        if(arg == array[media]) return media; //segundo caso base, caso o número seja encontrado

        //recursão
        if(arg < array[media]) return PesquisaBinaria(arg, array, inf, media -1);
        else return PesquisaBinaria(arg, array, media +1, sup);
    }
}
