/*
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
*/
public class FindMinimum {
   public static int findMin() {
      int minNum = 100;
      for (int pos = 1; pos < 11; pos++) {
         int randNum = (int) (Math.random() * 100);
         System.out.println(pos + ": " + randNum);
         if (randNum < minNum) {
            minNum = randNum;
         }
      }
      return minNum;
   }
   public static void main(String[] args) {
      System.out.println("Minimum value: " + findMin());
   }
}
