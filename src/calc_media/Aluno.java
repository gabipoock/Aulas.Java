package calc_media;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, double n1, double n2, double n3) {
        this.nome = nome;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aluno: ").append(nome).append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Nota 1: ").append(nota1).append("\n");
        sb.append("Nota 2: ").append(nota2).append("\n");
        sb.append("Nota 3: ").append(nota3).append("\n");
        sb.append("Média: ").append(calcularMedia());
        sb.append('}');
        return sb.toString();
    }
}