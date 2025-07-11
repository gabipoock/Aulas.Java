package exercicios.exercicioSetCollections;
import java.util.HashSet;
import java.util.Set;

public class ProcessadorNumeros {
    public String obterNumerosUnicos(String entrada) {
        String[] numerosString = entrada.split(" ");
        Set<Integer> numerosUnicos = new HashSet<>();
        
        for (String numStr : numerosString) {
            try {
                int numero = Integer.parseInt(numStr);
                numerosUnicos.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Aviso: '" + numStr + "' não é um número inteiro válido e será ignorado.");
            }
        }
        
        return numerosUnicos.toString()
                .replace("[", "")
                .replace("]", "");
    }
}