/**
 * 
 */
package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vehicles.Airplane;


/**
 * @author oded
 *
 */
public class AirplaneTest {



	@Test
	public void test1() {

		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;

		Builder builder = new HarrierBuilder(); 

		Director director = new Director(builder); 

		director.constructAirplane();

		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

	}


	@Test
	public void test2() {

		String expectedOutput = "I don't Fly";
		String stringReturned = null;

		Builder builder = new ModelBuilder(); 

		Director director = new Director(builder); 

		director.constructAirplane();

		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

	}

	@Test
	public void test3() {

		String expectedOutput = "Like a passenger airplane";
		String stringReturned = null;

		Builder builder = new PassengerBuilder(); 

		Director director = new Director(builder); 

		director.constructAirplane();

		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

	}


	@Test
	public void test4() {

		String expectedOutput = "Vertically";
		String stringReturned = null;

		Builder builder = new HarrierBuilder(); 

		Director director = new Director(builder); 

		director.constructAirplane();

		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

	}

	@Test
	public void test5() {

		String expectedOutput = "I don't LiftOff";
		String stringReturned = null;

		Builder builder = new ModelBuilder(); 

		Director director = new Director(builder); 

		director.constructAirplane();

		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

	}

	@Test
	public void test6() {

		String expectedOutput = "Horizontally";
		String stringReturned = null;

		Builder builder = new PassengerBuilder(); 

		Director director = new Director(builder); 

		director.constructAirplane();

		Airplane classUnderTest = builder.getAirplane();

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

	}


}
