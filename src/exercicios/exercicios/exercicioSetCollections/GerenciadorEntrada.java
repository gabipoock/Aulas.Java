package exercicios.exercicioSetCollections;
import java.util.Scanner;

public class GerenciadorEntrada {
    public String obterEntradaUsuario() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Oiee! Seja bem-vindo ao Gerenciador de Números Únicos! :)");
        System.out.print("Insira uma lista de números inteiros separados por espaços, por favor: ");
        String entrada = scanner.nextLine();
        
        scanner.close();
        return entrada;
    }
}