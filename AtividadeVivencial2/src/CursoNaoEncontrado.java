public class CursoNaoEncontrado extends Exception
{
    private String mensagem;

    public CursoNaoEncontrado(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public String toString()
    {
        return "Exceção: " + mensagem;
    }
}