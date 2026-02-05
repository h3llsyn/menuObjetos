public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("==== Secretaria ====");
        System.out.println("1 - Alunos");
        System.out.println("2 - Turmas");
        String opcao = Leitura.dados("Digite a opção desejada: ");

        if (opcao.equals("1")){
            System.out.println("==== Alunos ====");
            System.out.println("1 - Listar Alunos");
            System.out.println("2 - Cadastrar Aluno");
            System.out.println("3 - Atualizar Aluno");
            System.out.println("4 - Excluir Aluno");
            System.out.println("5 - Voltar ao Menu Principal");
            opcao = Leitura.dados("Digite a opção desejada: ");
            switch (opcao){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        }
        else if (opcao.equals("2")){
            System.out.println("==== Turmas ====");
            System.out.println("1 - Listar Turmas");
            System.out.println("2 - Cadastrar Turma");
            System.out.println("3 - Atualizar Turma");
            System.out.println("4 - Excluir Turma");
            System.out.println("5 - Voltar ao Menu Principal");
            opcao = Leitura.dados("Digite a opção desejada: ");
            switch (opcao){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        }
        else {
            System.out.println("Opção inválida, tente novamente");
        }
    }
}