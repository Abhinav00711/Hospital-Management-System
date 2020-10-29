package DataModel;

public class Ambulance{
	private String id;
	private String number;
	private String driverName;
	private String status;
	
	public Ambulance(String id, String number, String driverName){
		this.id = id;
		this.number = number;
		this.driverName = driverName;
		this.status = "FREE";
	}
	
	public Ambulance(String id, String number, String driverName, String status){
		this.id = id;
		this.number = number;
		this.driverName = driverName;
		this.status = status;
	}
	
	public void setStatus(String status){
		this.status = status;
	}

	public String getId(){
		return id;
	}
	public String getNumber(){
		return number;
	}
	public String getDriverName(){
		return driverName;
	}
	public String getStatus(){
		return status;
	}
}