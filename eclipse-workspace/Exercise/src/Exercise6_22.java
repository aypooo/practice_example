
public class Exercise6_22 {
	
	public static boolean isNumber(String str){
		if (str == null || str.equals(""))
			return false;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			
			if(c < '0' || c >'9') return false;
			}
			return true;
		}
//		boolean ret = true;		
//
//		for(int i =0;i < str.length(); i++){
//
//			if(str.charAt(i)>='0' && str.charAt(i)<='9') continue;
//
//			else {
//
//				ret = false;
//
//				break;
//
//			}
//
//		}
//
//		
//
//		return ret;

	
	public static void main(String[] args) {
		String str = "123";		
		System.out.println(str+"�� �����Դϱ�?"+isNumber(str));
		str = "1234o";
		System.out.println(str+"�� �����Դϱ�?"+isNumber(str));

	}

}
