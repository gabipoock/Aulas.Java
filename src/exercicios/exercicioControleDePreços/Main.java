package exercicioControleDePreços;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AppProduto app = new AppProduto();
            app.setVisible(true);
        });
    }
}
