package practice_example3;

import java.util.Scanner;

public class example04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력해주세요:");
		char s = sc.nextLine().charAt(0);
		char num = s;
		int n = (int)num-96;
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				char ch = (char)(j+97);
				System.out.print(ch+" ");
			}
		System.out.println();
		
		}
		sc.close();

	}

}
