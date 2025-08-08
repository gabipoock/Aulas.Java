package produto;

public class Produto {
    private String detalhesDoProduto;
    private double precoDoProduto;
    private String nomeDoProduto;
    private String marcaProduto; 

    public String getDetalhesDoProduto() {
        return detalhesDoProduto;
    }

    public void setDetalhesDoProduto(String detalhesDoProduto) {
        this.detalhesDoProduto = detalhesDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }


@Override
public String toString() {
    return "Detalhes do Produto:\n"
            + "Nome: " + nomeDoProduto + "\n"
            + "Marca: " + marcaProduto + "\n"
            + "Preço: " + precoDoProduto + "\n"
            + "Descrição: " + detalhesDoProduto;
}

    protected void limparNomeDoProduto() {
    
    }

    public void mostrarDadosDoProduto() {
        
    }

}
