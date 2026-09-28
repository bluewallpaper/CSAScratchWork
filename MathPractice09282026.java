public class MathPractice09282026
{
   public static void main(String[] args)
   {
      //System.out.println(Math.abs(-5));
      //System.out.println(Math.pow(2, 5));
      //System.out.println(Math.sqrt(2));
      System.out.println(Math.random() * 10); // Math.random() returns [0, 1)
                                              // Math.random() * 10 returns [0 * 10, 1 * 10) = [0, 10)
      System.out.println((int) (Math.random() * 10)); //with (int) it will return int numbers
      System.out.println((int) (Math.random() * 10 + 5)); // a random number between [0, 10) + 5
   }
}