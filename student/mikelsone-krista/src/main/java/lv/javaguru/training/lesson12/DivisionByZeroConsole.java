package lv.javaguru.training.lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZeroConsole {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = 0;
        try {
            System.out.println("ievadiet skaitla A vertibu: ");
            try{
                a = console.nextInt();
            }catch (InputMismatchException e){
                throw new IncorectValueExcption("Nekorekti ievadita A vertiba") ;
            }


            System.out.println("ievadiet skaitla B vertibu: ");
            int b = 0;
            try{
                b = console.nextInt();
            }catch (InputMismatchException e){
                throw new IncorectValueExcption("Nekorekti ievadita B vertiba") ;
            }
            int result = a / b;
            System.out.println("A / B = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Nedrikst dalit ar nulli!");
        } catch (InputMismatchException e) {
            System.out.println("Nekorekti ievadita A vai B vertiba!");
        }finally{
            if (console != null){
                console.close();
            }
        }
    }
}
