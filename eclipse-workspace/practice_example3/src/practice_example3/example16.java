package practice_example3;

import java.util.Scanner;
public class example16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위","바위","보"};
			
		while(true) {
			System.out.println("가위,바위,보!:");
			String s = sc.next();
			int n = (int)(Math.random()*3);
			
			System.out.println("컴퓨터는"+str[n]);
		if 	(s.equals("가위") || s.equals("바위") || s.equals("보")) {
					
			
			if(n-1<0) {
				n=2;
				if(s.equals(str[n])){
					System.out.println("졌습니다!");
				}
			}
			else if (s.equals(str[n]))
					System.out.println("비겼습니다!");
			else
				System.out.println("이겼습니다!");
				
			}
		else
			System.out.println("잘못입력했어요.다시입력하세요.");
			continue;
			
		}
	}

}