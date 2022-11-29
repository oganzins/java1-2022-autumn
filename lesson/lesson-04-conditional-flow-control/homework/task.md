# 4. Nodarbība

## 1. Uzdevums
### Pozitīvs-negatīvs skaitlis

Pa soļiem:
1. Izveidojam klasi ar nosaukumu PostiveNegativeNumber.
2. Izveidojam metodi isPostive:
   * Metodes tips ir boolean;
   * Metodei ir viens parametrs ar nosaukumu number un tipu int;
   * Metode atgriež true, ja skaitlis ir pozitīvs;
   * Metode atgriež false, ja skaitlis ir negatīvs vai 0.
```aidl
    public boolean isPositive(int number) {
        ...
    }
```
3. Izveidojam metodi isNegative:
   * Metodes tips ir boolean;
   * Metodei ir viens parametrs ar nosaukumu number un tipu int;
   * Metode atgriež false, ja skaitlis ir pozitīvs vai 0;
   * Metode atgreiž true, ja skaitlis ir negatīvs
```aidl
    public boolean isNegative(int number) {
        ...
    }
```
4. Izveidot main metodi, kurā tiek izpildītas izpildītas isPostive un isNegative metodes sekojošiem skaitļiem:
   * -1
   * -5
   * 0
   * 3
   * 13
```aidl
    public static void main(String[] args) {
        PositiveNegativeNumber positiveNegativeNumber = new PositiveNegativeNumber();
        
        System.out.println(positiveNegativeNumber.isPositive(-1));
        System.out.println(positiveNegativeNumber.isPositive(-5));
        System.out.println(positiveNegativeNumber.isPositive(0));
        System.out.println(positiveNegativeNumber.isPositive(3));
        System.out.println(positiveNegativeNumber.isPositive(13));

        System.out.println(positiveNegativeNumber.isNegative(-1));
        System.out.println(positiveNegativeNumber.isNegative(-5));
        System.out.println(positiveNegativeNumber.isNegative(0));
        System.out.println(positiveNegativeNumber.isNegative(3));
        System.out.println(positiveNegativeNumber.isNegative(13));

    }
```
5. Pārliecināmies, ka konsolē izvadītās vērtības ir korektas.

## 2. Uzdevums
### Lielākais skaitlis no diviem

Pa soļiem:
1. Izveidojam klasi ar nosaukumu GreatestOfTwo.
2. Izveidojam metodi getGreatest:
```aidl
    public int getGreatest(int first, int second) {
        ...
    }
```
3. Implementējam loģiku:
   * Ja first ir lielāks par second, tad atgriežam first
   * Ja first ir mazāks vai vienāds ar second, tad atgriežam second.
4. Izveidojam main metodi, lai izpildītu getGreatest metodi:
```aidl
    public static void main(String[] args) {
        GreatestOfTwo greatestOfTwo = new GreatestOfTwo();
        
        System.out.println(greatestOfTwo.getGreatest(1, 2));
        System.out.println(greatestOfTwo.getGreatest(3, 4));
        System.out.println(greatestOfTwo.getGreatest(3, 3));
    }
```
5. Pārliecināmies, ka konsolē izvadītās vērtības ir korektas.

## 3. Uzdevums
### Nedēļas dienas

**NB!** Implementācijai ir jāizmanto **switch** statement!

Pa soļiem:
1. Izveidojam klasi DaysOfWeek ar metodi getDayName
```aidl
public class DaysOfWeek {

    public String getDayName(int dayNumber) {
        ...
    }

}
```
2. Implementējam metodi getDayName
   * Ja dienas kārtas numurs ir no 1 - 7, tad agriežam dienas nosaukumu (piemēram, ja dienas numurs ir 3, tad atgriežam "Wednesday")
   * Ja numurs ir ārpus diapazona, tad atgriežam - "Unknown"
3. Izveidojam sekojošu main metodi un izpildam programmu:
```aidl
    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = new DaysOfWeek();
        
        System.out.println(daysOfWeek.getDayName(1));
        System.out.println(daysOfWeek.getDayName(2));
        System.out.println(daysOfWeek.getDayName(3));
        System.out.println(daysOfWeek.getDayName(4));
        System.out.println(daysOfWeek.getDayName(5));
        System.out.println(daysOfWeek.getDayName(6));
        System.out.println(daysOfWeek.getDayName(7));
        System.out.println(daysOfWeek.getDayName(-1));
        System.out.println(daysOfWeek.getDayName(1000));
    }
```
4. Pārliecināmies, ka konsolē tiek izvadīti sekojoši rezultāti:
   * Monday
   * Tuesday
   * Wednesday
   * Thursday
   * Friday
   * Saturday
   * Sunday
   * Unknown
   * Unknown

