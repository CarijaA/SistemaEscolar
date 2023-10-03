import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GerenciaProfessor extends GerenciaAluno {
    Scanner ler = new Scanner(System.in);
    List<Professor> listaProfessor = new ArrayList<Professor>();

    public void criaProfessor(String nome, double salario) {
        try {
            Professor novoProfessor = new Professor();
            novoProfessor.setNome(nome);
            novoProfessor.setSalario(salario);
            listaProfessor.add(novoProfessor);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void administraNota(int id) {
        try {
            boolean alunoEncontrado = false;
            for (Aluno aluno : listaAluno) {
                if (aluno.getCod() == id) {
                    System.out.println("Qual será a nova nota?");
                    double notaLida = ler.nextDouble();
                    aluno.setNota(notaLida);
                    alunoEncontrado = true;
                    break;
                }
            }
            if (!alunoEncontrado) {
                System.out.println("Usuário não encontrado");
            }
        } catch (Exception e) {
            System.err.println("Entrada inválida. Certifique-se de inserir um número válido.");
        }
    }
}
