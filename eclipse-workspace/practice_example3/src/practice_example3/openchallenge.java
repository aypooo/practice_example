package practice_example3;

import java.util.Random;
import java.util.Scanner;

public class openchallenge {

	public static void main(String[] args) {
		Random r = new Random();
		int k = r.nextInt(100);
		int count = 0;
		System.out.println("���� �����Ͽ����ϴ�. ���߾����:");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			count++;	
			if (n > k) {
				System.out.println(count+">>"+n);
				System.out.println("�� ����");
				System.out.println("���߾����:");
				continue;
			}
			else if (n < k) {
				System.out.println(count+">>"+n);
				System.out.println("�� ����");
				System.out.println("���߾����:");
				continue;
			}
			
			else
				
				System.out.println("�¾ҽ��ϴ�.");
				System.out.println("�ٽ��ϰڽ��ϱ�(y/n)");
				String text = sc.next();
				if(text.equals("y")) {
					System.out.println("���߾����:");					
					continue;
				}
				else if (text.equals("n")) {
					System.out.println("�����մϴ�.");
					
					break;
				}
				sc.close();	
			}
		
	}
	
}
