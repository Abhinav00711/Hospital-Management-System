package DataModel;

public class Doctor{
	enum Dstatus{
		FREE,
		BUSY
	}
	
	String id;
	String name;
	int phone;
	String address;
	String speciality;
	Dstatus status;
	
	Doctor(String id, String name, int phone, String address, String speciality){
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.speciality = speciality;
		this.status = Dstatus.FREE;
	}
}