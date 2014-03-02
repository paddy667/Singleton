// Wired sensor factory
public class WiredSensorFactory implements ISensorFactory {
	
	public WiredSensorFactory(){
		System.out.println("WIRED Sensor Factory \n =======================");
	}
	
	public IHeaterSensor createHeaterSensor(){
		return new WiredHeaterSensor();
	}
	
	public IDoorSensor createDoorSensor(){
		return new WiredDoorSensor();
	}
}
