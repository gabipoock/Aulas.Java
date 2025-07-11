package exemplosAula;
public class Calculadora {
    // + soma
    // - subt
    // * mult
    // / div
    // ++ auto incremeto
    // -- auto decremento
    // % resto da divisão
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 65;
    
        int resultado = a + b * c / 2 + a++ - 3 - --b;
        
        System.out.println("Resultado 1: " + resultado);

        resultado = (a + b) * c / 2 + (a++ - 3) - --b;

        System.out.println("Resultado 2: " + resultado);
    }
}
