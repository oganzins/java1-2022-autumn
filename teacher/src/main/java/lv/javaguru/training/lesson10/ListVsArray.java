package lv.javaguru.training.lesson10;

import java.util.ArrayList;
import java.util.List;

public class ListVsArray {

    public static void main(String[] args) {
        //Inicializācija
        String[] nameArray = new String[10];
        List<String> nameList = new ArrayList<>();

        //Elementa pievienošana
        nameArray[0] = "John";
        nameList.add("John");
        nameList.add(0, "Marry");

        //Elementa izgūšana
        String nameFromArray = nameArray[0];
        String nameFromList = nameList.get(0);

        //Elementa noņemšana
        nameArray[0] = null;
        nameList.remove(0);

        //Izmērs
        int arraySize = nameArray.length;
        int listSize = nameList.size();
    }

}
