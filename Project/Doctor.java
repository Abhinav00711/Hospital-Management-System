package DataModel;

public class Doctor{
	enum Dstatus{
		FREE,
		BUSY
	}
	
	private String id;
	private String name;
	private int phone;
	private String address;
	private String speciality;
	private Dstatus status;
	
	Doctor(String id, String name, int phone, String address, String speciality){
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.speciality = speciality;
		this.status = Dstatus.FREE;
	}
	
	String getId(){
		return id;
	}
	String getName(){
		return name;
	}
	int getPhone(){
		return phone;
	}
	String getAddress(){
		return address;
	}
	String getSpeciality(){
		return speciality;
	}
	Dstatus getStatus(){
		return status;
	}
}