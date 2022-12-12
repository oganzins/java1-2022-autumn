# 7. Nodarbība
## 1. Uzdevums
### Taisnstūris

Pa soļiem:

1. Izveidojam jaunu klasi Rectangle.
2. Izveidojam divus klases laukus width un height; nosacījumi abiem laukiem:
   * Datu tips ir int;
   * Abi lauki nav redzami ārpus klases (abi lauki ir private).
3. Izveidojam publisku konstruktoru, kas kā argumenetus saņem width un height.
4. Izveidojam publiskas getter metodes abiem klases laukiem.
5. Izveidojam publisku metodi calculateArea(), kas aprēķina taisnstūra laukumu.
6. Izveidoam publisku metodi calculatePerimeter(), kas aprēķina taisnstūra perimetru.
7. Izveidojam klasi RectangleDemo:
```java
public class RectangleDemo {

    public static void main(String[] args) {
        print(new Rectangle(5, 4));
        print(new Rectangle(9, 10));
        print(new Rectangle(1, 2));
    }

    private static void print(Rectangle rectangle) {
        System.out.println("Rectangle width is " + rectangle.getWidth());
        System.out.println("Rectangle height is " + rectangle.getHeight());
        System.out.println("Rectangle area is " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter is " + rectangle.calculatePerimeter());
        System.out.println();
    }

}
```
8. Izpildam kodu un pārliecināmies, ka konsolē tiek izdrukāts sekojošais:
```
Rectangle width is 5
Rectangle height is 4
Rectangle area is 20
Rectangle perimeter is 18

Rectangle width is 9
Rectangle height is 10
Rectangle area is 90
Rectangle perimeter is 38

Rectangle width is 1
Rectangle height is 2
Rectangle area is 2
Rectangle perimeter is 6

```
## 2. uzdevums
### Kredītkarte

Pa soļiem:

1. Izveidojam klasi CreditCard ar sekojošiem privātiem laukiem:
   * name - kartes īpašnieka vārds;
   * number - kartes numurs;
   * balance - kartes bilance (datu tips: double);
   * pinCode - kartes pinkods;
   * invalidPinCodeCounter - uzskaita, cik reizes ir ievadīts nepareizs pinkods - noklusētā vērtība ir 0;
   * active - boolean tipa lauks, kas nosaka vai karte ir aktīva - noklusētā vērtība ir true; 
   * authorized - boolean tipa lauks, kas nosaka, ka lietotājs ir autorizētjies - noklusētā vērtība ir false.
2. Izveidojam divus publiskus konstruktorus ar sekojošiem argumentiem:
   * name, number, pinCode, balance
```java
    public CreditCard(String name, String number, String pinCodem, double balance) {
        //Add code here  
    }
```

   * name, number, pinCode, balance - šim konstruktoram ir jāizsauc otrs konstruktors:

```java
    public CreditCard(String name, String number, String pinCode) {
        this(name, number, pinCode, 0.00);
    }
```
3. Implementējam sekojošas getter metodes:
   * getName()
   * getNumber()
   * isActive()
   * isAuthorized()
4. Implementējam metodi login
   * ja kartes lauks active ir true un padotais pinCode sakrīt ar this.pinCode, tad uzstādam authorized = true;
   * ja pinCode ievadīts pareizi, tad nonullējam invalidPinCodeCounter
   * ja padotais pinCode nesakrīt ar pinCode, tad palielinām invalidPinCodeCounter par vienu vērtību
   * ja invalidPinCounter vērtība ir >= 3, tad uzstādam active = false;
```java
    public void login(String pinCode) {
        //Add code here
    }
```
5. Implementējam metodi logout:
   * Uzstādam authorized == false
```java
    public void logout() {
        //Add code here
    }
```
6. Implementējam metodi deposit - naudas ieskaitīšana kartē:
   * metode saņem vienu double tipa argumentu ar nosaukumu amount;
   * ja authorized == true, tad pārējam pie nākamās darbības, kur
   * amount tiek pieskaitīts bilance vērtībai;
```java
    public void deposit(double amount) {
        //Add code here
    }
```
7. Implementējam metodi withdraw - naudas izņemšana no kartes:
   * metode saņem vienu double tipa argument ar nosaukumu amount;
   * ja authorized == true un kartē pietiek naudas, tad veicam darbību, kur
   * amount tiek atņemts no bilance vērtības
