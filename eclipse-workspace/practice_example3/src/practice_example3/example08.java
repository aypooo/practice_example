package practice_example3;

import java.util.Scanner;

public class example08 {

   public static void main(String[] args) {
      System.out.println("정수 몇개?");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int array[] = new int[n];
      
      for(int i=0;i<n;i++){
         array[i] = (int)(Math.random()*100 +1);
         for(int j=0; j<i; j++) {
            if(array[j] == array[i]) {
               i--;
               break;
            }
         }
      }
      for(int i=0;i<n;i++){
         if(i%10==9) {
            System.out.println(array[i]+" ");
            System.out.println();
         
         }
         else {
            System.out.print(array[i]+" ");
      }
   sc.close();
   }   
 }
}