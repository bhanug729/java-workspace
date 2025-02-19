package $08_Inheritance.$02_Inheritance_Test;

import $08_Inheritance.$01_Inheritance.Vehicle;
import $08_Inheritance.$01_Inheritance.TwoWheeler;
import $08_Inheritance.$01_Inheritance.MotorCycle;

public class InheritanceTest {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.commute();
		// Before override --> ClassName + @ + hashcode(in hexadecimal) 
		System.out.println(vehicle.toString());
		System.out.println(vehicle.hashCode());
		System.out.println(vehicle.getClass() + "\n");

		TwoWheeler two = new TwoWheeler();
		two.commute();
		two.balance();
		System.out.println();

		MotorCycle motor = new MotorCycle();
		motor.commute();
		motor.balance();
		motor.start();
		System.out.println();
		
		SpecialMotorCycle spMotor = new SpecialMotorCycle();
		spMotor.commute();
		spMotor.balance();
		spMotor.start();
	}
}
