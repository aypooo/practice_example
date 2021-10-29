package practice_example3;

import java.util.Random;
import java.util.Scanner;

public class openchallenge {

	public static void main(String[] args) {
		Random r = new Random();
		int k = r.nextInt(100);
		int count = 0;
		System.out.println("수를 결정하였습니다. 맞추어보세요:");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			count++;	
			if (n > k) {
				System.out.println(count+">>"+n);
				System.out.println("더 낮게");
				System.out.println("맞추어보세요:");
				continue;
			}
			else if (n < k) {
				System.out.println(count+">>"+n);
				System.out.println("더 높게");
				System.out.println("맞추어보세요:");
				continue;
			}
			
			else
				
				System.out.println("맞았습니다.");
				System.out.println("다시하겠습니까(y/n)");
				String text = sc.next();
				if(text.equals("y")) {
					System.out.println("맞추어보세요:");					
					continue;
				}
				else if (text.equals("n")) {
					System.out.println("종료합니다.");
					
					break;
				}
				sc.close();	
			}
		
	}
	
}
