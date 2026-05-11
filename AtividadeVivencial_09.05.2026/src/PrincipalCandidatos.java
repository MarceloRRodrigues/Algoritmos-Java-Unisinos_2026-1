//Nome: Marcelo da Rosa Rodrigues

import java.util.Random;

public class PrincipalCandidatos
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        StaticList<Candidato> candidatos = new StaticList<Candidato>(20);
        String[] nomes = {"Paula", "Marina", "Marcelo", "Pedro", "Sophie", "Marcos", "João", "Filipe","Kleber","Manuela"};
        String[] partidos = {"AAA", "BBB", "CCC", "DDD"};

        int pos = 0;

        System.out.print("Candidatos antes da ordenação: \n");
        //Criação de 20 candidatos
        for(int i = 20; i >=1; i--)
        {
            Candidato c = new Candidato(i, nomes[rand.nextInt(7)], partidos[rand.nextInt(4)], (int) (100*Math.random()));
            candidatos.insert(c, pos);
            System.out.println(c.toString());
            pos++;
        }
        //Ordenando candidatos pelo metodo InsertionSort
        candidatos.insertionSortCandidatos();

        //Printando candidatos após a ordenação
        System.out.print("\nCandidatos depois da ordenação: \n\n");

        for(int i = 0; i < candidatos.numElements; i++)
        {
            System.out.println((candidatos.get(i)).toString());
        }

        //Realizando busca binária por um numero específico de candidato.
        int numero = (int) (Math.random()*100);
        System.out.print("\n\nBuscando candidato número " + numero);

        int retornoBinario = candidatos.pesquisaBinariaCandidatos(numero);

        //Imprimindo resultado da busca binária
        if(retornoBinario != -1)
        {
            System.out.printf("\nO Candidato foi encontrado na posição %d do array: ", retornoBinario);
            System.out.printf(candidatos.get(retornoBinario).toString());
        }
        else System.out.print("\nO Candidato não foi encontrado no array\n");

    }
}
