import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        GerenciaProfessor novoProfessor = new GerenciaProfessor();
        int op = 1;
        while (op != 0) {
            System.out.println("""
                    1- Cadastrar Aluno
                    2- Listar Aluno
                    3- Colocar Nota
                    4- Excluir Aluno
                    Digite sua opção!
                    """);
            op = ler.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Qual o nome do Aluno?");
                    String leituraNome = ler.next();
                    System.out.println("Qual a data de nascimento do Aluno?");
                    String leituraData = ler.next();
                    novoProfessor.cadastraAluno(leituraNome, leituraData, 1); // id fornecido testes
                    break;
                case 2:
                    novoProfessor.listaAluno();
                    break;
                case 3:
                    System.out.println("Qual a id do aluno a ser atribuido a nota?");
                    int idLidoNota = ler.nextInt();
                    novoProfessor.administraNota(idLidoNota);
                    break;
                case 4:
                    System.out.println("qual o id do aluno a ser excluido?");
                    int idLido = ler.nextInt();
                    novoProfessor.excluirAluno(idLido);
                    break;
            }
        }
    }
}
