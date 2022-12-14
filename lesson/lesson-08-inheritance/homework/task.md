# 8. Nodarbība
## 1. Uzdevums
### Automobīlis

Pa soļiem:

**Klase Car**

1. Izveidojam jaunu klasi **Car**, kurai ir sekojoši lauki:
   * **color** - krāsa;
   * **year** - izlaides gads;
   * **make** -  ražotājs;
   * **model** - modelis
2. Izveidojam konstrutkoru, kurš saņem visus klases laukus kā parametrus.
3. Visiem klases laikiem izveidojam **get** un **set** metodes.
4. Izveidojam **toString()** metodi:
```java
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
```
5. Izveidojam **quals()** metodi:
```java
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year
                && Objects.equals(color, car.color)
                && Objects.equals(make, car.make) && Objects.equals(model, car.model);
    }

```
6. Izviedojam **hashCode()** metodi
```java
    @Override
    public int hashCode() {
        return Objects.hash(color, year, make, model);
    }
```

**Klase Truck**

1. Izveidojam klasi **Truck**, kura manto klasi **Car**.
2. Klasei **Truck** jāizveido papildus lauks - **loadCapacity**, kas apzīmē pārvadājamās kravas apjomu.
3. Kasei ir jāizveido konstruktors, kuram padod visus **Car** klases laukus un arī **loadCapacity**.
4. Klases laukam **loadCapacity** ir jāizveido **get** un **set** metodes.
5. Izveidojam **toString()** metodi:
```java
    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", year='" + getYear() + '\'' +
                ", manufacturer='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", loadCapacity=" + loadCapacity +
                "} ";
    }
```
6. Izveidojam **equals()** metodi:
```java
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }
```
7. Izveidojam **hashCode()** metodi:
```java
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }
```

**Klase Bus**

1. Izveidojam klasi **Bus**, kura manto klasi **Car**.
2. Klasei **Bus** jāizveido papildus lauks **passengerCount**, kas apzīmē pārvadājamo pasažieru daudzums.
3. Kasei ir jāizveido konstruktors, kuram padod visus **Car** klases laukus un arī **passengerCount**.
4. Klases laukam **passengerCount** ir jāizveido **get** un **set** metodes.
5. Izveidojam **toString()** metodi:
```java
    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", year='" + getYear() + '\'' +
                ", manufacturer='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", passengerCount=" + passengerCount +
                "} ";
    }
```
6. Izveidojam **equals()** metodi:
```java
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengerCount == bus.passengerCount;
    }
```
7. Iveidojam **hashCode()** metodi:
```java
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerCount);
    }
```

**Klase ParkingLot**

1. Izveidojam klasi ParkingLot:
```java
public class ParkingLot {

    public static void main(String[] args) {
        Car car1 = new Car("Black", 2020, "Audi", "A4");
        System.out.println(car1);

        Car car2 = new Car("Black", 2020, "Audi", "A4");
        System.out.println(car2);
        System.out.println("Is car1 equal to car2? " + car1.equals(car2));

        Car car3 = new Car("Red", 2022, "Bmw", "330");
        System.out.println(car3);
        System.out.println("Is car1 equal to car3? " + car1.equals(car3));

        Truck truck = new Truck("Blue", 2018, "Volvo", "FH16", 10000);
        System.out.println(truck);

        Bus bus = new Bus("Yellow", 2020, "Mercedes", "Citro", 30);
        System.out.println(bus);
    }

}
```
2. Izpildam klases main metodi un pārliecināmies par to, ka rezultāts sakrit ar:
```
Car{color='Black', year=2020, make='Audi', model='A4'}
Car{color='Black', year=2020, make='Audi', model='A4'}
Is car1 equal to car2? true
Car{color='Red', year=2022, make='Bmw', model='330'}
Is car1 equal to car3? false
Truck{color='Blue', year='2018', manufacturer='Volvo', model='FH16', loadCapacity=10000} 
Truck{color='Yellow', year='2020', manufacturer='Mercedes', model='Citro', passengerCount=30} 
```

## 2. uzdevums
### Figūras

Pa soļiem:

**Kalse Cricle**

1. Izveidojam klasi **Circle**
2. Izveidojam klases konstrutoru visiem laukiem.
3. Klasei ir viens lauks - radius (double) - kas apzīmē riņķa līnijas rādiusu.
4. Izveidojam metodi **getRadius()**.
5. Klasei ir divas metodes:
   * double area() - aprēkina riņķa laukumu (3.14 * rādiuss * rādiuss)
   * double length() - aprēķina riņķa līnijas garumu (2 * 3.14 * rādiuss)

**Klase Cylinder**

1. Izveidojam klasi **Cylinder**, kas manto klasi **Circle**.
2. Izveidojam klases konstrutoru visiem laukiem. 
3. Klasei **Cylinder** ir papildus lauks - height - augstums.
4. Izveidojam metodi **getHeight()**.
5. Klasei **Cylinder** ir viena papildus metode - double volume(), kas aprēķina tilpumu (riņķa laukums * augstums).

**Klase Cone**

1. Izveidojam klasi **Cone**, kas manto klasi **Cylinder**.
2. Izveidojam klases konstruktoru.
3. Pārdefinējam (override) metodi double volume() - konusa tilpumu aprēķina pēc formulas (riņķa laukums * augstums / 3)

**Klase ShapeDemo**

1. Izveidojam klasi **ShapeDemo**:
```java
public class ShapeDemo {

   public static void main(String[] args) {
      Circle circle = new Circle(10);
      System.out.println("Circle length is " + circle.length());
      System.out.println("Circle area is " + circle.area());
      System.out.println();

      Cylinder cylinder = new Cylinder(10, 5);
      System.out.println("Cylinder volume is " + cylinder.volume());
      System.out.println();

      Cone cone = new Cone(10, 5);
      System.out.println("Cone volume is " + cone.volume());
      System.out.println();
   }

}
```
2. Izpildam main metodi un pārliecināmies salīdzinam ar rezultātu:
```
Circle length is 62.800000000000004
Circle area is 314.0

Cylinder volume is 1570.0

Cone volume is 523.3333333333334
```