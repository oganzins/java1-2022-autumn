package lv.javaguru.training.lessons11.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapVsList {

    public static void main(String[] args) {
        String[] countryArray = {"Latvia", "Denmark", "United State of America"};
        System.out.println(countryArray[0]);

        List<String> countryList = new ArrayList<>();
        countryList.add("Latvia");
        countryList.add("Denmark");
        countryList.add("United States of America");

        System.out.println(countryList.get(0));//Latvia

        Map<Integer, String> countryMap = new HashMap<>();
        countryMap.put(0, "Latvia");
        countryMap.put(1, "Denmark");
        countryMap.put(2,"United States of America");

        System.out.println(countryMap.get(0));


    }
}
