import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class GerenciaAluno {
    Random r1 = new Random();
    List<Aluno> listaAluno = new ArrayList<Aluno>();
    Scanner ler = new Scanner(System.in);

    // Aluno novoAluno = new Aluno(r1.nextInt(10));

    public void cadastraAluno(String nome, String dataNascimento, int id) {
        Aluno novoAluno = new Aluno();
        novoAluno.setNome(nome);
        novoAluno.setDataNascimento(dataNascimento);
        novoAluno.setCod(id);
        listaAluno.add(novoAluno);
    }

    public void excluirAluno(int id) {
        try {
            for (Aluno aluno : listaAluno
            ) {
                if (aluno.getCod() == id) {
                    System.out.println("usuario encontrado");
                    listaAluno.remove(aluno);
                } else {
                    System.out.println("Usuario não encontrado");
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void listaAluno() {
        try {
            if (!listaAluno.isEmpty()) {
                for (Aluno aluno : listaAluno
                ) {
                    System.out.println("Esse é o nome do aluno: " + aluno.getNome());
                    System.out.println("Esse é a Data do aluno: " + aluno.getDataNascimento());
                    System.out.println("Essa é o id do aluno: " + aluno.getCod());
                    System.out.println("Essa é a nota do aluno: " + aluno.getNota());
                    System.out.println("Esse é o index: " + listaAluno.indexOf(aluno));
                }
            } else {
                System.out.println("Lista Vazia!");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
