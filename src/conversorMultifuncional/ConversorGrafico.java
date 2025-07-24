package conversorMultifuncional;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class ConversorGrafico extends JFrame{
    public JLabel lableResultado;
    public JTextField campoValor;


    public ConversorGrafico() {
        setTitle("Conversor Multifuncional");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        lableResultado = new JLabel("Resultado: ");
        lableResultado.setFont(new Font("Arial", Font.PLAIN, 24));

        campoValor = new JTextField(3);

        JPanel painelBotoes = new JPanel(new FlowLayout());

        painelBotoes = new JPanel(new BoxLayout(painelBotoes, BoxLayout.Y_AXIS));

        JButton botaoCtoF = new JButton("Celsius para Fahrenheit");

        painelBotoes.add(botaoCtoF);

        add(lableResultado, BorderLayout.NORTH);
        add(campoValor, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.NORTH);

        setVisible(true);
    }
}
