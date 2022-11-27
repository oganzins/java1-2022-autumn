package lv.javaguru.training.lesson4;

public class Bird {

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sing() {
        System.out.println("Čiv, čiv, čiv!");
    }

    public static void main(String[] args) {
        Bird myBird = new Bird("Arnolds");
        myBird.sing();
        myBird.getName();
    }

}
