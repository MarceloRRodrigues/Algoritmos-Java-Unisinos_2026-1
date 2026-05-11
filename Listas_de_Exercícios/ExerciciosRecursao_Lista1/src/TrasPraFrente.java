//• Crie um metodo recursivo que imprime um array recebido por parâmetro de trás
//para frente

public class TrasPraFrente
{

    public static void main(String[] args)
    {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        int posicao = array.length - 1;
        ArrayRecursivo(array, posicao);
    }

    public static void  ArrayRecursivo(int[] array, int posicao)
    {
        if(posicao == 0) System.out.print(array[posicao]);
        else
        {
            System.out.print(array[posicao] + " ");
            ArrayRecursivo(array, posicao - 1);
        }
    }
}
