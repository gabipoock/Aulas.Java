public class Aluno {
    private String nome;
    private int idade;
    private double nota;
    private String serie;

    public Aluno(String nome, int idade, double nota, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.serie = serie;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Idade: %d | Nota: %.2f | Série: %s", nome, idade, nota, serie);
    }
}