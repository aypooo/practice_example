package practice_example3;

import java.util.Scanner;
public class example16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"����","����","��"};
			
		while(true) {
			System.out.println("����,����,��!:");
			String s = sc.next();
			int n = (int)(Math.random()*3);
			
			System.out.println("��ǻ�ʹ�"+str[n]);
		if 	(s.equals("����") || s.equals("����") || s.equals("��")) {
					
			
			if(n-1<0) {
				n=2;
				if(s.equals(str[n])){
					System.out.println("�����ϴ�!");
				}
			}
			else if (s.equals(str[n]))
					System.out.println("�����ϴ�!");
			else
				System.out.println("�̰���ϴ�!");
				
			}
		else
			System.out.println("�߸��Է��߾��.�ٽ��Է��ϼ���.");
			continue;
			
		}
	}

}