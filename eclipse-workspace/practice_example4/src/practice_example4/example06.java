package practice_example4;

import java.util.Scanner;

class Circle1{
	double x;
	double y;
	int radius;

	Circle1(double x,double y,int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}
	void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	int getradius(){
		return radius;
	}
}



public class example06 {
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle1 c[] = new Circle1[3];
		int max = 0;
		for(int i=0;i<c.length;i++) {
			System.out.println("x,y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle1(x,y,radius);
		}
		
		for(int i=0;i<c.length;i++) {
			if (c[i].getradius()>c[max].getradius())
				max = i;
		}
		System.out.println("가장 면적이 큰 원은"+ c[max].getradius());
		
				
	}

	

}
