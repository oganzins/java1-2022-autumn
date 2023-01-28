# 11. Nodarbība
## Uzdevums
### Tests klasei Kalkulators

**Klase Calculator**

Pa soļiem:

1. Izveidojiet klasi Calculator
```java
public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

}
```
2. Izveidojam testa kalsi CalculatorTest (..src/test/lv/javaguru/training/lesson13/CalculatorTest)
```Java
package lv.javaguru.training.lesson13;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

}
```
3. Izveidojam sekojošas testa metodes **Calculator.sum** metodei
   * a = pozitīvs skaitlis, b = pozitīvs skaitlis;
   * a = negatīvs skaitlis, b = pozitīvs skaitlis;
   * a = negatīvs skaitlis, b = negatīvs skaitlis;
   * a = nulle, b = pozitīvs skaitlis;
   * a = nulle, b = negatīvs skaitlis;
   * a = pozitīvs skaitlis, b = nulle;
   * a = negatīvs skaitlis, b = nulle;
   * a = nulle, b = nulle.
4. Izveidojam sekojošas testa metodes **Calculator.subtract** metodei
   * a = pozitīvs skaitlis, b = pozitīvs skaitlis;
   * a = negatīvs skaitlis, b = pozitīvs skaitlis;
   * a = negatīvs skaitlis, b = negatīvs skaitlis;
   * a = nulle, b = pozitīvs skaitlis;
   * a = nulle, b = negatīvs skaitlis;
   * a = pozitīvs skaitlis, b = nulle;
   * a = negatīvs skaitlis, b = nulle;
   * a = nulle, b = nulle.
5. Izveidojam sekojošas testa metodes **Calculator.multiply** metodei
   * a = pozitīvs skaitlis, b = pozitīvs skaitlis;
   * a = negatīvs skaitlis, b = pozitīvs skaitlis;
   * a = negatīvs skaitlis, b = negatīvs skaitlis;
   * a = nulle, b = pozitīvs skaitlis;
   * a = nulle, b = negatīvs skaitlis;
   * a = pozitīvs skaitlis, b = nulle;
   * a = negatīvs skaitlis, b = nulle;
   * a = nulle, b = nulle.
6. Izveidojam sekojošas testa metodes **Calculator.divide** metodei
   * a = pozitīvs skaitlis, b = pozitīvs skaitlis;
   * a = negatīvs skaitlis, b = pozitīvs skaitlis;
   * a = negatīvs skaitlis, b = negatīvs skaitlis;
   * a = nulle, b = pozitīvs skaitlis;
   * a = nulle, b = negatīvs skaitlis;
   * a = pozitīvs skaitlis, b = nulle **(Šeit jāpārbauda, ka tiek mests ArithmeticException)**;
   * a = negatīvs skaitlis, b = nulle **(Šeit jāpārbauda, ka tiek mests ArithmeticException)**;
   * a = nulle, b = nulle.
7. Pārliecināmies, ka visi testi izpildās un kopā ir jābūt **32** testa metodēm.