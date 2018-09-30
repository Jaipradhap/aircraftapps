package aircraftapps.aircraftmodel;

public class Aircraft {

	private String code;
	private String airportName;
	
	public Aircraft() {
		
	}
	
	public Aircraft(String code,String airportName) {
		super();
		this.code = code;
		this.airportName = airportName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	
}
