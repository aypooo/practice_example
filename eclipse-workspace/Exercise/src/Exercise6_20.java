
public class Exercise6_20 {
	
	public static int[] shuffle(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int a  = (int)(Math.random()*arr.length);
			int b  = (int)(Math.random()*arr.length);
			
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		//배열을 출력할때 Arrays.toString를 써야 주소값이 아닌 값이 출력됨
	}

}
