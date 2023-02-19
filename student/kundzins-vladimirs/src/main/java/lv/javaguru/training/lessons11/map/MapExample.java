package lv.javaguru.training.lessons11.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("LV", "LATVIA");
        countries.put("DK","Denmark");
        countries.put("US", "United States of America");
        countries.put("DE", "Germany");

        countries.remove("DE");

        System.out.println(countries.get("US"));
        System.out.println(countries.get("NZ"));
        System.out.println(countries.containsKey("DK"));
        System.out.println(countries.size());
        System.out.println(countries);

        System.out.println(countries.values());
        System.out.println(countries.keySet());

        for(String key : countries.keySet()){
            System.out.println(key);
        }
        for (String value : countries.values()){
            System.out.println(value);
        }
        for (Map.Entry<String, String> entry : countries.entrySet()){
            System.out.println(entry.getKey() + " : " +entry.getValue());
        }
    }
}
