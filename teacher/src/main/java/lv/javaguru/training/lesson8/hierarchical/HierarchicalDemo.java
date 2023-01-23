package lv.javaguru.training.lesson8.hierarchical;

public class HierarchicalDemo {

    public static void main(String[] args) {
        A objectA = new A();
        System.out.println(objectA.getAField());
        System.out.println();

        B objectB = new B();
        System.out.println(objectB.getAField());
        System.out.println(objectB.getBField());
        System.out.println();

        C objectC = new C();
        System.out.println(objectC.getAField());
        System.out.println(objectC.getCField());
        System.out.println();

        D objectD = new D();
        System.out.println(objectD.getAField());
        System.out.println(objectD.getDField());
        System.out.println();
    }

}
