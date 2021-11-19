package practice_example5;

class Km2Mile extends Converter{
	
	Km2Mile(double ratio){
	this.ratio = ratio;	
	}
	protected double convert(double val) {
		return val/ratio;
	}
	
	protected String getSrcString() {
		return "km";
	
	}
	protected String getDestString() {
		return "mile";
	}
}

public class example04 {

	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();

	}

}
