package personal;

import erroComp.*;

public class Validar {
    private Validar() {
        // Construtor privado para evitar instâncias
    }

    public static void aluno(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo.");
        }
        if (aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
            throw new StringVaziaException("nome");
        } if (aluno.getMatricula().equals("0")){
            
        }
    }
}