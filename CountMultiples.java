public class CountMultiples {
   public static int countMultiples(int num1, int num2) {
      int count = 0;
      while (num1 >= 1) {
         if (num1 % num2 == 0)  {
            count++;
         }
         num1--;
      }
   return count;
   }
   public static void main(String[] args) { 
      System.out.println(countMultiples(20, 3));
      System.out.println(countMultiples(100, 5));
      System.out.println(countMultiples(12, 4));
      System.out.println(countMultiples(5, 10));
      System.out.println(countMultiples(15, 1));
      System.out.println(countMultiples(7, 7));
      System.out.println(countMultiples(10, 2));
      System.out.println(countMultiples(0, 3));
   }
}