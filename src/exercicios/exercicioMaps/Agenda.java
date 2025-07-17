package exercicios.exercicioMaps;
import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Contato> contatos;

    public Agenda() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.put(contato.getNome(), contato);
    }

    public void removerContato(String nome) {
        contatos.remove(nome);
    }

    public Contato buscarContato(String nome) {
        return contatos.get(nome);
    }

    public Map<String, Contato> getContatos() {
        return contatos;
    }

    public boolean contatoExiste(String nome) {
        return contatos.containsKey(nome);
    }
}