public class SistemaGestaoCursos
{
    Curso[] cursos = new Curso[10];
    Aluno[] alunos = new Aluno[20];

    public int qtdCursos = 0, qtdAluno = 0;

    public void adicionarCurso(Curso curso) throws LimiteCadastro {
        for (int i = 0; i < cursos.length; i++) {
            if (cursos[i] == null)
            {
                cursos[i] = curso;
                qtdCursos++;
                break;
            }
            if(qtdCursos == 10) throw new LimiteCadastro("o Limite de Cursos já foi atingido.");
        }
    }
    public void adicionarAluno(Aluno aluno) throws LimiteCadastro
    {
        for (int i = 0; i < alunos.length; i++) //percorre alunos, armazena o aluno onde  a posição do vetor for vazia
        {
            if (alunos[i] == null)
            {
                alunos[i] = aluno;
                qtdAluno++;
                break;
            }
            if(qtdAluno == 20) throw new LimiteCadastro("o Limite de alunos já foi atingido.");
        }
    }

    public void listarCursos()
    {
        for (int i = 0; i < qtdCursos; i++) {
            System.out.println(cursos[i].toString());
        }

    }
    public void listarAlunos()
    {
        for (int i = 0; i < qtdAluno; i++) {
            System.out.println(alunos[i].toString());
        }
    }
    public Curso buscarCursoPorId(int id) throws CursoNaoEncontrado
    {
        for (int i = 0; i < qtdCursos; i++)
        {
            if (cursos[i].getId() == id)
            {
                return cursos[i];
            }
        }
        throw new CursoNaoEncontrado("Curso com ID " + id + " não encontrado. Revise o cadastro de alunos.");
    }
}
