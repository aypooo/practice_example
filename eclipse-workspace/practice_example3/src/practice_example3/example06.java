package practice_example3;
import java.util.Scanner;
public class example06 {

   public static void main(String[] args) {
      System.out.println("�ݾ��� �Է��Ͻÿ�>>");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
      
      for(int i=0; i<unit.length;i++){
            int result = a/unit[i];
            if (result !=0) 
               System.out.println(unit[i]+"�� ¥��: "+result+"��");
            a = a-unit[i]*result;
         
         
      }
      sc.close();
   }

}