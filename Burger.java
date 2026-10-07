public class Burger {
   // instance variables
   private int numPatties;
   private boolean isTasty;
   private double gramsOfSauce;
   private String burgerName;
   private int numberOfBites;
   
   // constructors
   // first let's do the no-argument constructor
   public Burger() {
      numberOfBites = 0;
      numPatties = 2;
      isTasty = true;
      gramsOfSauce = 30;
      burgerName = "Craig the Burger";
   }
   
   public Burger(int numPatties, boolean isTasy, double gramsOfSauce, String burgerName) {
      this.numberOfBites = numberOfBites;
      this.numPatties = numPatties;
      this.isTasty = isTasty;
      this.gramsOfSauce = gramsOfSauce;
      this.burgerName = burgerName;
   }
   
   // Methods go here
   public void bite() {
      System.out.println("Chomp...");
      numberOfBites++;
   }
   
   public int getNumberOfBites() {
      return numberOfBites++;
   }
   
   public String getBurgerREcipe() {
      return "Cook burger, put on bun, add condiments";
   }
   
   public static void main(String[] args) {
      // create a Burger object using the no-argument constructor
      Burger basicBurger = new Burger();
      
      // create a Burger object using the constructor with arguments
      Burger benBurger = new Burger(3, true, 45, "Awesome Burger");
      
      // Take a bit ou of either Burger
      benBurger.bite();
      benBurger.bite();
      benBurger.bite();
      benBurger.bite();
      
      // get the number of bites taken out of the burger
      System.out.println(benBurger.getNumberOfBites());
      
      // call the class method getBurgerRecipe()
      System.out.println(benBurger.getBurgerREcipe());
   }
}





