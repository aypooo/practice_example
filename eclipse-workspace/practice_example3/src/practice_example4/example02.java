package practice_example4;

import java.util.Scanner;

public class example02 {
	class Grade{
		int math;
		int science;
		int english;
		
		
		Grade(){}
		Grade(int math, int science, int english){
			this.math = math;
			
			
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은"+ me.average());
		
		scanner.close();

	}

}
