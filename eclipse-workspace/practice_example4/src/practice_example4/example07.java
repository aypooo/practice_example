package practice_example4;

import java.util.Scanner;



static class MonthSchedule{
	static int month;
	static int date;
	static String work;
	MonthSchedule(int month){
		this.month = month;
	}
	
	void input(int date, String work){
		this.date = date;
		this.work = work;
		��ųʸ� .map(date, work);
	}
	view(){
	}
	finish(){
		
	}
static void run(){
	while(true) {
		System.out.println("����(�Է�:1, ����:2, ������:3) >>"); 
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
			if 	(h<0 || h>3) //1~3���� �Է��ϸ� �Ǻ��Ѵ�.
				System.out.println("�ٽ��Է����ּ���.");
			else {	
				if ( h == 1 )
					System.out.println("��¥(1~30)?");
					int	date = sc.nextInt();
					System.out.println("����(��ĭ�����Է�)?");
					String	work = sc.next(); 
					input("date","work");//��¥�� ���� ������ ��ųʸ��� �迭�� ���� �ִ´�. 
				else if (h == 2)
					System.out.println("��¥(1~30)?");
					int	() = sc.nextInt() // ��¥ ������ �Է� �� �ִ� ��¥�� ��ųʸ��� ���� �޾ƿ´�. Day Ŭ���� �޾ƿ��� �ɵ�?
					april.show()
				else if (h == 3 ) 	//�̰� �� break �ؼ� Ż�� �ϸ� �ɵ�?
					System.out.println("���α׷��� �����մϴ�.");
			}				
					
		}	
		
	}
}


class Day{
	String work;
	void set(String work) {this.work = work; }
	String get() {return work;}
	void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
	
}

public class example07 {
	
	public static void main(String[] args) {
		
		System.out.println("�̹��� ������ ���� ���α׷�.");
		
		MonthSchedule april = new MonthSchedule(30);
		april.run();
		}

	}

}
