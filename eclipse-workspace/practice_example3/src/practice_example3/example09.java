package practice_example3;

public class example09 {

	public static void main(String[] args) {
		int array[][];
		array = new int[4][4];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j] = (int)(Math.random()*10 +1);
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		
		}
		
	}

}
