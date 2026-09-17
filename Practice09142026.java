import java.util.Scanner;

public class Practice09142026 {
   public static void main(String[] arg) {
      System.out.println("Soccer Match");
      boolean todayMatch = true;
      String teamName_1 = ("Null");
      String teamName_2 = ("Null");
      int teamGoals_1 = 0;
      int teamGoals_2 = 0;
      double matchMinutes = 0;
      double matchSeconds = 0;
      
      System.out.println("Enter the First team: ");
      Scanner scan = new Scanner(System.in);
      teamName_1 = scan.nextLine();
      System.out.println("Enter the second team: ");
      teamName_2 = scan.nextLine();
      System.out.println("Today's Match");
      System.out.println("[" + teamName_1 + "]" + " VS " + "[" + teamName_2 + "]");
      
      System.out.println("\n" + "[" + teamName_1 + "]" + " Total Goals: ");
      teamGoals_1 = scan.nextInt();
      System.out.println("\n" + "[" + teamName_2 + "]" +  " Total Goals: ");
      teamGoals_2 = scan.nextInt();
      System.out.println("\nHow many minutes.seconds did the match last (including stoppage)?: ");
      matchMinutes = scan.nextDouble();
      
      matchSeconds = matchMinutes * 60.00;
      int totalGoals = teamGoals_1 + teamGoals_2;
      System.out.println("\n" + "The match lasted " +  matchSeconds + " seconds");
      System.out.println("\n" + "[" + teamName_1 + "]" + " scored " + teamGoals_1 + " goals");
      System.out.println("[" + teamName_2 + "]" + " scored " + teamGoals_2 + " goals");
      System.out.println("Total goals in the match: " + totalGoals);
      
   }

}