public class ProjectEuler {
   
   public static int problem1() {
      int number1 = 1;
      int sum1 = 0;
      while (number1 < 1000) {
         if (number1 % 3 == 0 || number1 % 5 == 0) {
            sum1 += number1;
         }
         number1++;
      }
      return sum1;
   }
   public static int problem2() {
      
      return 0;
   }
   public static int problem7() {
      // 10,001 posicao dos numeros primos
      // Se um numero for primo o contador sobe 1 (esta e a primeira posicao)
      // para ver se um numero e primo eu preciso fazer um dois loops
      // o primeiro loop vai ser o numerador
      // o segundo loop vai ser o denominador
      // eu preciso fazer o numero primo se dividir apenas pelo numeros antes dele
      // se o resultado do resto da divisao for mais que zero vezes ele NAO e um numero primo
      int numerator = 2; 
      int denominator = 2;
      boolean prime = false;
      return 0;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1()); 
   }  
}