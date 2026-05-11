public class Retangulo extends Figura
{
    public Retangulo(String cor) //Construtor
    {
        super(cor);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double base, altura;

    @Override
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public double calculaPerimetro() {
        return 2*base + 2*altura;
    }
}
