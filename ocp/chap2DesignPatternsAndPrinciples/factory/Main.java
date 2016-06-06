package ocp.chap2DesignPatternsAndPrinciples.factory;

public class Main {

	public static void main(String... args) {
		final Vehicle myVehicle = VehicleFactory.getVehicle("bike");
		System.out.println(myVehicle.getWheelsNumber());
	}
}
