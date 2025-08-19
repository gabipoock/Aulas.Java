package registroVoto;

import java.awt.*;
import java.io.BufferedWriter;

import javax.swing.*;

public class SistemaVotacao extends JFrame {

    private JComboBox<String> comboCandidatos;
    private JLabel labelResultado;
    private int[] votos = new int[4];

    public SistemaVotacao(){
        //Criando Frame Principal
        setTitle("Sistema de Votação");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(Color.PINK);

        //Criando componentes
        labelResultado = new JLabel("Votos: A = 0, B = 0, C = 0, D = 0");
        labelResultado.setFont(new Font("Hevetica", Font.BOLD, 16));
        String [] candidato = {"Candidato A", "Candidato B", "Candidato C", "Candidato D"};
        comboCandidatos = new JComboBox<>(candidato);
        JPanel painelCandidatos = new JPanel(new FlowLayout());
        JPanel painelBotoes = new JPanel(new FlowLayout());

        //Criando botões
        JButton btnVotar = new JButton("Votar");
        JButton btnLimpar = new JButton("Limpar");
        JButton btnResultado = new JButton("Relatório");

        //Ações sobre os botões
        btnVotar.addActionListener(e -> votar());
        btnResultado.addActionListener(e -> exibirResultado());
        btnLimpar.addActionListener(e -> encerrarVotacao());

        //Paineis
        painelCandidatos.add(comboCandidatos);
        painelBotoes.add(btnVotar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnResultado);

        //Adicionando componentes ao Frame
        add(labelResultado, BorderLayout.NORTH);
        add(painelCandidatos, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void votar(){
        int candidato = comboCandidatos.getSelectedIndex();

        if (candidato == -1) {
            JOptionPane.showMessageDialog(null,
            "Selecione um candidato",
            "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirma = JOptionPane.showConfirmDialog(null, "Confirmar o voto em " +
        comboCandidatos.getItemAt(candidato) +
        "?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
        switch (candidato) {
            case 0:
                votos[0]++;
                break;
            case 1:
                votos[1]++;
                break;
            case 2:
                votos[2]++;
                break;
            case 3:
                votos[3]++;
                break;
        }
        labelResultado.setText("Votos: A = " + votos[0] + ", B = " + votos[1] + ", C = " + votos[2] + ", D = " + votos[3]);

        JOptionPane.showMessageDialog(null,
        "Voto registrado com sucesso!",
        "Resultados", JOptionPane.INFORMATION_MESSAGE);
        
    }
}

    private void exibirResultado() {
        String resultado = "Resultados:\n" +
                "Candidato A: " + votos[0] + "\n" +
                "Candidato B: " + votos[1] + "\n" +
                "Candidato C: " + votos[2] + "\n" +
                "Candidato D: " + votos[3];
        JOptionPane.showMessageDialog(this, resultado, "Relatório de Votos",
        JOptionPane.INFORMATION_MESSAGE);
    }

    private void encerrarVotacao() {
        try (BufferedWriter gravar = new BufferedWriter(new java.io.FileWriter("resultado.txt"))) {

            gravar.write("Resultados Finais:\n Candidato A: " + votos[0] + "\n" +
                    "Candidato B: " + votos[1] + "\n" +
                    "Candidato C: " + votos[2] + "\n" +
                    "Candidato D: " + votos[3]);

                    labelResultado.setText("A = 0, B = 0, C = 0, D = 0");
                    JOptionPane.showMessageDialog(null,
                    "Encerramento da Votação. Votos salvos!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os resultados: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.exit(0); // Encerra o programa
        }
    }

    public static void main(String[] args) {
        new SistemaVotacao();
    }
}
