package practice_example5;

import java.util.Scanner;
interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack{
	private int num;
	private String[] stack;
	

	StringStack(){
	}
	@Override
	public int length() {		
		return num;	
	}
	@Override
	public int capacity() {
		int a = 0;
		for(int i=0; i<length(); i++ ) 
			if (stack[i] == null) {
					a++;
				
			}
		return length()-a;		
	}
	
	@Override
	public String pop() {
		String s= "";
		 for(int i=0; i<length(); i++)
			 s+=stack[i]+" ";
		 
		return s;
	}
		
	
	@Override
	public boolean push(String val) {
		if (stack[capacity()] == null) {
			stack[capacity()] = val;
			return true;
		}
		else
			return false;
		
	
	}
	public void run() {	
		System.out.println("총 스택 저장 공간의 크기 입력>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		this.num = num;
		stack = new String[num];
		while (true) {
		System.out.println("문자열 입력>>");
		String val = sc.next();
		
		if(val.equals("그만")) {
			System.out.println("스택에 저장된 모든 문자열 팝 :"+pop());
			break;
		}
		else if (capacity() == length())
			System.out.println("스택이 꽉 차서 푸시 불가");
		else {
			push(val);
			System.out.println(pop());
		}
		}	
		sc.close();
		}
}
public class example09 {

	public static void main(String[] args) {
		StringStack ss = new StringStack();
		ss.run();

	}

}
