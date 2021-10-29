package practice_example3;

public class example07 {

   public static void main(String[] args) {
      int array[];
      array = new int[10];
      double sum = 0;
      for(int j=0; j<10;j++) {
         int i = (int)(Math.random()*10 +1);
         System.out.print(i + " ");
         array[j] = i;
         sum = sum + array[j];
      }
      System.out.println();
      System.out.println(String.format("Æò±ÕÀº: %.1f",sum/10));
   }

}