package ExemplosArrays;

import java.util.Scanner;

public class ProcuraNomes { //Metodo para procurar um nome especifico em um array de strings
   static int procuraNome(String[] nomes, String nome)
   {
    for(int i = 0; i < nomes.length; i++)
    {
        if (nomes[i].equalsIgnoreCase(nome)) return i;
    }
    System.out.println("O nome não está incluído na lista.");
    return -1;
   }


    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       //Alterar array conforme desejado.
        String[] listaNomes = {"Marcelo", "Filipe","Maria","Joana","Kleber","Lucas","Barbara"}; //Define que listaNomes é um array de strings e inicializa com valore

        System.out.print("Entre com o nome a ser buscado: ");
        String nome = sc.nextLine(); //recebe nome a ser procurado

        if(procuraNome(listaNomes, nome) != -1) System.out.println("O nome está localizado na posição " + procuraNome(listaNomes, nome));
    }
}
