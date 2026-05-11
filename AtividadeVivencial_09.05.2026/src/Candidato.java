//Nome: Marcelo da Rosa Rodrigues

public class Candidato
{
    private int numero;
    private String nome;
    private String partido;
    private int intencoesVoto;

    public Candidato(int numero, String nome, String partido, int intencoesVoto) {
        this.numero = numero;
        this.nome = nome;
        this.partido = partido;
        this.intencoesVoto = intencoesVoto;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public int getIntencoesVoto() {
        return intencoesVoto;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", partido='" + partido + '\'' +
                ", intencoesVoto=" + intencoesVoto +
                '}';
    }
}
