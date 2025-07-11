package erroComp;

import java.util.Random;

public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private static final int CONT_MAT = 10000;

    
    public Aluno(String nome) {
        this.nome = nome;
        this.matricula = "N/A";
    }

    public void gerarMat(){
        Random random = new Random();
        this.matricula = "Mat" + random.nextInt(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", matricula=" + matricula + "]";
    }

    

}
