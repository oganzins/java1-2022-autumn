package lv.javaguru.training.lessons6;

public class Math {

        public static int max(int a, int b){
            if (a > b){
                return a;
            }else{
                return b;
            }
    }

    public static int max(int[] numbers){
            int maxNumber = 0;
            for( int number : numbers){
                if (number > maxNumber){
                    maxNumber = number;
                }
            }
            return maxNumber;
    }

    public static void main(String[] args) {
        int maxValue = Math.max(new int[] {-1, 10, 5, 3, 1000, 5, 2});

        System.out.println("Max value is " +maxValue);
    }
}


