package hashSet;

import java.util.HashSet;

public class ConjuntoDesordenado {
    @SuppressWarnings({"unchecked","rawtypes"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(34);
        conjunto.add('x');

        System.out.printf("Tamanho da estrutura: %d", conjunto.size());

        System.out.printf("/nd%", conjunto.remove("Teste"));
        System.out.printf("/nd%", conjunto.remove ("Teste"));

        System.out.printf("Tamanho da estrutura: %d", conjunto.size());
    }

}