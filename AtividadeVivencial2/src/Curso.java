abstract public class Curso
{
    int id;
    String nome;
    Double precoBase;

    public Curso(String nome, int id, Double precoBase) {
        this.nome = nome;
        this.id = id;
        this.precoBase = precoBase;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    abstract double calcularPrecoFinal();

    @Override
    public String toString() {
        return ("nome: " + nome + " id: " + id + " Preço Base: " + precoBase);
    }
}
