//Crie um metodo chamado encontraPosicaoMenorValor. Este método deve
//encontrar a posição do menor valor de um array de inteiros V (recebido por
//parâmetro). Por exemplo, digamos que o array abaixo seja passado por parâmetro:
//{23, 35, 16, 8, 13, 11, 10, 20, 9, 12}
//O metodo, neste caso, retornaria o valor 3

public class PosicaoMenorValor
{
    public static void main(String[] args)
    {
        PosicaoMenorValor objeto = new PosicaoMenorValor();

        int[] array = {12,9,73,84,43,30};
        int pos = 0, menorPos = 0;
        System.out.println(objeto.encontraPosicaoMenorValor(array, pos, menorPos));
    }
    public int encontraPosicaoMenorValor(int[] array, int pos, int menorPos)
    {
        //Se a posição atual é o menor valor, os dados são armazenados.
        if(array[pos] < array[menorPos]) menorPos = pos;

        if(pos == array.length - 1) return menorPos; //BASE = para a recursão ao fim do array, retorna  a menor posição.
        return encontraPosicaoMenorValor(array, pos+1, menorPos); //avança para a próxima posição do array
    }
}
