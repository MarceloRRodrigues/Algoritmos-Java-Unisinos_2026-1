public class Teste
{
    public static void main(String[] args)
    {
        Exercicios objeto = new Exercicios();
        int[] arrayInt = {23, 345, 21, 89, 76, 55, 52, 784};
        int n = 8;

        try{
            System.out.printf("\nO retorno do Exercício 1 com n = %d é: %b", n, objeto.exercicio1(arrayInt, n));
            n = 55;
            System.out.printf("\nO retorno do Exercício 1 com n = %d é: %b", n, objeto.exercicio1(arrayInt, n));
        }catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
