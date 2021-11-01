class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNER = 100;
	final int MIN_CHANNER = 1;
	
	void turnOnOff() {
		isPowerOn = true;
		isPowerOn =! isPowerOn;
	}
	
	void volumUp() {
		if (volume<MAX_VOLUME) 
			volume++;
	}
	void volumDown() {
		if (volume>MIN_VOLUME) 
			volume--;
		}
	void channelUp() {
		channel++;
		if (channel == MAX_CHANNER)
			channel = MIN_CHANNER;
	}
	void channelDown() {
		channel--;
		if (channel == MIN_CHANNER)
			channel = MAX_CHANNER;
	}
}


public class Exercise6_21 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL"+ t.volume);
		
		t.channelDown();
		t.volumDown();
		System.out.println("CH:"+t.channel+", VOL"+ t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumUp();
		System.out.println("CH:"+t.channel+", VOL"+ t.volume);
	}

}
