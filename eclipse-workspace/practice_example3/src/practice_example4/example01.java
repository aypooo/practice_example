package practice_example4;

public class example01 {
	class TV{
		String name;
		int year;
		int inch;
		
		TV(){}
		TV(String name,int year, int inch){
			this.name = name;
			this.year = year;
			this.inch = inch;
			
		}
		
	String show(){
		return name+"에서 만든"+year+"년형"+inch+"인치 TV";
		}
	}

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

	}

}
