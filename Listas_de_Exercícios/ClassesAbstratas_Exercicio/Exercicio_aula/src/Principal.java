public class Principal
{
    static void main()
    {
        //instanciando objetos com upcasting
        Figura r = new Retangulo("vermelho");
        Figura t = new Triangulo("amarelo");
        Figura c = new Circulo("azul");

        //Medidas com dowcasting
        //Retangulo
        ((Retangulo)r).setBase(5.2);
        ((Retangulo)r).setAltura(4);

        //Triangulo
        ((Triangulo)t).setBase(7);
        ((Triangulo)t).setAltura(6);
        ((Triangulo)t).setLado1(7);
        ((Triangulo)t).setLado2(8.2);

        //Circulo
        ((Circulo)c).setRaio(3.5);

        //Dados retangulo
        System.out.println("Dados do retangulo: ");
        System.out.println(r.getCor());
        System.out.printf("Área = %.2f\n", r.calculaArea());
        System.out.printf("Perímetro = %.2f\n", r.calculaPerimetro());

        System.out.printf("\n");

        //Dados Triangulo
        System.out.println("Dados do Triangulo: ");
        System.out.println(t.getCor());
        System.out.printf("Área = %.2f\n", t.calculaArea());
        System.out.printf("Perímetro = %.2f\n", t.calculaPerimetro());

        System.out.printf("\n");

        //Dados Circulo
        System.out.println("Dados do Circulo: ");
        System.out.println(c.getCor());
        System.out.printf("Área = %.2f\n", c.calculaArea());
        System.out.printf("Perímetro = %.2f\n", c.calculaPerimetro());
    }
}
