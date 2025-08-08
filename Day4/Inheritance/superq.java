package oop;
class school{
	school(){
		System.out.print("Admission open for ");
	}
}
class podar extends school{
	podar(){
		super();
		System.out.println("podar School");

	}
}

public class superq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		podar pd = new podar();

	}

}
