package exercicios.exercicioSetCollections;

public class NumerosUnicos {
    public static void main(String[] args) {
        GerenciadorEntrada gerenciador = new GerenciadorEntrada();
        
        String entrada = gerenciador.obterEntradaUsuario();
        
        ProcessadorNumeros processador = new ProcessadorNumeros();
        String resultado = processador.obterNumerosUnicos(entrada);
        
        System.out.println("Os números únicos são: " + resultado);
    }
}