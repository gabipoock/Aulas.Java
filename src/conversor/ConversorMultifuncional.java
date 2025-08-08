package conversor;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;

public class ConversorMultifuncional extends JFrame{
    private JTextField campoValor;
    private JLabel labelResultado;

    public ConversorMultifuncional(){
        //Definição do Frame
        setSize(350, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Conversor Multifuncional");
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(java.awt.Color.PINK);

        //Componentes da Interface
        labelResultado = new JLabel("Resultado :");
        labelResultado.setFont(new Font("Arial", Font.BOLD, 16));
        campoValor = new JTextField(15);
        campoValor.setFont(new Font("Arial", Font.PLAIN, 16));
        JPanel painelBotoes = new JPanel();

        painelBotoes.setLayout (new BoxLayout(painelBotoes, BoxLayout.Y_AXIS));

        //Definição dos Botões

        JButton btnCtoF = new JButton("Celsius para Fahrenheit");
        btnCtoF.setBackground(new java.awt.Color(135, 206, 250)); // Azul claro
        btnCtoF.setForeground(java.awt.Color.BLACK);

        JButton btnFtoC = new JButton("Fahrenheit para Celsius");
        btnFtoC.setBackground(new java.awt.Color(255, 182, 193)); // Rosa claro
        btnFtoC.setForeground(java.awt.Color.BLACK);

        JButton btnRtoD = new JButton("Reais para Dólares");
        btnRtoD.setBackground(new java.awt.Color(144, 238, 144)); // Verde claro
        btnRtoD.setForeground(java.awt.Color.BLACK);

        JButton btnDtoR = new JButton("Dólares para Reais");
        btnDtoR.setBackground(new java.awt.Color(255, 255, 153)); // Amarelo claro
        btnDtoR.setForeground(java.awt.Color.BLACK);

        JButton btnClean = new JButton("Limpar");
        btnClean.setBackground(new java.awt.Color(211, 211, 211)); // Cinza claro
        btnClean.setForeground(java.awt.Color.BLACK);
        
        painelBotoes.setLayout (new BoxLayout(painelBotoes, BoxLayout.Y_AXIS));
        painelBotoes.setAlignmentX(CENTER_ALIGNMENT); // <-- Não é suficiente sozinho

        // Centralizar cada botão individualmente:
        btnCtoF.setAlignmentX(CENTER_ALIGNMENT);
        btnFtoC.setAlignmentX(CENTER_ALIGNMENT);
        btnRtoD.setAlignmentX(CENTER_ALIGNMENT);
        btnDtoR.setAlignmentX(CENTER_ALIGNMENT);
        btnClean.setAlignmentX(CENTER_ALIGNMENT);
        
        //Ação dos Botões
        btnCtoF.addActionListener((actionEvent) -> converter("btnCtoF"));
        btnFtoC.addActionListener((actionEvent) -> converter("btnFtoC"));
        btnRtoD.addActionListener((actionEvent) -> converter("btnRtoD"));
        btnDtoR.addActionListener((actionEvent) -> converter("btnDtoR"));
        btnClean.addActionListener((actionEvent) -> limpar());


        painelBotoes.add(Box.createVerticalStrut(8));
        painelBotoes.add(btnCtoF);
        painelBotoes.add(Box.createVerticalStrut(8));
        painelBotoes.add(btnFtoC);
        painelBotoes.add(Box.createVerticalStrut(8));
        painelBotoes.add(btnRtoD);
        painelBotoes.add(Box.createVerticalStrut(8));
        painelBotoes.add(btnDtoR);
        painelBotoes.add(Box.createVerticalStrut(8));
        painelBotoes.add(btnClean);

        add(labelResultado, BorderLayout.NORTH);
        add(campoValor, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void limpar(){
        campoValor.setText("");
        labelResultado.setText("Resultado :");
    }

    private void converter(String tipo){

        try {
            double valor = Double.parseDouble(campoValor.getText());
        double resultado;
        String mensagem = "";

        switch (tipo) {
            case "btnCtoF":
                resultado = (valor * 9/5) + 32;
                mensagem = String.format("%.1f °C = %.1f °F", valor, resultado);
                break;

            case "btnFtoC":
                resultado = (valor - 32) * 5/9;
                mensagem = String.format("%.1f °F = %.1f °C", valor, resultado);
                break;

            case "btnRtoD":
                resultado = valor / 5.463; // taxa de conversão
                mensagem = String.format("R$ %.2f = US$ %.2f", valor, resultado);
                break;

            case "btnDtoR":
                resultado = valor * 5.463; // taxa de conversão
                mensagem = String.format("US$ %.2f = R$ %.2f", valor, resultado);
                break;
        
            default:
                throw new  IllegalArgumentException("Tipo de conversão inválido.");
        }
        labelResultado.setText("Resultado: " + mensagem);

        } catch (IllegalArgumentException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter! " +
            e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
        

    public static void main(String[] args) {
        new ConversorMultifuncional();
    }
}