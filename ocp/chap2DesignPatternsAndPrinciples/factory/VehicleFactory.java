package ocp.chap2DesignPatternsAndPrinciples.factory;

public class VehicleFactory {

	public static Vehicle getVehicle(String type) {
		switch(type) {
			case "bike": return new Bike();
			case "car": return new Car();
			case "truck": return new Truck();
		}
		throw new UnsupportedOperationException("Unsupported type: " + type);
	}
}
