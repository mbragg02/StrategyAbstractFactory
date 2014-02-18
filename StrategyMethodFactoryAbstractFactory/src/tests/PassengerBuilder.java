package tests;

import vehicles.Airplane;
import vehicles.Flying;
import vehicles.FlyingFactory;
import vehicles.LiftOff;
import vehicles.LiftOffFactory;

public class PassengerBuilder implements Builder {
	
	private Airplane airplane;
	private Flying flying;
	private LiftOff liftoff;

	@Override
	public Airplane getAirplane() {
		return airplane;
	}

	@Override
	public void buildFlying() {
		flying =  FlyingFactory.createFlying("Passenger Airplane");

	}

	@Override
	public void buildLiftOff() {
		liftoff =  LiftOffFactory.createLiftOff("Horizontally");

	}

	@Override
	public void buildAirplane() {
		airplane = new Airplane(liftoff, flying);

	}

}
