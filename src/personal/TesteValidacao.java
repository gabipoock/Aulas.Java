package personal;
import erroComp.*;

public class TesteValidacao {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Fulano");
        Validar.aluno(aluno);
    }
}