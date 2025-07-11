package exemplosAula;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        System.out.println("//NOME//");
        Scanner texto = new Scanner(System.in);
        String str;

        System.out.println("Digite seu nome:");
        str = texto.nextLine();
        System.out.println("Olá, " + str + "! muito prazer!");
        System.out.println("Gostaria de fazer seu cadastro? (S/N)");
        String resposta = texto.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Vamos continuar com seus dados pessoais!");
        } else {
            System.out.println("Cadastro não realizado.");
        }
        
        System.out.println("Por favor, digite seu nome completo, " + str);
        String nome = texto.nextLine();

        System.out.println("Digite sua idade:");
        int idade = Integer.parseInt(texto.nextLine());

        System.out.println("Digite seu CPF:");
        String cpf = texto.nextLine();

        System.out.println("Digite seu endereço:");
        String endereco = texto.nextLine();

        System.out.println("\nPor favor, confirme seus dados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);

        System.out.println("\nGostaria de concluir seu cadastro? (S/N)");
        resposta = texto.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Cadastro realizado com sucesso! :)");
        } else {
            System.out.println("Cadastro não realizado. :()");
        }

        texto.close();
        System.out.println("Obrigado por usar nosso sistema! Até logo!");
        System.out.println("//FIM//");
    }
}
