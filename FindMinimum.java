public class FindMinimum {
   public static void main(String[] args) {
      int count = 1;
      int min = 100;
      int max = 0;
      while (count <= 10) {
         int random = (int)(Math.random() * 100);
         if (random < min) {
            min = random;
         }
         if (random > max) {
            max = random;
         }
         System.out.println(count + ": " + random);
         count++;
      }
      System.out.println("Minimum value: " + min);
      System.out.println("Minimum value: " + max);
   }
}

