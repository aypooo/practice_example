package practice_example5;


class IPTV extends ColorTV{
	private String ip;
	
	public IPTV(String ip, int size, int color){
		super(size, color);
		this.ip = ip;
	}
	protected String getip() {return ip;}
	
	public void printProperty() {
	System.out.print("���� IPTV��"+getip()+"�ּ��� ");
	super.printProperty();
}
}
public class example02 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
