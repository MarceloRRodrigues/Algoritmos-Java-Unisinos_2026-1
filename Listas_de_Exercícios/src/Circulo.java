public class Circulo extends Figura
{
        public Circulo(String cor) //Construtor
        {
            super(cor);
        }

        public void setRaio(double raio) {
        this.raio = raio;
        }

        private double raio;
        private final double pi = 3.14;

@Override
        public double calculaArea() {
            return pi*(raio*raio);
        }

        @Override
        public double calculaPerimetro() {
            return 2*pi*raio;
        }



    }


