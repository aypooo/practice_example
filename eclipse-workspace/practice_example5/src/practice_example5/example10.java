package practice_example5;

abstract class PairMap{
	protected String keyArray [];
	protected String valueArray [];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int lenght();
}

class Dictionary extends PairMap{
	int length;
	Dictionary(int length){
		this.length = length;
		
	}
	@Override
	String get(String key) {
		for(int i=0;i<length;i++) {
			if (keyArray[i] == key) {
				return valueArray[i];
			}
			else 
				return null;
			
			
	}



	@Override
	void put(String key, String value) {
		
		for(int i=0;i<length;i++) {
			if (keyArray[i] == null){
				keyArray[i] = key;
				valueArray[i] = value;
			}
		}		
	}



	@Override
	String delete(String key) {
		
		return null;
	}



	@Override
	int lenght() {
		
		return 0;
	}
	
}

public class example10 {
	

	public static void main(String[] args) {
	Dictionary dic = new Dictionary(10);
	dic.put("황기태", "자바");
	dic.put("이재문", "파이썬");
	dic.put("이재문", "C++");
	System.out.println("이재문의 값은" + dic.get("이재문"));
	System.out.println("황기태의 값은" + dic.get("황기태"));
	dic.delete("황기태");
	System.out.println("황기대의 값은"+ dic.get("황기태"));
	

	}

}




