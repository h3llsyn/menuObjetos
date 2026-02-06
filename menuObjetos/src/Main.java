import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Aluno> listaAlunos = new ArrayList<>();
    private static ArrayList<Turma> listaTurmas = new ArrayList<>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        System.out.println("==== Secretaria ====");
        System.out.println("1 - Alunos");
        System.out.println("2 - Turmas");
        System.out.println("3 - Sair");

        String opcao = Leitura.dados("Digite a opção desejada: ");

        if (opcao.equals("1")) {
            menuAlunos();
        }
        else if (opcao.equals("2")) {
            menuTurmas();
        }
        else if (opcao.equals("3")) {
            System.out.println("Até breve...");
            System.exit(0);
        }
        else {
            System.out.println("Opção inválida! Tente novamente");
        }
    }

    private static void menuAlunos() {
        System.out.println("==== Alunos ====");
        System.out.println("1 - Listar Alunos");
        System.out.println("2 - Cadastrar Aluno");
        System.out.println("3 - Atualizar Aluno");
        System.out.println("4 - Excluir Aluno");
        System.out.println("5 - Voltar ao Menu Principal");

        String opcao = Leitura.dados("Digite a opção desejada: ");

        switch (opcao) {
            case "1":
                listarAlunos();
                break;
            case "2":
                //cadastrarAluno();
                break;
            case "3":
                //atualizarAluno();
                break;
            case "4":
                //excluirAluno();
                break;
            case "5":
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
        }
    }

    private static void menuTurmas() {
        System.out.println("==== Turmas ====");
        System.out.println("1 - Listar Turmas");
        System.out.println("2 - Cadastrar Turma");
        System.out.println("3 - Atualizar Turma");
        System.out.println("4 - Excluir Turma");
        System.out.println("5 - Voltar ao Menu Principal");

        String opcao = Leitura.dados("Digite a opção desejada: ");

        switch (opcao) {
            case "1":
                listarTurmas();
                break;
            case "2":
                //cadastrarTurma();
                break;
            case "3":
                //atualizarTurma();
                break;
            case "4":
                //excluirTurma();
                break;
            case "5":
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
        }
    }

    private static void listarTurmas() {
        System.out.println("Turmas existentes:");
        for (Turma t : listaTurmas){
            System.out.println(t);
        }
    }

    private static void listarAlunos() {
        System.out.println("Alunos existentes:");
        for (Aluno a : listaAlunos){
            System.out.println(a);
        }
    }
}
