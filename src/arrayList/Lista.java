package arrayList;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList <Cliente> lista = new ArrayList<>();

        Cliente c1 = new Cliente("João");
        // System.out.printf("Tamanho 1: %d\n", lista.size());

        lista.add(c1);

        // System.out.printf("Tamanho 2: %d\n", lista.size());
        System.out.println("==========================");
        lista.add(new Cliente("Maria"));
        lista.add(new Cliente("Ana"));
        lista.add(new Cliente("Pedro"));
        lista.add(new Cliente("Francisco"));
        lista.add(new Cliente("Lívia"));

        // System.out.printf("Tamanho 3: %d\n", lista.size());

        System.out.println(lista.get(4).getNome());

        for (Cliente cliente : lista) {
            System.out.println(cliente.getNome());
        }

        System.out.println("Index: " + lista.remove(1));
    }
}