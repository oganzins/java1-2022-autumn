package lv.javaguru.training.lesson08.multilevel;

public class MultilevelInheritance {

    public static void main(String[] args) {
        A objectA = new A();
        objectA.getAField();

        B objectB = new B();
        objectB.getAField();
        objectB.getBField();

        C objectC = new C();
        objectC.getAField();
        objectC.getBField();
        objectC.getCField();
    }

}
