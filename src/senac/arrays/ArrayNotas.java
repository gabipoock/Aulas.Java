package arrays;

public class ArrayNotas {
    public static void main(String[] args) {
        double [] notasAlunoA = new double[3];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 6.2;
        notasAlunoA[2] = 8.9;

        double [] notasAlunoB = {6.9, 8.9, 5.5, 10.0, 7.3};

        /*for (int i = 0; i < notasAlunoA.length; i++) {
            System.out.println("Nota " + (i + 1) + " Aluno A: " + notasAlunoA[i]);
        }*/

        int i = 1;
        for (double nota : notasAlunoA) {
            System.out.println("Nota " + i + " Aluno A: " + nota);
            i++;
}

        for (i = 0; i < notasAlunoB.length; i++) {
            System.out.println("Nota " + (i + 1) + " Aluno B: " + notasAlunoB[i]);
        }
    }
}
