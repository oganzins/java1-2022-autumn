package lv.javaguru.training.lesson5.Homework;

public class Triangle {
    public static void main(String[] args) {
        printTriangle(11);
    }
    public static void printTriangle(int size){
        for (int i = 1;i <= size;i++){
            for (int j = i; j >0;j--){
                System.out.print(" ");
            }
            for (int j = size;j > i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        }
    }

