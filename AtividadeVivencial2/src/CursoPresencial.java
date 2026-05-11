public class CursoPresencial extends Curso
{
    String local;
    int cargaHoraria;

    public CursoPresencial(String nome, int id, Double precoBase)
    {
        super(nome, id, precoBase);
    }

    @Override
    double calcularPrecoFinal() {
        return (precoBase + 20*cargaHoraria);
    }

    public String toString()
    {
        return ("nome: " + nome + " id: " + id + " Preço Base: " + precoBase + " Preço Final: " + calcularPrecoFinal());
    }
}
