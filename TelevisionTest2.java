class Television2{
	int channel;
	int volume;
	boolean onOff;
	
	void print() {
		System.out.println("�ڷ����� ä���� " + channel + "�̰� ������ " + volume + "�Դϴ�." );
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
		System.out.println("���� ä���� " + ch + "�Դϴ�.");
		
		myTv.setChannel(200);
		int ch1 = myTv.getChannel();
		System.out.println("���� ä���� " + ch1 + "�Դϴ�.");
	}
}


