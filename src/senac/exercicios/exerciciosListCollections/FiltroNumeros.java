package exercicios.exerciciosListCollections;
import java.util.ArrayList;

public class FiltroNumeros {

    public static ArrayList<Integer> filtrarPares(ArrayList<Integer> lista) {
        ArrayList<Integer> pares = new ArrayList<>();

        for (int num : lista) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        return pares;
    }
}
