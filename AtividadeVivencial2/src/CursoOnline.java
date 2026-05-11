public class CursoOnline extends Curso
{
    String plataforma;
    boolean possuiSuporte;

    public CursoOnline(String nome, int id, Double precoBase)
    {
        super(nome, id, precoBase);
    }

    @Override
    double calcularPrecoFinal() {
        if(possuiSuporte) return precoBase + 100;
        else return precoBase;
    }

    public String toString()
    {
        return ("nome: " + nome + " id: " + id + " Preço Base: " + precoBase + " Preço Final: " + calcularPrecoFinal());
    }
}
