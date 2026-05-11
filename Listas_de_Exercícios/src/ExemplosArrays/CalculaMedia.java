package ExemplosArrays;

public class CalculaMedia //Metodo para calcular a média dos valores de um Array de números
{
    double CalculaMedia(double[] vetor)
    {
        double soma = 0, media;
        for(int i = 0; i < vetor.length; i++)
        {
            soma = soma + vetor[i];
        }
        media = soma/vetor.length;
        return media;
    }


    public static void main(String[] args)
    {
        CalculaMedia obj = new CalculaMedia();
        //Alterar array conforme desejado.
        double[] valores = new double[]{1.2, 3.5, 6.7, 5, 7.2, 6.4}; //Instanciando e inicializando valores

        System.out.printf("A média dos valores é = %.2f", obj.CalculaMedia(valores));
    }
}
