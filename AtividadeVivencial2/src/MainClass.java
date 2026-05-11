import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        SistemaGestaoCursos sistema = new SistemaGestaoCursos();

            //Upcasting
            Curso c1 = new CursoPresencial("Ciência da Computação", 10, 1200.0);
            Curso c2 = new CursoOnline("Psicologia", 20, 900.0);
            Curso c3 = new CursoPresencial("Engenharia Civil", 30, 1500.0);
            Curso c4 = new CursoOnline("Nutrição", 40, 1000.0);
            Curso c5 = new CursoPresencial("Ciência da Computação", 50, 1200.0);
            Curso c6 = new CursoOnline("Psicologia", 60, 900.0);
            Curso c7 = new CursoPresencial("Engenharia Civil", 70, 1500.0);
            Curso c8 = new CursoOnline("Nutrição", 80, 1000.0);
            Curso c9 = new CursoPresencial("Ciência da Computação", 90, 1200.0);
            Curso c10 = new CursoOnline("Psicologia", 100, 900.0);
            Curso c11 = new CursoPresencial("Engenharia Civil", 110, 1500.0);
            Curso c12 = new CursoOnline("Nutrição", 120, 1000.0);

            try
            {
                sistema.adicionarCurso(c1);
                sistema.adicionarCurso(c2);
                sistema.adicionarCurso(c3);
                sistema.adicionarCurso(c4);
                sistema.adicionarCurso(c5);
                sistema.adicionarCurso(c6);
                sistema.adicionarCurso(c7);
                sistema.adicionarCurso(c8);
                sistema.adicionarCurso(c9);
                sistema.adicionarCurso(c10);
                sistema.adicionarCurso(c11);
                sistema.adicionarCurso(c12);
            }catch(LimiteCadastro e0)
            {
                sistema.listarCursos();
                System.out.println(e0);
            }

            try
            {
                Aluno a1 = new Aluno(1, "Marcelo", sistema.buscarCursoPorId(10), new double[]{10.0, 6.2, 7.1, 5.2});
                Aluno a2 = new Aluno(2, "Filipe", sistema.buscarCursoPorId(40), new double[]{10.0, 8.4, 6.8, 9.2});
                Aluno a3 = new Aluno(3, "Julia", sistema.buscarCursoPorId(20), new double[]{10.0, 8.2, 4.1, 7.2});
                Aluno a4 = new Aluno(4, "Fernanda", sistema.buscarCursoPorId(30), new double[]{8.0, 6.2, 9.5, 5.5});
                Aluno a5 = new Aluno(5, "Paulo", sistema.buscarCursoPorId(20), new double[]{3.4, 5.2, 7.1, 3.4});
                Aluno a6 = new Aluno(6, "Joao", sistema.buscarCursoPorId(30), new double[]{9.6, 10.0, 6.8, 10.0});
                Aluno a7 = new Aluno(7, "Mateus", sistema.buscarCursoPorId(40), new double[]{2.3, 8.7, 4.8, 7.0});
                Aluno a8 = new Aluno(8, "Manuela", sistema.buscarCursoPorId(10), new double[]{8.3, 4.4, 5.6, 9.7});
                Aluno a9 = new Aluno(9, "Marcelo", sistema.buscarCursoPorId(10), new double[]{10.0, 6.2, 7.1, 5.2});
                Aluno a10 = new Aluno(10, "Filipe", sistema.buscarCursoPorId(40), new double[]{10.0, 8.4, 6.8, 9.2});
                Aluno a11 = new Aluno(11, "Julia", sistema.buscarCursoPorId(20), new double[]{10.0, 8.2, 4.1, 7.2});
                Aluno a12 = new Aluno(12, "Fernanda", sistema.buscarCursoPorId(30), new double[]{8.0, 6.2, 9.5, 5.5});
                Aluno a13 = new Aluno(13, "Paulo", sistema.buscarCursoPorId(20), new double[]{3.4, 5.2, 7.1, 3.4});
                Aluno a14 = new Aluno(14, "Joao", sistema.buscarCursoPorId(30), new double[]{9.6, 10.0, 6.8, 10.0});
                Aluno a15 = new Aluno(15, "Mateus", sistema.buscarCursoPorId(40), new double[]{2.3, 8.7, 4.8, 7.0});
                Aluno a16 = new Aluno(16, "Manuela", sistema.buscarCursoPorId(10), new double[]{8.3, 4.4, 5.6, 9.7});
                Aluno a17 = new Aluno(17, "Marcelo", sistema.buscarCursoPorId(10), new double[]{10.0, 6.2, 7.1, 5.2});
                Aluno a18 = new Aluno(18, "Filipe", sistema.buscarCursoPorId(40), new double[]{10.0, 8.4, 6.8, 9.2});
                Aluno a19 = new Aluno(19, "Julia", sistema.buscarCursoPorId(20), new double[]{10.0, 8.2, 4.1, 7.2});
                Aluno a20 = new Aluno(20, "Fernanda", sistema.buscarCursoPorId(30), new double[]{8.0, 6.2, 9.5, 5.5});
                Aluno a21 = new Aluno(21, "Paulo", sistema.buscarCursoPorId(20), new double[]{3.4, 5.2, 7.1, 3.4});


                try
                {
                    sistema.adicionarAluno(a1);
                    sistema.adicionarAluno(a2);
                    sistema.adicionarAluno(a3);
                    sistema.adicionarAluno(a4);
                    sistema.adicionarAluno(a5);
                    sistema.adicionarAluno(a6);
                    sistema.adicionarAluno(a7);
                    sistema.adicionarAluno(a8);
                    sistema.adicionarAluno(a9);
                    sistema.adicionarAluno(a10);
                    sistema.adicionarAluno(a11);
                    sistema.adicionarAluno(a12);
                    sistema.adicionarAluno(a13);
                    sistema.adicionarAluno(a14);
                    sistema.adicionarAluno(a15);
                    sistema.adicionarAluno(a16);
                    sistema.adicionarAluno(a17);
                    sistema.adicionarAluno(a18);
                    sistema.adicionarAluno(a19);
                    sistema.adicionarAluno(a20);
                    sistema.adicionarAluno(a21);
                }
                catch(LimiteCadastro e1)
                {
                    sistema.listarAlunos();
                    System.out.println(e1);
                }

            } catch (CursoNaoEncontrado e)
            {
                System.out.println(e.toString());
            }



    }
}
