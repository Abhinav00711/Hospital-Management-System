package DataModel;

public class Ambulance{
	enum Astatus{
		FREE,
		BUSY
	}
	
	private String id;
	private String number;
	private String driverName;
	private Astatus status;
	
	Ambulance(String id, String number, String driverName){
		this.id = id;
		this.number = number;
		this.driverName = driverName;
		this.status = Astatus.FREE;
	}
	
	String getId(){
		return id;
	}
	String getNumber(){
		return number;
	}
	String getDriverName(){
		return driverName;
	}
	Astatus getStatus(){
		return status;
	}
}