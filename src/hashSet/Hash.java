package hashSet;
import java.util.HashSet;
import equalsHash.Usuario;

public class Hash {
    public static void main(String[] args) {
        HashSet <Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Maria"));
        usuarios.add(new Usuario("Miguel"));
        usuarios.add(new Usuario("Ana"));

        boolean resultado = 
        usuarios.contains(new Usuario("Maria"));

        System.out.println(resultado);
    }
}