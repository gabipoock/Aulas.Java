package calculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGrafica extends JFrame{

    public CalculadoraGrafica() {
        setTitle("Calculadora Gráfica");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao fechar a janela
        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);

        setLayout(null);

        JLabel tituloJLabel = new JLabel("Calculadora Gráfica", JLabel.CENTER);
        tituloJLabel.setBounds(50, 20, 200, 30); // Define a posição e o tamanho do JLabel
        add(tituloJLabel);

        JButton botaoIniciar = new JButton("Iniciar");
        botaoIniciar.setBounds(100, 100, 100, 30);
        add(botaoIniciar);

        botaoIniciar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    String opcao = JOptionPane.showInputDialog(
                        "Escolha uma operação:\n"+
                        "1. Adição\n"+
                        "2. Subtração\n"+
                        "3. Multiplicação\n"+
                        "4. Divisão");
                    int escolha = Integer.parseInt(opcao);

                    if (escolha < 1 || escolha > 4) {
                        JOptionPane.showMessageDialog(
                        null, "Operação não reconhecida.");
                    return; // Sai do método actionPerformed
                    }

                    double num1 = Double.parseDouble(
                        JOptionPane.showInputDialog("Informe o 1º número:"));

                    double num2 = Double.parseDouble(
                        JOptionPane.showInputDialog("Informe o 2º número:"));

                        double resultado = 0;

                    switch (escolha) {
                        case 1:
                            resultado = Operacoes.adicao(num1, num2);
                            break;
                    
                        case 2:
                            resultado = Operacoes.subtracao(num1, num2);
                            break;

                        case 3:
                            resultado = Operacoes.multiplicacao(num1, num2);
                            break;
                    
                        case 4:
                            resultado = Operacoes.divisao(num1, num2);
                            break;
                    }

                    JOptionPane.showMessageDialog(
                        null, "Resultado: " + resultado);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                        null, "Opção inválida: " + ex.getMessage());
                }

                JOptionPane.showMessageDialog(null, "Calculadora Iniciada!");
            }
        });

        setVisible(true);

    }

    public static void main(String[] args) {
        new CalculadoraGrafica();
    }
}