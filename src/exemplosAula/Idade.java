package exemplosAula;
import java.util.Scanner;

public class Idade {
   public static void main(String[] args) {
      verIdade();
   }
   
   public static void verIdade(){
      Scanner texto = new Scanner(System.in);
   
      System.out.println("Olá! Seja bem-vindo!");
      System.out.println("Por favor, informe sua idade:");
      int idade = texto.nextInt();
   
      System.out.println("Resultado: " + getIdade(idade));
   
      texto.close();
   }
   
   public static String getIdade(int idade) {
      String texto = null;
      if (idade >= 0 && idade < 3) {
         texto = "Você é um bebê.";
      } else if (idade >= 3 && idade < 12) {
         texto = "Você é uma criança.";
      } else if (idade >= 12 && idade < 18) {
         texto = "Você é um adolescente.";
      } else if (idade >= 18 && idade < 60) {
         texto = "Você é um adulto.";         
      } else {
         texto = "Você é um idoso.";
      }
      return texto;
   }
}