
public class WiredHeaterSensor implements IHeaterSensor {

	public WiredHeaterSensor(){
		System.out.println("Heater sensor created for a WIRED system");
	}
	
	public void measure(){
		System.out.println("WIRED Heater Sensor Started");
	}
}