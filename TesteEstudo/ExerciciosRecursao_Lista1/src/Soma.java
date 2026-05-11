//• Crie um metodo recursivo que recebe um array bidimensional de double e
//retorna a soma dos elementos deste array

public class Soma
{
    public static void main(String[] args)
    {
        Soma objeto = new Soma();

        double[][] array = new double[][]{{3,  4,  6,   5},
                                          {2, 23, 24,  78},
                                          {5,  2,  8, 9.5}};

        //variáveis
        int linha = 0, coluna = 0;

        System.out.println("A soma é " + objeto.somaElementos(array, linha, coluna));
    }

    public double somaElementos(double[][] array, int linha, int coluna)
    {
        if (linha == array.length) return 0; //BASE: após a soma do último elemento, retorna-se 0.

        if(coluna < (array[0].length - 1))  return array[linha][coluna] + somaElementos(array, linha, coluna+1);
        return array[linha][coluna] + somaElementos(array, linha+1, 0);
    }
}
