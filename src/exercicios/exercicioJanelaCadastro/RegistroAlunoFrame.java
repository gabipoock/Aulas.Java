import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class RegistroAlunoFrame extends JFrame {

    private JTextField nomeField, idadeField, notaField, serieField;
    private JButton registrarButton, limparButton, consultarButton;
    private List<Aluno> alunosRegistrados;

    public RegistroAlunoFrame() {
        super("Registro do Aluno");
        alunosRegistrados = new ArrayList<>();
        configurarJanela();
        inicializarComponentes();
        configurarEventos();
    }

    private void configurarJanela() {
        setSize(500, 450);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(Color.decode("#FFC0CB"));
    }

    private void inicializarComponentes() {
        JPanel painelCampos = new JPanel(new GridLayout(4, 2, 10, 10));
        painelCampos.setBackground(Color.decode("#FFC0CB"));

        Font fonteLabels = new Font("Arial", Font.BOLD, 16);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setFont(fonteLabels);
        nomeLabel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0)); // margem esquerda

        JLabel idadeLabel = new JLabel("Idade:");
        idadeLabel.setFont(fonteLabels);
        idadeLabel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));

        JLabel notaLabel = new JLabel("Nota:");
        notaLabel.setFont(fonteLabels);
        notaLabel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));

        JLabel serieLabel = new JLabel("Série:");
        serieLabel.setFont(fonteLabels);
        serieLabel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));


        nomeField = new JTextField();
        idadeField = new JTextField();
        notaField = new JTextField();
        serieField = new JTextField();

        painelCampos.add(nomeLabel);
        painelCampos.add(nomeField);
        painelCampos.add(idadeLabel);
        painelCampos.add(idadeField);
        painelCampos.add(notaLabel);
        painelCampos.add(notaField);
        painelCampos.add(serieLabel);
        painelCampos.add(serieField);

        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.setBackground(Color.decode("#FFC0CB"));

        Font fonteEmoji = new Font("Segoe UI Emoji", Font.BOLD, 14);
        registrarButton = criarBotao("Registrar", "📝");
        registrarButton.setFont(fonteEmoji);

        limparButton = criarBotao("Limpar", "🧹");
        limparButton.setFont(fonteEmoji);

        consultarButton = criarBotao("Consultar Alunos", "📋");
        consultarButton.setFont(fonteEmoji);


        painelBotoes.add(registrarButton);
        painelBotoes.add(limparButton);
        painelBotoes.add(consultarButton);

        add(painelCampos, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
    }

    private JButton criarBotao(String texto, String emoji) {
    JButton botao = new JButton(emoji + " " + texto) {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30); // raio das bordas
            super.paintComponent(g2);
            g2.dispose();
        }
    };
    botao.setBackground(Color.decode("#ADD8E6"));
    botao.setFont(new Font("Arial", Font.BOLD, 14));
    botao.setFocusPainted(false);
    botao.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15)); // espaçamento interno
    botao.setContentAreaFilled(false); // necessário para custom paint
    botao.setOpaque(false);
    botao.setCursor(new Cursor(Cursor.HAND_CURSOR));

    return botao;
}

    private void configurarEventos() {
        registrarButton.addActionListener(e -> registrarAluno());
        limparButton.addActionListener(e -> limparCampos());
        consultarButton.addActionListener(e -> consultarAlunos());
    }

    private void registrarAluno() {
        String nome = nomeField.getText().trim();
        String idadeStr = idadeField.getText().trim();
        String notaStr = notaField.getText().trim();
        String serie = serieField.getText().trim();

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O nome não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idade;
        try {
            idade = Integer.parseInt(idadeStr);
            if (idade < 10 || idade > 100) {
                JOptionPane.showMessageDialog(this, "A idade deve ser entre 10 e 100!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A idade deve ser um número inteiro!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double nota;
        try {
            nota = Double.parseDouble(notaStr);
            if (nota < 0 || nota > 10) {
                JOptionPane.showMessageDialog(this, "A nota deve ser entre 0 e 10!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "A nota deve ser um número decimal!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (serie.isEmpty()) {
            JOptionPane.showMessageDialog(this, "A série não pode estar vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Aluno aluno = new Aluno(nome, idade, nota, serie);
        alunosRegistrados.add(aluno);

        JOptionPane.showMessageDialog(this, "Aluno registrado com sucesso!", "Registro", JOptionPane.INFORMATION_MESSAGE);
        limparCampos();
    }

    private void limparCampos() {
        nomeField.setText("");
        idadeField.setText("");
        notaField.setText("");
        serieField.setText("");
    }

    private void consultarAlunos() {
        if (alunosRegistrados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum aluno registrado ainda.", "Consulta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder lista = new StringBuilder("📋 Lista de Alunos:\n\n");
        for (Aluno a : alunosRegistrados) {
            lista.append(a).append("\n");
        }

        JOptionPane.showMessageDialog(this, lista.toString(), "Consulta", JOptionPane.INFORMATION_MESSAGE);
    }
}
