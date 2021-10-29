package practice_example3;

public class example02 {

	public static void main(String[] args) {
	
		
		int intArray[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		

		for(int i = 0; i<intArray.length; i++) {
			for(int j = 0; j<intArray[i].length; j++) 
				System.out.print(intArray[i][j]+" ");
			
			System.out.println();
		}		

	}

}