```java
    public void withdraw(double amount) {
        //Add code here
    }
```

9. Izveidojam sekojošu CreditCardTest klasi
```java
public class CreditCardTest {


    public static void main(String[] args) {
        initialValueTest();
        cardIsBlockedAfterThreeInvalidLoinAttempts();
        successfulLoginTest();
        successfulLogoutTest();
        depositTest();
        withdrawTest();
    }


    private static void initialValueTest() {
        CreditCard creditCard = new CreditCard("JOHN DOE", "5553 0422 4198 4105", "1234", 100.00);
        System.out.println("Initial balance test - PASSED: " + (creditCard.getBalance() == 100.00));
        System.out.println("Initial is active test - PASSED: " + creditCard.isActive());
        System.out.println("Initial ia authorized test - PASSED: " + (!creditCard.isAuthorized()));
        System.out.println("Card name test - PASSED: " + creditCard.getName().equals("JOHN DOE"));
        System.out.println("Card number test - PASSED: " + creditCard.getNumber().equals("5553 0422 4198 4105"));

        creditCard = new CreditCard("JOHN DOE", "5553 0422 4198 4105", "1234");
        System.out.println("Initial balance not specified test - PASSED: " + (creditCard.getBalance() == 0.00));

    }

    private static void cardIsBlockedAfterThreeInvalidLoinAttempts() {
        CreditCard creditCard = new CreditCard("JOHN DOE", "5553 0422 4198 4105", "1234", 100.00);
        creditCard.login("0000");
        creditCard.login("0000");
        creditCard.login("0000");

        System.out.println("Card is blocked after three invalid login attempts - PASSED: " + !creditCard.isActive());
    }

    private static void successfulLoginTest() {
        CreditCard creditCard = new CreditCard("JOHN DOE", "5553 0422 4198 4105", "1234", 100.00);
        creditCard.login("1234");

        System.out.println("Card is active after login - PASSED: " + creditCard.isActive());
        System.out.println("Card is authorized after login - PASSED: " + creditCard.isActive());
    }

    private static void successfulLogoutTest() {
        CreditCard creditCard = new CreditCard("JOHN DOE", "5553 0422 4198 4105", "1234", 100.00);
        creditCard.login("1234");
        creditCard.logout();

        System.out.println("Card is active after logout - PASSED: " + creditCard.isActive());
        System.out.println("Card is not authorized after logout - PASSED: " + creditCard.isActive());
    }

    private static void depositTest() {
        CreditCard creditCard = new CreditCard("JOHN DOE", "5553 0422 4198 4105", "1234", 100.00);
        creditCard.deposit(100.00);

        System.out.println("Deposit doesn't work if user is not authorized test - PASSED: "
                + (creditCard.getBalance() == 100.00));

        creditCard.login("1234");
        creditCard.deposit(100.00);
        System.out.println("Deposit test - PASSED: " + (creditCard.getBalance() == 200.00));
    }

    private static void withdrawTest() {
        CreditCard creditCard = new CreditCard("JOHN DOE", "5553 0422 4198 4105", "1234", 100.00);
        creditCard.withdraw(60.00);

        System.out.println("Withdraw doesn't work if user is not authorized test - PASSED: "
                + (creditCard.getBalance() == 100.00));

        creditCard.login("1234");
        creditCard.withdraw(60.00);
        System.out.println("Withdraw test - PASSED: " + (creditCard.getBalance() == 40.00));

        creditCard.withdraw(60.00);
        System.out.println("Cannot withdraw more than left balance test - PASSED: " + (creditCard.getBalance() == 40.00));

    }
    
}
```
10. Izpildām klasi un pārliecināmies, ka visi testi ir veiksmigi izieti:
```
Initial balance test - PASSED: true
Initial is active test - PASSED: true
Initial ia authorized test - PASSED: true
Card name test - PASSED: true
Card number test - PASSED: true
Initial balance not specified test - PASSED: true
Card is blocked after three invalid login attempts - PASSED: true
Card is active after login - PASSED: true
Card is authorized after login - PASSED: true
Card is active after logout - PASSED: true
Card is not authorized after logout - PASSED: true
Deposit doesn't work if user is not authorized test - PASSED: true
Deposit test - PASSED: true
Withdraw doesn't work if user is not authorized test - PASSED: true
Withdraw test - PASSED: true
Cannot withdraw more than left balance test - PASSED: true
```