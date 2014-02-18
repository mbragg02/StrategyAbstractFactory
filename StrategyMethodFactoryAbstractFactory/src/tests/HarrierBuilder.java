package tests;

import vehicles.Airplane;
import vehicles.Flying;
import vehicles.FlyingFactory;
import vehicles.LiftOff;
import vehicles.LiftOffFactory;

public class HarrierBuilder implements Builder {

	private Airplane airplane;
	private Flying flying;
	private LiftOff liftoff;

	/* (non-Javadoc)
	 * @see tests.Builder#getAirplane()
	 */
	@Override
	public Airplane getAirplane() {
		return airplane;
	}

	/* (non-Javadoc)
	 * @see tests.Builder#buildFlying()
	 */
	@Override
	public void buildFlying() {
		FlyingFactory flyingFactory = new FlyingFactory();
		flying =  flyingFactory.createFlying("Fighter Jet");
		
	}

	/* (non-Javadoc)
	 * @see tests.Builder#buildLiftOff()
	 */
	@Override
	public void buildLiftOff() {
		LiftOffFactory liftOffFactory = new LiftOffFactory();
		liftoff =  liftOffFactory.createLiftOff("Vertically");
		
	}

	/* (non-Javadoc)
	 * @see tests.Builder#buildAirplane()
	 */
	@Override
	public void buildAirplane() {
		
		airplane = new Airplane(liftoff, flying);
		
	}

}
