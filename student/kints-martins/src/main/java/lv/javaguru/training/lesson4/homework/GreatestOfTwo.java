package lv.javaguru.training.lesson4.homework;

public class GreatestOfTwo {

    public int getGreatest(int first, int second) {
        if (first > second) {
            return first;
        } else if (first <= second) {
            return second;
        }
        //Kādēļ korektors liek uzlikt 12-o rindu??
        return first;
    }
}




