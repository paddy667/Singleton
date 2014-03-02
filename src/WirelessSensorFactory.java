//Wireless sensor factory
public class WirelessSensorFactory implements ISensorFactory {
	
	private static WirelessSensorFactory instance;
	
	private WirelessSensorFactory(){
		System.out.println("WIRELESS Sensor Factory \n =======================");
	}
	
	public synchronized static WirelessSensorFactory getWirelessFactory(){
		if (instance == null){
			instance = new WirelessSensorFactory();
		}
		return instance;
	}
	
	public IHeaterSensor createHeaterSensor(){
		return new WirelessHeaterSensor();
	}
	
	public IDoorSensor createDoorSensor(){
		return new WirelessDoorSensor();
	}

}
