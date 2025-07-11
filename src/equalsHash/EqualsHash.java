package equalsHash;

public class EqualsHash {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.setNome("Pedro Silva");
        u1.setEmail("psilva@gmail.com");

        u2.setNome("Maria da Silva");
        u2.setEmail("msilva@gmail.com");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }
}