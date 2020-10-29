package DataModel;

public class Patient{
	enum Pstatus{
		FREE,
		PENDING
	}
	
	String id;
	String name;
	int phone;
	String address;
	String[] symptoms;
	Pstatus status;
	
	Patient(String id, String name, int phone, String address, String[] symptoms){
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.symptoms = symptoms;
		this.status = Pstatus.FREE;
	}
}