# 9. Nodarbība
## 1. Uzdevums
### Dzīvinieki

Pa soļiem:

1. Izveidojam abstraktu klasi **Animal**:
```java
public abstract class Animal {

    public abstract void voice();

    public void sleep() {
        System.out.println("Zzz...");
    }

}
```
2. Izveidojam 5 patvaļīgas implementācijas dažādiem dzīvniekiem. Piemērs:
```java
public class Pig extends Animal {

    @Override
    public void voice() {
        System.out.println("Oink, oink, oink");
    }
}

```
3. Vismaz vienai no jaunizveidotajām klasēm ir jāpārdefinē(override) **sleep()** metode.
4. Izveidojam klasi AnimalDemo, kur inicializējam visus objektu tipus
```java
public class AnimalDemo {

    public static void main(String[] args) {
        Animal animal = new Pig();
        animal.voice();
        animal.sleep();
        ...
    }

}
```
## 2. Uzdevums
### Figūras

Pa soļiem:

1. Izvedojam interfeisu Shape:
```java
public interface Shape {

    double calculateArea();

}
```
2. Izveidojam implementācijas sekojošām figurām:
   * Circle;
   * Rectangle;
   * Square;
   * Triangle - laukuma apreķins: augstums * mala pret kuru novilkts augstums / 2;
3. Izveidojam klasi **ShapeDemo**, kurā izviedojam vismaz vienu objektu katrai figūras klasei un izsaucam metodi calculateArea():
```java
public class ShapeDemo {

    public static void main(String[] args) {
        ...
    }

}
```

## 3. Uzdevums
### Darbinieki

Pa soļiem:

**Interfeiss Payable**

1. Izveidojam interfeisu **Payable**:
```java
public interface Payable {

    double pay();
    
}
```

**Klase Employee**
1. Izveidojam klasi **Employee** ar sekojošiem laukiem:
   * firstName;
   * lastName;
2. Klase **Employee** ir abstrakta klase.
3. Klase **Employee** implementē interfeisu **Payable**.
4. Izveidojam **get** un **set** metodes klases laukiem.
5. Izveidojam klases konstruktoru.

**Klase HourlyEmployee**

1. Izveidojam klasi **HourlyEmployee**.
2. Klase **HourlyEmployee** manto klasi **Employee**.
3. Klases lauki:
   * hoursWorked - kopā nostrādātās stundas
   * payRate - samaksa par darba stundu
4. Izveidojam **set** un **get** metodes klases laukiem.
5. Izveidojam klases konstruktoru.
6. Implementējam **pay()** metodi - **hoursWorked** * **payRate**

**Klase SalariedEmployee**

1. Izveidojam klasi **SalariedEmployee**.
2. Klase **SalariedEmployee** manto klasi **Employee**.
3. Klases lauki:
   * salary.
4. Izveidojam klases konstuktoru.
5. Izveidojam **get** un **set** metodes **salary** laukam.
6. Impelementējam metodi **pay()** metodi, kas atgriež lauka **salary** vērtību.


**Klase Executive**

1. Izviedojam klasi **Executive**, kas manto klasi **SalariedEmployee**
2. Klases lauki:
   * bonus
3. Izveidojam klases konstruktoru.
4. Izveidojam **get** un **set** metdoes **bonus** laukam.
5. Pārdefinējam (override) metodi **pay()** - **getSalary()** + **bonus**.

**Klase EmployeeDemo**

1. Izveidojam klasi **EmployeeDemo**.
```java
public class EmployeeDemo {

   public static void main(String[] args) {
      Employee hourlyEmployee = new HourlyEmployee("John", "Smith", 10, 160);
      System.out.println("Hourly employee salary: " + hourlyEmployee.pay());

      Employee salariedEmployee = new SalariedEmployee("Jane", "Doe", 2000.00);
      System.out.println("Salaried employee salary: " + salariedEmployee.pay());

      Employee executive = new Executive("Jeffry", "Bezos", 5000, 5000);
      System.out.println("Executive salary: " + executive.pay());
   }

}
```
2. Izpildām to un pārliecināmies, ka rezultāts sakrīt ar:
```java
Hourly employee salary: 1600.0
Salaried employee salary: 2000.0
Executive salary: 10000.0
```