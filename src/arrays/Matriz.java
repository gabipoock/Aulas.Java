package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Matriz {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double[][] notaTurma = new double[3][4];

        int totalTurma = 0;

        for (int i = 0; i < notaTurma.length; i++) {
            for (int j = 0; j < notaTurma[i].length; j++) {
                System.out.println("Informe a nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                notaTurma[i][j] = ent.nextDouble();
            }
        }

        for (double[] aluno : notaTurma) {
            for (double nota : aluno) {
                totalTurma += nota;
        }

        double media = totalTurma / (3 * 4);

        //System.out.println("Resultado final: " + media + " média da turma.");
        System.out.printf("Resultado final: %.1f média da turma.", media);

        JOptionPane.showMessageDialog(null, String.format("Resultado final: %.1f média da turma.", media),
        "Final", JOptionPane.INFORMATION_MESSAGE);

        ent.close();
        }
    }   
}