package exercicioControleDePreços;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class AppProduto extends JFrame {

    private JTextField nomeField;
    private JTextField precoField;
    private JTextArea resultadoArea;

    public AppProduto() {
        // Configurações da janela
        setTitle("REGISTRO DE PRODUTOS :)");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        getContentPane().setBackground(new Color(70, 130, 180)); 

        // Campo de nome
        JLabel labelNome = new JLabel("Nome do produto:");
        labelNome.setForeground(Color.WHITE); 
        add(labelNome);

        nomeField = new JTextField(20);
        add(nomeField);

        // Campo de preço
        JLabel labelPreco = new JLabel("Preço do produto:");
        labelPreco.setForeground(Color.WHITE); 
        add(labelPreco);

        precoField = new JTextField(10);
        add(precoField);

        // Botões
        JButton registrarButton = new JButton("Registrar");
        JButton verProdutosButton = new JButton("Ver Produtos");
        JButton limparProdutosButton = new JButton("Limpar Produtos");

        // Estilizando botões com rosinha
        Color rosaClaro = new Color(255, 182, 193);
        registrarButton.setBackground(rosaClaro);
        verProdutosButton.setBackground(rosaClaro);
        limparProdutosButton.setBackground(rosaClaro);

        registrarButton.setFocusPainted(false);
        verProdutosButton.setFocusPainted(false);
        limparProdutosButton.setFocusPainted(false);

        // Adicionar botões
        add(registrarButton);
        add(verProdutosButton);
        add(limparProdutosButton);

        // Área de resultados estilizada
        resultadoArea = new JTextArea(12, 40);
        resultadoArea.setEditable(false);
        resultadoArea.setBackground(Color.WHITE);
        resultadoArea.setForeground(Color.BLACK);
        resultadoArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        resultadoArea.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        add(new JScrollPane(resultadoArea));

        // Ação do botão Registrar
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarProduto();
            }
        });

        // Ação do botão Ver Produtos
        verProdutosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirProdutos();
            }
        });

        // Ação do botão Limpar Produtos
        limparProdutosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparProdutos();
            }
        });
    }

    private void registrarProduto() {
        String nome = nomeField.getText().trim();
        String precoTexto = precoField.getText().trim();

        if (nome.isEmpty() || precoTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        try {
            double preco = Double.parseDouble(precoTexto);

            Produto produto = new Produto(nome, preco);

            try (FileWriter writer = new FileWriter("produto.txt", true)) {
                writer.write(produto.toString() + "\n");
            }

            resultadoArea.append("Produto registrado: " + produto.getNome() + " - R$ " + produto.getPreco() + "\n");

            nomeField.setText("");
            precoField.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Preço inválido. Digite um número válido.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar no arquivo.");
        }
    }

    private void exibirProdutos() {
        resultadoArea.setText(""); // Limpar área antes de mostrar
        try (BufferedReader reader = new BufferedReader(new FileReader("produto.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                resultadoArea.append(linha + "\n");
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Nenhum produto cadastrado ainda.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao ler o arquivo.");
        }
    }

    private void limparProdutos() {
        int confirm = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja apagar todos os produtos?",
                "Confirmar Exclusão",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Limpar o arquivo produto.txt
            File arquivo = new File("produto.txt");
            if (arquivo.exists()) {
                if (arquivo.delete()) {
                    try {
                        arquivo.createNewFile(); 
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Erro ao recriar arquivo.");
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível apagar o arquivo.");
                    return;
                }
            }

            resultadoArea.setText(""); // Limpar JTextArea
            JOptionPane.showMessageDialog(this, "Todos os produtos foram apagados.");
        }
    }
}
