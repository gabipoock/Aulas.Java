package exemplosAula;
import produto.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto p = new Produto();

        p.setMarcaProduto("Lenovo");
        p.setDetalhesDoProduto("Notebook 14'', 8GB RAM, 256GB SSD");
        p.setNomeDoProduto("ThinkPad");
        p.setPrecoDoProduto(1800.99);

/*      System.out.println(p.getMarcaProduto());
        System.out.println(p.getDetalhesDoProduto());
        System.out.println(p.getNomeDoProduto());
        System.out.println(p.getPrecoDoProduto()); 
        NAO PRECISA DE TUDO ISSO. ABAIXO A MANEIRA FACILITADA:*/

        System.out.println(p.toString());
    }
}