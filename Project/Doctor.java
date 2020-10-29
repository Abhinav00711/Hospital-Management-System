package DataModel;

public class Doctor{
	private String id;
	private String name;
	private int phone;
	private String address;
	private String speciality;
	private String status;
	
	Doctor(String id, String name, int phone, String address, String speciality){
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.speciality = speciality;
		this.status = "FREE";
	}
	
	Doctor(String id, String name, int phone, String address, String speciality, String status){
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.speciality = speciality;
		this.status = status;
	}
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getPhone(){
		return phone;
	}
	public String getAddress(){
		return address;
	}
	public String getSpeciality(){
		return speciality;
	}
	public String getStatus(){
		return status;
	}
}