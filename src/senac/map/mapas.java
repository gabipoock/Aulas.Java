package map;

import java.util.HashMap;
import java.util.Map;

public class mapas {
    public static void main(String[] args) {
        Map<Integer, String> usuário = new HashMap<>();

        usuário.put(1, "João");
        usuário.put(11, "Maria");
        usuário.put(3, "Paulo");
        usuário.put(9, "Ana");

        System.out.println(usuário.size());
        System.out.println(usuário.values());
        System.out.println(usuário.entrySet());

        System.out.println(usuário.containsKey(11));
        System.out.println(usuário.containsValue("Carla"));

        System.out.println(usuário.get(9));
        
        for (java.util.Map.Entry<Integer, String> registro :  usuário.entrySet()) {
            System.out.println(registro.getKey() + " - " + registro.getValue());
        }
    }
}