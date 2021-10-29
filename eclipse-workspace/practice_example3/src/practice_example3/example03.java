package practice_example3;

import java.util.Scanner;

public class example03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별 개수를 입력해주세요:");
		int s = sc.nextInt();
		for(int i=s; i>0; i--) {
			for(int j=0; j<i; j++)
				System.out.print("*");	
		System.out.println();
		
		}
		sc.close();
		
	}
	
}
