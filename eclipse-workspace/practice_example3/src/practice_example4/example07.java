package practice_example4;

import java.util.Scanner;

class Day{
	String work;
	void st(String work) {this.work = work; }
	String get() {return work;}
	void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
	
}

class MonthSchedule{
	
	int input(){
		
		
	}
	view(){
	}
	finish(){
		
	}
	run(){
	
		
		
	}
}
public class example07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̹��� ������ ���� ���α׷�.");
		
		MonthSchedule april = new MonthSchedule(30);
	while (true){
		System.out.println("����(�Է�:1, ����:2, ������:3) >>"); 
		int h = sc.nextInt()	//�ϴ� while������ �޴��� ������.
		
		if 	(a<0 || a>3) //1~3���� �Է��ϸ� �Ǻ��Ѵ�.
			System.out.println("�ٽ��Է����ּ���.");	
			if ( h == 1 )
				System.out.println("��¥(1~30)?");
				int	a = sc.nextInt();
				System.out.println("����(��ĭ�����Է�)?");
				String	b = sc.next(); 
				Schedule.put("a","b");//��¥�� ���� ������ ��ųʸ��� �迭�� ���� �ִ´�. 
			else if (h == 2)
				System.out.println("��¥(1~30)?");
				int	() = sc.nextInt() // ��¥ ������ �Է� �� �ִ� ��¥�� ��ųʸ��� ���� �޾ƿ´�. Day Ŭ���� �޾ƿ��� �ɵ�?
				april.show()
			else if (h == 3 ) 	//�̰� �� break �ؼ� Ż�� �ϸ� �ɵ�?
				System.out.println("���α׷��� �����մϴ�.");
					
		
		}

	}

}
