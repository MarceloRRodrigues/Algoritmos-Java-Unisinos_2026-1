import java.util.Arrays;

/**/

public class Aluno implements Avaliavel
{
    int id;
    String nome;
    Curso cursoMatriculado;
    double[] notas;

    public Aluno(int id, String nome, Curso cursoMatriculado, double[] notas) {
        this.id = id;
        this.nome = nome;
        this.cursoMatriculado = cursoMatriculado;
        this.notas = notas;
    }

    @Override
    public double calcularMedia() {
        double media = 0;
        for(int i = 0; i < notas.length; i++)
        {
            media = media + notas[i];
        }
        media = media/notas.length;
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cursoMatriculado=" + cursoMatriculado +
                ", notas=" + Arrays.toString(notas) +
                ", media final= " + calcularMedia() + '}';
    }
}
