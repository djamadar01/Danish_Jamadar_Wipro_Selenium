package oop;
class vehicle{
	void name(String name) {
		System.out.println("Car name : "+name);	}
}

class four_wheeler extends vehicle{
	void types(String type) {
		System.out.println("Car Type : "+type);
	}
	
}
class petrol_four_wheeler extends four_wheeler{
	void modes(String mode) {
		System.out.println("Car Runtype : "+mode);
	}
	
}
class fiveseater_petrol_four_wheeler extends petrol_four_wheeler {
	void seater(String st) {
		System.out.println("Car Seat type : "+st);
	}
	
}
class baleno_petrol_four_wheeler extends fiveseater_petrol_four_wheeler{
	void model(int model) {
		System.out.println("cl of Car"+model);
	}
}
public class vehic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baleno_petrol_four_wheeler car1 = new baleno_petrol_four_wheeler();
		car1.name("Baleno");
		car1.types("Four Wheeler");
		car1.modes("Petrol");
		car1.seater("5 Seater");
		car1.model(2025);
		System.out.println("*******");
		baleno_petrol_four_wheeler car2 = new baleno_petrol_four_wheeler();
		car1.name("KIA");
		car1.types("Four Wheeler");
		car1.modes("Diesel");
		car1.seater("4 Seater");
		car1.model(2021);

	}

}
