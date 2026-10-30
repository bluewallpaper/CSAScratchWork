public class WhilePractice {
   public static void main(String[] args) {
      int speedLimit = 20;
      
      int currentSpeed = 0;
      
      while (currentSpeed <= speedLimit) {
         System.out.println("Current speed is " + currentSpeed);
         currentSpeed++;
      }
   }
}