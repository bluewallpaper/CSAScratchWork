public class BooleanPractice {
   public static void main(String[] args) {
      int num = 45;
      if (num < 44)
         System.out.println("num is bigger than 20");
      if (true && true) {
         System.out.println("A");
      }
      else {
         System.out.println("B");
      }
      if ((3 > 2) && (9 < 10)) {
         System.out.println("C");
      } else {
         System.out.println("D");
      }
      if ((3 > 2) || (10 != 10)) {
         System.out.println("E");
      } else {
         System.out.println("F");
      }
   }
}