## 4. Uzdevums lielākais skaitlis no trim

1. Izveidot klasi ar nosaukumu GreatestOfThree.
2. Izveidot metodi getGreatest:
```aidl
    public int getGreatest(int first, int second, int third) {
        ...
    }
```
3. Implementējam loģiku:
   * Ja first ir *lielāks* par *second* un *third*, tad atgriežam *first*.
   * Ja second ir *lielāks* par *first* un *third, tad atgriežam *second*.
   * Ja third ir *lielāks* par *second* un *third*, tad atgriežam *third*.
   * Ja visi skaitļi ir vienādi, tad atgriežam *first*.
4. Izveidojam main metodi, lai izpildītu getGreatest metodi:
```aidl
    public static void main(String[] args) {
        GreatestOfThree greatestOfThree = new GreatestOfThree();
        
        System.out.println(greatestOfThree.getGreatest(1, 2, 3));
        System.out.println(greatestOfThree.getGreatest(3, 4, 2));
        System.out.println(greatestOfThree.getGreatest(3, 2, 1));
        System.out.println(greatestOfThree.getGreatest(3, 3, 3));
    }
```
5. Pārliecināmies, ka konsolē izvadītās vērtības ir korektas.

## 4. Uzdevums
Pāra / nepāra skaitlis

Pa soļiem:

1. Izveidojam klasi EvenOddNumber
2. Izveidojam metodi getNumberType
```aidl
public class EvenOddNumber {

    public String getNumberType(int number) {
        ...
    }

}

```
3. Ja skaitlis ir pāra skaitlis, tad metode atgriež "Even"
4. Ja skaitlis ir nepāra skaitlis, tad metode atgriež "Odd"
5. Implementējam getNumberType metodi - ja parametra number dalījuma ar 2 atlikums ir 0, tad skaitlis ir pāra skaitlis, ja nē, tad skaitlis ir nepāra (izmantojam % operatoru, lai iegūtu atlikumu).
6. Izveidojam main metodi, lai pārbaudīt getNumberType metodi:
```aidl
    public static void main(String[] args) {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        
        System.out.println(evenOddNumber.getNumberType(1));
        System.out.println(evenOddNumber.getNumberType(0));
        System.out.println(evenOddNumber.getNumberType(10));
        System.out.println(evenOddNumber.getNumberType(13));
        System.out.println(evenOddNumber.getNumberType(4));
    }
```
7. Pārliecināmies, ka konsolē izvadītās vērtības ir korektas.

## 5. Uzdevums
### Gaismas krāsas analīze
Ir jāizveido programma, kas atkarībā no gaismas viļņa garuma spēj noteikt gaimsas stara krāsu.

Gaismas stara krāsa atkarībā no gaisma viļņa garuma:
* 380 ... 449 - Violets ("Violet")
* 450 ... 494 - Zils ("Blue")
* 495 ... 569 - Zaļš ("Green")
* 570 ... 589 - Dzeltens ("Yellow")
* 590 ... 619 - Oranžs ("Orange")
* 620 ... 750 - Sarkans ("Red")
* Jebkāds cits diapazons - neredzama gaisma ("Invisible Light")

Pa soļiem:

1. Izveidojam klasi ar nosaukumu LightColorDetector
2. Izveidojam metodi detect:
```aidl
public class LightColorDetector {

  public String detect(int wavelength) {
    ...
  }

}
```
3. Implementējam gaismas krāsas noteikšanu izmantojot vilņa garaumu.
4. Izveidojam metodi printColor:
```aidl
    public void printColor(int wavelength) {
        System.out.println("If light wavelength is " + wavelength + " then light color is " + detect(wavelength));
    }
```
4. Izveidojam main metodi, kurā izsaucam printColor dažādiem gaismas viļņa garumiem.
```aidl
    public static void main(String[] args) {
        LightDetector lightDetector = new LightDetector();

        lightDetector.printColor(-1);
        lightDetector.printColor(100);
        lightDetector.printColor(380);
        lightDetector.printColor(460);
        lightDetector.printColor(569);
        lightDetector.printColor(600);
        lightDetector.printColor(750);
        lightDetector.printColor(1200);
    }
```
5. Pārliecināmies, ka konsolē izvadītās vērtības ir korektas.

