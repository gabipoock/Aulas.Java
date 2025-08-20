package calc_media;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.TextArea;

public class CalcularMediaSwing extends JFrame{

    private JTextField txtNome, txtNota1, txtNota2, txtNota3;
    private TextArea txtResultado;

    public CalcularMediaSwing() {
        // Configuração do Frame
        setTitle("Calculadora de Média");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Criação dos componentes
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 80, 25);

        txtNome = new JTextField();
        txtNome.setBounds(100, 20, 200, 25);

        JLabel lblNota1 = new JLabel("Nota 1:");
        lblNota1.setBounds(20, 60, 80, 25);

        txtNota1 = new JTextField();
        txtNota1.setBounds(100, 60, 200, 25);

        JLabel lblNota2 = new JLabel("Nota 2:");
        lblNota2.setBounds(20, 100, 80, 25);

        txtNota2 = new JTextField();
        txtNota2.setBounds(100, 100, 200, 25);

        JLabel lblNota3 = new JLabel("Nota 3:");
        lblNota3.setBounds(20, 140, 80, 25);

        txtNota3 = new JTextField();
        txtNota3.setBounds(100, 140, 200, 25);

        add(lblNome);
        add(txtNome);
        add(lblNota1);
        add(txtNota1);
        add(lblNota2);
        add(txtNota2);
        add(lblNota3);
        add(txtNota3);
    }

}
