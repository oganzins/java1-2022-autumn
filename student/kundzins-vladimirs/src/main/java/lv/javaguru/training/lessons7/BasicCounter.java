package lv.javaguru.training.lessons7;

public class BasicCounter {

    private int counter;

    BasicCounter() {

    }

    public void setCounter(int counter){
        this.counter = counter;
    }

    private int getCounter(){
        return counter;
    }


    public void increment(){
        counter++;
    }
    public void decrement(){
        counter--;
    }



}
