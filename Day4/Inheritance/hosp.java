package oop;
class hospital{
	void hospital_name(String name) {
		System.out.println("Name of Hospital is "+name);
	}
	
}
class doctor extends hospital{
	void doctor_name(String name) {
		System.out.println("Name of Doctor is "+name);
	}
}
class gynac extends doctor{
	void gynac_name() {
		System.out.println("Gynac Department");
	}
	
}
class endo extends doctor{
	void endo_name() {
		System.out.println("Endo Department");
	}
}
class cardaic extends doctor{
	void cardaic_name() {
		System.out.println("cardaic Department");
	}
}
class operation extends cardaic{
	void op_name() {
		System.out.println("Operation theatre");
	}
}
class opd extends cardaic{
	void opd_name() {
		System.out.println("OPD Department");
	}
}

class nurse extends hospital{
	void nusre_name(String name) {
		System.out.println("Name of nurse is "+name);
	}
	
}
class accountant extends hospital{
	void account_name(String name) {
		System.out.println("Accountant name is"+name);
	}
}
class payment extends accountant{
	void paid(int rupee) {
		System.out.println("Amount to paid is "+rupee+"$");
	}
}
class document extends accountant{
	void Document_name(int no ) {
		System.out.println("Case papaer no : "+no);
	}
	
}

public class hosp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***gynac***");
		gynac gn = new gynac();
		gn.hospital_name("bharti hospiital");
		gn.doctor_name("vishal");
		gn.gynac_name();
		System.out.println("***endo***");
		endo en = new endo();
		en.hospital_name("Sevasadan");
		en.doctor_name("djj");
		en.endo_name();
		System.out.println("***cardaic***");
		operation op = new operation();
		op.hospital_name("cardaic hopital");
		op.doctor_name("vinod");
		op.cardaic_name();
		op.op_name();
		opd opd1 = new opd();
		opd1.hospital_name("opd hopital");
		opd1.doctor_name("vinod");
		opd1.cardaic_name();
		opd1.opd_name();
		System.out.println("***Nurse***");
		nurse np = new nurse();
		np.hospital_name("nusing home");
		np.nusre_name("xyz");
		System.out.println("***Naccutant***");
		payment pd = new payment();
		pd.paid(1500);
		document d = new document();
		pd.account_name("abd");
		d.Document_name(25);
		
		

	}

}
