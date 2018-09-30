package aircraftapps.aircraftappscontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aircraftapps.aircraftmodel.Aircraft;

@RestController
public class AircraftControllers {

	
	@RequestMapping("/")
	public String sayWelcome()
	{
		return "Welcome to Emirates Aircraft";
	}
	
	
	@RequestMapping("/top10airport")
	public List<Aircraft> sayAirport()
	{
		return Arrays.asList(
				new Aircraft("ATL","Atlanta, Georgia USA"),
				new Aircraft("PEK","Beijing,China"),
				new Aircraft("DXB","Garhoud, Dubai	United Arab Emirates"),
				new Aircraft("HND","Ota, Tokyo	Japan"),
				new Aircraft("LAX","Los Angeles, California	United States"),
				new Aircraft("ORD","Chicago, Illinois	United States"),
				new Aircraft("LHR","Hillingdon, London	United Kingdom"),
				new Aircraft("HKG","Hong Kong	Hong Kong SAR, China"),
				new Aircraft("PVG","Pudong, Shanghai China"),
				new Aircraft("CDG","Roissy-en-France, France")
				);
	}

}

