import java.io.*;
import java.util.Arrays;

public class Estoque
{
    Produto[] array;
    int cont = 0, pos = 0;

    void PreencheEstoque(String arquivo)
    {
        try
        {
            FileReader fr = new FileReader(arquivo);
            BufferedReader in = new BufferedReader(fr);
            String line = in.readLine(); //lendo (e pulando) a primeira linha, que é o cabeçalho do arquivo.

            while(line != null) // enquanto o arquivo não acabar...
            { //identifica a quantidade de produtos no arquivo. Armazena em cont.
                line = in.readLine();
                cont++;
            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        try
        {
            FileReader fr = new FileReader(arquivo);
            BufferedReader in = new BufferedReader(fr);
            String line = in.readLine(); //lendo (e pulando) a primeira linha, que é o cabeçalho do arquivo.
            array = new Produto[cont]; //Cria o array de produtos com o tamanho definido em cont.

            while((line = in.readLine()) != null) // enquanto o arquivo não acabar...
            {
                String[] separada = line.split("\\s\\*\\s"); // Quer armazenar objetos dentro do array Produto. O array separada irá definir os atributos dos objetos.

                if (separada[3].equals("Alimento")) {
                    Alimento a = new Alimento();
                    array[pos] = a; //cria um objeto do tipo Alimento, armazenando o Produto
                    a.nome = separada[0];
                    a.descricao = separada[1];
                    a.preco = Double.parseDouble(separada[2]);
                    a.validade = separada[4];
                }
                else if (separada[3].equals("Vestuario")) {
                    Vestuario v = new Vestuario(); //indica que o produto é vestuário
                    array[pos] = v; //cria um objeto do tipo Alimento, armazenando o Produto
                    v.nome = separada[0];
                    v.descricao = separada[1];
                    v.preco = Double.parseDouble(separada[2]);
                    v.quantidadeEstoque = Integer.parseInt(separada[4]);

                }
                else if (separada[3].equals("Eletrodomestico")) {
                    Eletrodomesticos e = new Eletrodomesticos();
                    array[pos] = e;
                    e.nome = separada[0];
                    e.descricao = separada[1];
                    e.preco = Double.parseDouble(separada[2]);
                    e.valorIPI = Double.parseDouble(separada[4]);
                }
                pos++; //avança posição do array a ser preenchida.
            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
