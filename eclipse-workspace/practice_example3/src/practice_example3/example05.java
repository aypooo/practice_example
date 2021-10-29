package practice_example3;

import java.util.Scanner;

public class example05 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int Array[] = new int[10];
      
      System.out.println("양의 정수를 10개 입력하시오>>");
      
      for(int i=0; i<10;i++) {
         Array[i] = sc.nextInt();
      
      }
      
      System.out.print("3의 배수는>>");
      for(int j=0; j<10;j++) {
         if(Array[j] % 3 == 0)
            System.out.print(Array[j]+" ");
         
         }
      
      
      sc.close();
   }

}