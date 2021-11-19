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
		System.out.println("�� ���� ���� ������ ũ�� �Է�>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		this.num = num;
		stack = new String[num];
		while (true) {
		System.out.println("���ڿ� �Է�>>");
		String val = sc.next();
		
		if(val.equals("�׸�")) {
			System.out.println("���ÿ� ����� ��� ���ڿ� �� :"+pop());
			break;
		}
		else if (capacity() == length())
			System.out.println("������ �� ���� Ǫ�� �Ұ�");
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
