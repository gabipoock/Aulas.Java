package exercicios.exerciciosListCollections;
import java.util.ArrayList;
import java.util.Scanner;

public class NumerosParesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Oieeee! Seja bem-vindo ao filtro de números pares! :)");
        System.out.println("Insira uma lista de números inteiros. Digite '-1' para encerrar a lista e conferir os números pares:");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            numeros.add(numero);
        }

        ArrayList<Integer> numerosPares = FiltroNumeros.filtrarPares(numeros);

        System.out.println("Os números pares são: " + numerosPares);
        scanner.close();
    }
}
