package practice_example3;
import java.util.Scanner;
public class example14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		String course[] = {"Java", "C++","HTML5","��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		
		
		for(int i=0;i<course.length;i++) {
			if(course[i].equals(name)) {
				System.out.println("�����̸�>>"+course[i]);
				System.out.println(course[i]+"�� ������"+score[i]);
			}
			else
				System.out.println("���� �����Դϴ�.");
		}

	}

}
