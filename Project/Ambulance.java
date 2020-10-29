package DataModel;

public class Ambulance{
	enum Astatus{
		FREE,
		BUSY
	}
	
	String id;
	String number;
	String driverName;
	Astatus status;
	
	Ambulance(String id, String number, String driverName){
		this.id = id;
		this.number = number;
		this.driverName = driverName;
		this.status = Astatus.FREE;
	}
}