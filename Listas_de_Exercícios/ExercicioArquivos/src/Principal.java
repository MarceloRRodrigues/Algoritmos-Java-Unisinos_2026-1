import java.util.Scanner;
import java.io.*;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Estoque est = new Estoque();

        String arquivo;
        Produto a_maisCaro = new Alimento();
        Produto e_maisBarato = new Eletrodomesticos();
        double maiorPreco = 0, menorPreco = 0;

        System.out.print("Informe o nome do arquivo com os produtos: ");
        arquivo = sc.nextLine();

        est.PreencheEstoque(arquivo);

        for(int i = 0; i < est.cont; i++)
        {
            if(est.array[i] instanceof Alimento) {
                maiorPreco = est.array[i].preco; //Inicializa o maior preço como o preço do primeiro alimento.
                break;
            }
        }

        for(int i = 0; i < est.cont; i++)
        {
            if(est.array[i] instanceof Eletrodomesticos) {
                menorPreco = est.array[i].preco; //Inicializa o menor preço como o preço do primeiro Eletrodomestico.
                break;
            }
        }

        for(int i = 0; i < est.cont; i++)
        {
            if((est.array[i] instanceof Alimento) && (est.array[i].preco >= maiorPreco))
            {
                maiorPreco = est.array[i].preco;
                a_maisCaro = est.array[i];  //Armazena o alimento mais caro
            }
        }

        for(int i = 0; i < est.cont; i++)
        {
            if((est.array[i] instanceof Eletrodomesticos) && (est.array[i].preco <= menorPreco))
            {
                menorPreco = est.array[i].preco;
                e_maisBarato = est.array[i];  //Armazena o eletrodomestico mais barato.
            }
        }

        try{
            File f = new File("info.txt");
            FileWriter fr = new FileWriter(f);
            PrintWriter out = new PrintWriter(fr);
            out.println("O Alimento mais caro é " + a_maisCaro.nome + ". Preço = " + a_maisCaro.preco);
            out.println("O eletrodomestico mais barato é " + e_maisBarato.nome + ". Preço = " + e_maisBarato.preco);
            out.println();
            out.println("Produtos de vestuário:");

            for(int i = 0; i < est.cont; i++)
            {
                if(est.array[i] instanceof Vestuario)
                {
                    out.println(est.array[i].nome + ". Preço = " + est.array[i].preco);
                }
            }
            out.close();

        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo de informações");
        }
    }
}
