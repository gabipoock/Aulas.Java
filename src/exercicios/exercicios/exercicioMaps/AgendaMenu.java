package exercicios.exercicioMaps;
import java.util.Map;
import java.util.Scanner;

public class AgendaMenu {
    private Agenda agenda;
    private Scanner scanner;

    public AgendaMenu() {
        this.agenda = new Agenda();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcao;
        
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            
            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    removerContato();
                    break;
                case 3:
                    buscarContato();
                    break;
                case 4:
                    listarContatos();
                    break;
                case 5:
                    System.out.println("Saindo da agenda telefônica...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
        
        scanner.close();
    }

    private void exibirMenu() {
        System.out.println("\n--- AGENDA TELEFONICA ---");
        System.out.println("1. Adicionar contato");
        System.out.println("2. Remover contato");
        System.out.println("3. Buscar contato");
        System.out.println("4. Listar todos os contatos");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void adicionarContato() {
        System.out.print("Digite o nome do contato, por favor: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o número de telefone: ");
        String telefone = scanner.nextLine();
        
        if (agenda.contatoExiste(nome)) {
            System.out.println("Oioi! Este contato já existe. Deseja atualizar? (S/N)");
            String resposta = scanner.nextLine();
            
            if (resposta.equalsIgnoreCase("S")) {
                agenda.adicionarContato(new Contato(nome, telefone));
                System.out.println("Contato atualizado com sucesso!");
            } else {
                System.out.println("Operação cancelada.");
            }
        } else {
            agenda.adicionarContato(new Contato(nome, telefone));
            System.out.println("Contato adicionado com sucesso!");
        }
    }

    private void removerContato() {
        System.out.print("Digite o nome do contato a ser removido: ");
        String nome = scanner.nextLine();
        
        if (agenda.contatoExiste(nome)) {
            agenda.removerContato(nome);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private void buscarContato() {
        System.out.print("Digite o nome do contato a ser buscado: ");
        String nome = scanner.nextLine();
        
        Contato contato = agenda.buscarContato(nome);
        
        if (contato != null) {
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private void listarContatos() {
        Map<String, Contato> contatos = agenda.getContatos();
        
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("\n--- Lista de Contatos ---");
            for (Contato contato : contatos.values()) {
                System.out.println(contato);
            }
        }
    }
}
