public class ProjectEuler {
   
   public static int problem1() {
      int number = 1;
      int sum = 0;
      while (number < 1000) {
         if (number % 3 == 0 || number % 5 == 0) {
            sum += number;
         }
         number++;
      }
      return sum;
   }
   
   public static int problem2() {
      return 0;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());  
   }  
}