class Television{
	int channel;
	int volume;
	boolean onOff;
}
public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
	System.out.println("�ڷ����� ä���� " + tv.channel + "�̰� ������ " + tv.volume + "�Դϴ�." );
	}

}
