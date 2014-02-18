package tests;

import vehicles.Airplane;
import vehicles.Flying;
import vehicles.FlyingFactory;
import vehicles.LiftOff;
import vehicles.LiftOffFactory;

public class ModelBuilder implements Builder {

	private Airplane airplane;
	private Flying flying;
	private LiftOff liftoff;

	@Override
	public Airplane getAirplane() {
		return airplane;
	}

	@Override
	public void buildFlying() {
		flying =  FlyingFactory.createFlying("Model Airplane");

	}

	@Override
	public void buildLiftOff() {
		liftoff =  LiftOffFactory.createLiftOff("don't");

	}

	@Override
	public void buildAirplane() {
		airplane = new Airplane(liftoff, flying);

	}

}
