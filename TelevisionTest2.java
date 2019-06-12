class Television2{
	int channel;
	int volume;
	boolean onOff;
	
	void print() {
		System.out.println("텔레비전 채널은 " + channel + "이고 볼륨은 " + volume + "입니다." );
	}
	int getChannel(){
		return channel;
	}
	void setChannel(int x) {
		channel = x;
	}
}

public class TelevisionTest2 {
	public static void main(String[] args) {
		Television2 myTv = new Television2();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.print();
		Television2 yourTv = new Television2();
		yourTv.channel = 11;
		yourTv.volume = 23;
		yourTv.print();
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다.");
		
		myTv.setChannel(200);
		int ch1 = myTv.getChannel();
		System.out.println("현재 채널은 " + ch1 + "입니다.");
	}
}


