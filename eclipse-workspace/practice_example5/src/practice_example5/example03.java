package practice_example5;
import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "��" + getDestString() + "�� �ٲߴϴ�.");
		System.out.println(getSrcString() + "�� �Է��ϼ���?>>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���:" + res + getDestString() + "�Դϴ�");
		scanner.close();
	}
}

class Won2Dollar extends Converter{
	
	Won2Dollar(double ratio){
	this.ratio = ratio;	
	}
	protected double convert(double val) {
		return val/ratio;
	}
	
	protected String getSrcString() {
		return "��";
	
	}
	protected String getDestString() {
		return "�޷�";
	}
}

public class example03 {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

}
