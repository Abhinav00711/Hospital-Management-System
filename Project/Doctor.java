package DataModel;

public class Doctor{
	private String id;
	private String name;
	private String phone;
	private String address;
	private String speciality;
	private String status;
	
	public Doctor(String id, String name, String phone, String address, String speciality){
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.speciality = speciality;
		this.status = "FREE";
	}
	
	public Doctor(String id, String name, String phone, String address, String speciality, String status){
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
	public String getPhone(){
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