package DataModel;

public class Patient{
	private String id;
	private String name;
	private int phone;
	private String gender;
	private String address;
	private String state;
	private String status;
	
	public Patient(String id, String name, int phone, String gender,String address, String state){
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.state = state;
		this.status = "FREE";
	}
	
	public Patient(String id, String name, int phone, String gender,String address, String state, String status){
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.state = state;
		this.status = status;
	}
	
	public Patient(Patient p){
		this.id = p.getId();
		this.name = p.getName();
		this.phone = p.getPhone();
		this.gender = p.getGender();
		this.address = p.getAddress();
		this.state = p.getState();
		this.status = p.getStatus();
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
	public String getGender(){
		return gender;
	}
	public String getAddress(){
		return address;
	}
	public String getState(){
		return state;
	}
	public String getStatus(){
		return status;
	}
}