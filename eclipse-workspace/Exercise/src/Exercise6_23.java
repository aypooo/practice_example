
public class Exercise6_23 {
	
	static int max(int arr[]) {
		if (arr == null || arr.length == 0) 
			return -999999;
		int max = arr[0];
		
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i+1]> max)
			max = arr[i+1];		
	}
		
		
	return max;
	}
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪:"+max(data));
		System.out.println("�ִ밪:"+max(null));
		System.out.println("�ִ밪:"+max(new int[] {}));
	}

}
