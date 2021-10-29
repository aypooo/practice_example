package practice_example3;
import java.util.Scanner;
public class example14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		String course[] = {"Java", "C++","HTML5","컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		
		
		for(int i=0;i<course.length;i++) {
			if(course[i].equals(name)) {
				System.out.println("과목이름>>"+course[i]);
				System.out.println(course[i]+"의 점수는"+score[i]);
			}
			else
				System.out.println("없는 과목입니다.");
		}

	}

}
