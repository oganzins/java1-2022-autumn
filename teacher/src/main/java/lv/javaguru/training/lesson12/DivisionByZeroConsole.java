package lv.javaguru.training.lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZeroConsole {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            int a = readAValueFrom(console);
            int b = readBValueFrom(console);
            int result = a / b;
            System.out.println("A / B = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Nedrīkst dalīt ar nulli!");
        } catch (IncorrectValueException e) {
            System.out.println(e.getMessage());
        } finally {
            console.close();
        }
    }

    private static int readAValueFrom(Scanner console) throws IncorrectValueException{
        try {
            System.out.println("Ievadiet skaitļa A vertību: ");
            return console.nextInt();
        } catch (InputMismatchException e) {
            throw new IncorrectValueException("Nekorekti ievadīta A vērtība");
        }
    }

    private static int readBValueFrom(Scanner console) throws IncorrectValueException {
        try {
            System.out.println("Ievadiet skaitļa B vērtību: ");
            return console.nextInt();
        } catch (InputMismatchException e) {
            throw new IncorrectValueException("Nekorekti ievadīta B vērtība");
        }
    }

}
