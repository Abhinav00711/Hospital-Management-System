package DataModel;

public class Patient{
	enum Pstatus{
		FREE,
		PENDING
	}
	
	private String id;
	private String name;
	private int phone;
	private String address;
	private String[] symptoms;
	private Pstatus status;
	
	Patient(String id, String name, int phone, String address, String[] symptoms){
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.symptoms = symptoms;
		this.status = Pstatus.FREE;
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
	String[] getSymptoms(){
		return symptoms;
	}
	Pstatus getStatus(){
		return status;
	}
}