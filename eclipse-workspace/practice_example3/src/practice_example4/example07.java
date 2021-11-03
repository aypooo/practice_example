package practice_example4;

import java.util.Scanner;

class Day{
	String work;
	void st(String work) {this.work = work; }
	String get() {return work;}
	void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
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
		System.out.println("이번달 스케쥴 관리 프로그램.");
		
		MonthSchedule april = new MonthSchedule(30);
	while (true){
		System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>"); 
		int h = sc.nextInt()	//일단 while문으로 메뉴를 돌린다.
		
		if 	(a<0 || a>3) //1~3까지 입력하면 판별한다.
			System.out.println("다시입력해주세요.");	
			if ( h == 1 )
				System.out.println("날짜(1~30)?");
				int	a = sc.nextInt();
				System.out.println("할일(빈칸없이입력)?");
				String	b = sc.next(); 
				Schedule.put("a","b");//날짜랑 할일 받으면 딕셔너리로 배열에 집어 넣는다. 
			else if (h == 2)
				System.out.println("날짜(1~30)?");
				int	() = sc.nextInt() // 날짜 받으면 입력 돼 있던 날짜의 딕셔너리로 할일 받아온다. Day 클래스 받아오면 될듯?
				april.show()
			else if (h == 3 ) 	//이거 걍 break 해서 탈출 하면 될듯?
				System.out.println("프로그램을 종료합니다.");
					
		
		}

	}

}
