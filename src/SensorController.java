//Client
public class SensorController {

	IHeaterSensor heaterSensor = null;
	IDoorSensor doorSensor = null; 
	
	public SensorController (ISensorFactory factory){
		doorSensor = factory.createDoorSensor();
		heaterSensor = factory.createHeaterSensor();
	}
	
	public void start(){
		doorSensor.detect();
		heaterSensor.measure();
	}
}
