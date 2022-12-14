public class Triangle {

    public static void main(String[] args) {
        printTriangle(10);
    }


    private static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
            {

            }
        }
    }
}