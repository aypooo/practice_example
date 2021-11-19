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
	dic.put("Ȳ����", "�ڹ�");
	dic.put("���繮", "���̽�");
	dic.put("���繮", "C++");
	System.out.println("���繮�� ����" + dic.get("���繮"));
	System.out.println("Ȳ������ ����" + dic.get("Ȳ����"));
	dic.delete("Ȳ����");
	System.out.println("Ȳ����� ����"+ dic.get("Ȳ����"));
	

	}

}




