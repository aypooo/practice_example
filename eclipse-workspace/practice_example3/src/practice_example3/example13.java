package practice_example3;

public class example13 {

	public static void main(String[] args) {

		
		for(int i=0;i<100;i++) {
			int a = i/10;
			int b = i-10*a;
			if ((i % 10 == 3 || i % 10 == 6 || i % 10 == 9) || (a == 3 || a == 6 || a == 9)) {
				System.out.print(i+"¹Ú¼öÂ¦");
				
			
				if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9))
					System.out.print("Â¦");
					System.out.println();
				
			}
			
		}
	}
}