class Math{
	int add(int x, int y) {
		return x + y;
	}
}
public class MathTest {

	public static void main(String[] args) {
		int sum;
		Math obj = new Math();
		sum = obj.add(2, 3);
		System.out.println("2�� 3�� ���� " + sum + "�Դϴ�.");
	}
	
}
