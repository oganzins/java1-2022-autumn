package lv.javaguru.training.lesson08.single;

public class SingleInheritanceDemo {

    public static void main(String[] args) {
        A objectA = new A();
        System.out.println(objectA.getField());
        System.out.println(objectA.getProtectedField());
        System.out.println(objectA.getName());

        B objectB = new B();
        System.out.println(objectB.getField());
        System.out.println(objectB.getProtectedField());
        System.out.println(objectB.getName());
        System.out.println(objectB.getSpecialField());
    }

}
