package practice_example3;
import java.util.Scanner;
public class example06 {

   public static void main(String[] args) {
      System.out.println("금액을 입력하시오>>");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
      
      for(int i=0; i<unit.length;i++){
            int result = a/unit[i];
            if (result !=0) 
               System.out.println(unit[i]+"원 짜리: "+result+"개");
            a = a-unit[i]*result;
         
         
      }
      sc.close();
   }

}