public class Practice09182026
{
   public static void main(String[] args)
   {
      /*
      double numberToRound = 3.5;
      int roundedNumber = (int) (numberToRound + 0.5); //with (int) before the sum()
      System.out.println(roundedNumber);
      System.out.println(numberToRound + 0.5); //without (int) before the sum()
      */
      int bigNumber = 2147483647;
      bigNumber = (bigNumber + 1);
      System.out.println(bigNumber);
      System.out.println(Integer.MAX_VALUE);
   }
}