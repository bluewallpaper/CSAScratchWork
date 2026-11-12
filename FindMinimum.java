public class FindMinimum {
   public static void main(String[] args) {
      int count = 1;
      int min = 100;
      while (count <= 10) {
         int random = (int)(Math.random() * 100);
         if (random < min) {
            min = random;
         }
         System.out.println(count + ": " + random);
         count++;
      }
      System.out.println(min);
   }
}
