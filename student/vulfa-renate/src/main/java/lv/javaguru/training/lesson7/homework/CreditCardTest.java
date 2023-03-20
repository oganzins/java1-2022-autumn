package lv.javaguru.training.lesson7.homework;

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
