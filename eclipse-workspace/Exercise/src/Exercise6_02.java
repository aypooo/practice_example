
public class Exercise6_02 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());

	}

}
class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		num = 1;
		isKwang = true; //this(1,true);
	}
		
	public SutdaCard(int num,boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	

	String info() {
		if(isKwang) {//isKwang == true
			return num +"k";
		}	
		return num + " ";
		//return num+(isKwang ? "K" : "");
	}
}