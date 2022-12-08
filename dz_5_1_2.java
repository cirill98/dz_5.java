// Создать словарь HashMap. Обобщение <Integer, String>.
package jzvz_dz_5;

import java.util.HashMap;
import java.util.Map;


public class dz_5_1_2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, String> sr = new HashMap<>();

        sr.put(0, "RED");
        sr.put(1, "GREEN");
        sr.put(2, "GREY");
        System.out.println(sr);
        
        
    }
    
}
