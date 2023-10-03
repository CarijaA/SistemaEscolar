import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GerenciaAdmin {
    Random r1 = new Random();
    List<Admin> listaAdmin = new ArrayList<Admin>();
    Admin novoAdmin = new Admin();

    public void cadastraAdmin(String nome, String dataNascimento, String cpf, Double salario) {
        novoAdmin.setNome(nome);
        novoAdmin.setDataNascimento(dataNascimento);
        novoAdmin.setCpf(cpf);
        novoAdmin.setSalario(salario);
        listaAdmin.add(novoAdmin);
    }

    public void excluirAdmin(String nome) {
        try {
            for (Admin admin : listaAdmin
            ) {
                if (novoAdmin.getNome().equals(nome)) {
                    System.out.println("usuario encontrado");
                    listaAdmin.remove(admin);
                } else {
                    System.out.println("Usuario não encontrado");
                }
            }
        }
        catch (Exception e){
            e.getMessage();
        }
    }

    public void listaAdmin() {
        for (Admin admin : listaAdmin
        ) {
            System.out.println("esse é o nome do professor:" + admin.getNome());
            System.out.println("esse é a Data de nascimento do professor:" + admin.getDataNascimento());
        }
    }
}
