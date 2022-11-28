package lesson4.homework;

public class PositiveNegativeNumber {

private boolean flag1 = true;
private boolean flag2 = false;

   public boolean isPositive(int number) {

      if (number > 0) {
         return flag1;
      } else {
         return flag2;
      }
   }

   public boolean isNegative(int number) {
      if (number >= 0) {
         return flag2;
      } else {
         return flag1;
      }
   }




   public static void main(String[] args) {
      PositiveNegativeNumber PositiveNegativeNumber = new PositiveNegativeNumber();
      System.out.println(PositiveNegativeNumber.isPositive(-1));
      System.out.println(PositiveNegativeNumber.isPositive(-5));
      System.out.println(PositiveNegativeNumber.isPositive(0));
      System.out.println(PositiveNegativeNumber.isPositive(3));
      System.out.println(PositiveNegativeNumber.isPositive(13));

      System.out.println(PositiveNegativeNumber.isNegative(-1));
      System.out.println(PositiveNegativeNumber.isNegative(-5));
      System.out.println(PositiveNegativeNumber.isNegative(0));
      System.out.println(PositiveNegativeNumber.isNegative(3));
      System.out.println(PositiveNegativeNumber.isNegative(13));
   }}