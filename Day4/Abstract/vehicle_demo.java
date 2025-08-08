package abstractt;
abstract class vehicle{
	abstract void no_tyre();
	abstract void no_seats();
	abstract void run_on();
	void start_stop() {
		System.out.println("start stop");
	}
}
class car extends vehicle{
	void no_tyre() {
		System.out.println("4 wheels");

	}
	void no_seats() {
		System.out.println("7 seats");
	}
	void run_on() {
		System.out.println("petrol");

	}
}

class scooter extends vehicle{
	void no_tyre() {
		System.out.println("2 wheels");

	}
	void no_seats() {
		System.out.println("3 seats");
	}
	void run_on() {
		System.out.println("electric");

	}
}

public class vehicle_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = new car();
		c.no_tyre();
		c.no_seats();
		c.run_on();
		c.start_stop();
		System.out.println("*************");
		scooter s = new scooter();
		s.no_tyre();
		s.no_seats();
		s.run_on();
		s.start_stop();

	}

}
