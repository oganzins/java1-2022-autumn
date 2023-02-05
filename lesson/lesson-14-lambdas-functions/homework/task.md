# 11. Nodarbība
## 1 Uzdevums
### Funkcionālais kalulators

**Klase FunctionalCalculator**

Pa soļiem:

1. Izveidojiet klasi FunctionalCalculator
```java
public class FunctionalCalculator {

    public static BiFunction<Double, Double, Double> sum() {
        return null;
    }

    public static BiFunction<Double, Double, Double> subtract() {
        return null;
    }

    public static BiFunction<Double, Double, Double> multiply() {
        return null;
    }

    public static BiFunction<Double, Double, Double> divide() {
        return null;
    }

    public static Function<Double, Double> square() {
        return null;
    }

}

```
2. Implementējiet visas medotes, aizstājot tās ar Lambda izteiksmēm.

**Kase FunctionalCalculatorTest**

Pa soļiem:

1. Izveidojied testa klasi FunctionalCaclulatorTest iepriekš uzrakstītajai klasei FunctionalCalculator.
```java
class FunctionalCalculatorTest {

    @Test
    public void shouldSumTwoNumbers() {
        double result = FunctionalCalculator.sum().apply(10.0, 5.0);

        Assertions.assertEquals(15.0, result);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        double result = FunctionalCalculator.subtract().apply(10.0, 5.0);

        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        double result = FunctionalCalculator.multiply().apply(10.0, 5.0);

        Assertions.assertEquals(50.0, result);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        double result = FunctionalCalculator.divide().apply(10.0, 5.0);

        Assertions.assertEquals(2.0, result);
    }

    @Test
    public void shouldSquareNumber() {
        double result = FunctionalCalculator.square().apply(10.0);

        Assertions.assertEquals(100.0, result);
    }
    
}
```
2. Izpildiet testu un pārliecinaties par testa pareizību. Ja testa izpildē ir kļūdas, tad veicam labojumus klasē FunctionalCalculator.

## 2 Uzdevums
### Figuru laukumu aprēķins

**Klase ShapeArea**

1. Izveidojam klasi ShapeArea:
```java
public class ShapeArea {

    public static Function<Double, Double> squareArea() {
        return null;
    }

    public static BiFunction<Double, Double, Double> rectangleArea() {
        return null;
    }

    public static Function<Double, Double> circleArea() {
        return null;
    }

    public static BiFunction<Double, Double, Double> triangleArea() {
        return null;
    }

}
```
2. Implementējam metodes:
   * squareArea = side * side;
   * rectanlgeArea = height * width;
   * circleArea = radius * radius * 3.14;
   * triangleArea = height * side / 2;

**Klase ShapeAreaTest**

1. Izveidojied testa klasi ShapeAreaTest iepriekš uzrakstītajai klasei ShapeArea.
```java
class ShapeAreaTest {

    @Test
    public void shouldCalculateSquareArea() {
        double result = ShapeArea.squareArea().apply(10.0);

        Assertions.assertEquals(100.0, result);
    }

    @Test
    public void shouldCalculateRectangleArea() {
        double result = ShapeArea.rectangleArea().apply(10.0, 5.0);

        Assertions.assertEquals(50.0, result);
    }

    @Test
    public void shouldCalculateCircleArea() {
        double result = ShapeArea.circleArea().apply(10.0);

        Assertions.assertEquals(314.0, result);
    }

    @Test
    public void shouldCalculateTriangleArea() {
        double result = ShapeArea.triangleArea().apply(10.0, 5.0);

        Assertions.assertEquals(25.0, result);
    }

}
```
2. Izpildiet testu un pārliecinaties par testa pareizību. Ja testa izpildē ir kļūdas, tad veicam labojumus klasē ShapeArea.