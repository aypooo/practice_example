package practice_example3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class example15 {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("���ϰ��� �ϴ� �� �� �Է�>>");
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.println(n + "x" + m + "=" + n*m);
				break;
			}
			catch(InputMismatchException e){
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine();
			
				
		}
		}
		scanner.close();
	}

}
