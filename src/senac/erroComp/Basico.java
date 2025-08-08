package erroComp;

public class Basico {
    public static void main(String[] args) {
        //System.out.println(7/0);

        Aluno al1 = new Aluno("João");

        System.out.println(al1.getMatricula());
        System.out.println(al1.getNome());
    }
}
