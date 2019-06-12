class Car{
	String color;
	int speed;
	int gear;
	@Override
	public String toString() {
		return "Car [color = " + color + ", speed = " + speed + ", gear = " + gear + "]";
	}
	void changeGear(int x) {
		gear = x;
	}
	void speedup(){
		speed += 10;
	}
	void speeddown(){
		speed += 10;
	}
}
public class CarTest {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.changeGear(2);
		mycar.speedup();
		System.out.println(mycar);
	}

}
