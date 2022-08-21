package Harshita;

import java.util.Scanner;

public class DiceProblem {
   public static void main(String[] args) {
      System.out.print("Please enter the number to find opposite face of the cube:");
      Scanner scan = new Scanner(System.in);

      int N = scan.nextInt();
      if (1<=N & N<=6) {
         Solution obj = new Solution();
         int ans = obj.oppositeFaceOfDice(N);
         System.out.print("\nOpposite side of "+N+" in a cube is: ");
         System.out.println(ans);
      }else {
         System.out.println("\nInvalid input! Please enter value in between 1 and 6.");
      }
   }
}
class Solution{

   static int oppositeFaceOfDice(int N) {

      return 7-N;

   }

}


