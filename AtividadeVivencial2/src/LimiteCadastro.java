public class LimiteCadastro extends Exception
{
    private String mensagem;

    public LimiteCadastro(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public String toString()
    {
        return "Exceção: " + mensagem;
    }
}
