package practice_example3;

import java.util.Scanner;

public class example05 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int Array[] = new int[10];
      
      System.out.println("���� ������ 10�� �Է��Ͻÿ�>>");
      
      for(int i=0; i<10;i++) {
         Array[i] = sc.nextInt();
      
      }
      
      System.out.print("3�� �����>>");
      for(int j=0; j<10;j++) {
         if(Array[j] % 3 == 0)
            System.out.print(Array[j]+" ");
         
         }
      
      
      sc.close();
   }

}