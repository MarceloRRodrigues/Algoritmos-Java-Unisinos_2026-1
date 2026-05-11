
import java.util.Scanner;

public class Produto {
    private int codigo, quantidade = 0;
    private String descricao = "";
    private double peso = 0;
    private static final Scanner sc = new Scanner(System.in);


    public Produto(int codigo, int quantidade, String descricao, double peso) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.peso = peso;
    }

    // (opcional) getters para imprimir/usar depois
    public int getCodigo() { return codigo; }
    public int getQuantidade() { return quantidade; }
    public String getDescricao() { return descricao; }
    public double getPeso() { return peso; }

    public static boolean armazenarProduto(Produto[][] estoque) {
        //


        System.out.println("\nQual o corredor e a posição: ");
        int cor = sc.nextInt();
        int pos = sc.nextInt();
        //sc.nextLine();
        //System.out.println(cor + pos);
        System.out.printf("cor: %d | pos: %d", cor, pos);
        //verificar		return
        if (estoque[cor][pos] != null) {

            System.out.printf("\nJá existe produto em (%d,%d): %s%n", cor, pos, estoque[cor][pos].codigo);


            return false;
        }
        System.out.println("\nEntre com codigo: ");
        int cod= sc.nextInt();
        System.out.println("\nEntre com descruicao: ");
        String dec= sc.next();
        System.out.println("\nEntre com quantidade: ");
        int qtd= sc.nextInt();
        System.out.println("\nEntre com peso: ");
        Double pes= sc.nextDouble();
        sc.nextLine();

        estoque[cor][pos] = new Produto(cod, qtd, dec, pes);


        System.out.printf("%s%n", estoque[cor][pos].codigo); // ou
        //System.out.printf(estoque[0].length); // ou
        //sc.close();

        return true;




    }

    public static boolean BuscaMatriz(Produto[][] estoque, int cod) {
        for(int i=0; i<4; i++) {
            for(int j=0; j<5; j++) {
                if (estoque[i][j] != null) {
                    if (estoque[i][j].codigo == cod) {
                        System.out.printf("\nCorredor: %d  Posicao: %d \n Codigo: %d Descricao: %s, Quantidade: %d, Peso: %.2f", i, j, estoque[i][j].codigo, estoque[i][j].descricao, estoque[i][j].quantidade, estoque[i][j].peso);;
                    }
                }

            }
        }
        return true;
    }


    public static boolean ExibeMatriz(Produto[][] estoque) {
        for(int i=0; i<4; i++) {
            for(int j=0; j<5; j++) {


                String codStr = (estoque[i][j] == null) ? "vazio" : String.valueOf(estoque[i][j].getCodigo());
                System.out.printf("\ncor: %d, pos: %d, cod: %s | ", i, j, codStr);

            }
            System.out.println();
        }
        return true;
    }

    public static boolean RemoverProduto(Produto[][] estoque) {
        System.out.println("\nQual produto remover: ");
        int cor = sc.nextInt();
        int pos = sc.nextInt();
        System.out.printf("cor: %d | pos: %d", cor, pos);
        //verificar
        if (estoque[cor][pos] == null) {

            System.out.printf("\nNão existe produto em (%d,%d)", cor, pos);

            return false;
        }

        System.out.printf("\nRemovendo de (%d,%d): %d", cor, pos, estoque[cor][pos].codigo);
        estoque[cor][pos] = null;

        System.out.println("\nRemovido com sucesso.");
        return true;
    }


    public static void main(String[] args) {
        System.out.print("Oii, nossos nomes são Marina Jardim e Marcelo Rodrigues");
        System.out.printf("\nAula vivencial 1: 28/02\n Menu de opções: \n 1 - Armazenar Produto \n 2 - Listar mapa completo de estoque \n 3 - Buscar produto pelo código \n 4 - Remover produto \n 5 - encerrar o programa");

        Produto[][] estoque = new Produto[4][5];
        int opcao = 0;

        do {
            System.out.printf("Escolha uma opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> {armazenarProduto(estoque);
                    break;}
                case 2 -> {ExibeMatriz(estoque);
                    break;}
                case 3 -> {
                    //System.out.print("Código para busca: ");
                    int cod = sc.nextInt();
                    sc.nextLine();
                    BuscaMatriz(estoque, cod);
                    break;
                }
                case 4 -> {RemoverProduto(estoque); break;}
                case 5 -> {
                    System.out.println("Encerrando...");
                    break;
                }
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

    }

}

