public class Triangulo extends Figura
{
        public Triangulo(String cor) //Construtor
        {
            super(cor);
        }

    private double base, altura, lado1, lado2;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }


        @Override
        public double calculaArea() {
            return (base * altura)/2;
        }

        @Override
        public double calculaPerimetro() {
            return (base+lado1+lado2);
        }

}
