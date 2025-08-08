package javaSwing;

import javax.swing.JOptionPane;

public class JOptionPaneMessageSimples {
    public static void janelaMessage(int valor) {
        JOptionPane.showMessageDialog( //abre uma janela
            null,
            "Valor informado: " + valor, //mensagem
            "Captura de dados", //título da janela
            JOptionPane.INFORMATION_MESSAGE); //Mensagem de erro
            //JOptionPane.INFORMATION_MESSAGE(informação));
            //JOptionPane.WARNING_MESSAGE(atenção));
            //JOptionPane.QUESTION_MESSAGE(pergunta));
            //JOptionPane.PLAIN_MESSAGE(sem ícone));
    }

    public static void janelaInput() {
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Informe um número inteiro:" )
            );
            janelaMessage(numero);

            Double.parseDouble(null);
            Boolean.parseBoolean(null);
            Byte.parseByte(null);
            Short.parseShort(null);
    }

    public static void janelaConfirm() {
        int resposta = JOptionPane.showConfirmDialog(
            null,
            "Deseja continuar?",
            "Confirmação",
            JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {
            janelaMessage(1);
        } else {
            janelaMessage(0);
        }
    }

    public static void main(String[] args) {
        janelaInput();
    }
}