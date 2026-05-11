//Crie um metodo recursivo chamado printPrimaryDiagonal, que imprime a
//diagonal primária de uma matriz qualquer. No metodo público, apenas a matriz
//deve ser passada por parâmetro.

import com.sun.source.tree.TryTree;

public class DiagonalMatriz
{
    public static void main(String[] args)
    {
        DiagonalMatriz objeto = new DiagonalMatriz();

        int matriz[][] = {{10,  7, 7,   6},
                          { 7, 85, 4,  90},
                          {67, 89,37, 345},
                          {23, 35,66, 747}};
        try
        {
            System.out.print(objeto.MostraDiagonal(matriz));
        }catch(MatrixNotPossibleException m)
        {
            System.out.print(m.getMessage());
        }
    }

    public String MostraDiagonal(int[][] matriz) throws MatrixNotPossibleException
    {
        int linha_coluna = 0;

            if (matriz.length != matriz[0].length) { //Joga exceção caso a matriz não possuir mesmo tamanho de linhas e colunas
                MatrixNotPossibleException m = new MatrixNotPossibleException("Erro: Matriz não é quadrada.");
                throw m;
            }
        return MostraDiagonal(matriz, linha_coluna);
    }

    private String MostraDiagonal(int[][] matriz, int linha_coluna)
    {
        //Verifica caso base (final da matriz). Nesse caso, retorna-se o elemento
        if (linha_coluna == (matriz.length - 1)) return " " + matriz[linha_coluna][linha_coluna];

        //retorna-se o valor atual + o metodo em si, que continuará a operação.
        return (" " + matriz[linha_coluna][linha_coluna]) + MostraDiagonal(matriz, linha_coluna+1);
    }

    public static class MatrixNotPossibleException extends Exception
    {
        public MatrixNotPossibleException(String message)
        {
            super(message);
        }

        @Override
        public String toString() {
            return getMessage();
        }
    }
}
