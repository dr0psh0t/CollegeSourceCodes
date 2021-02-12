package javaEight;
// default methods

interface Fly
{
/*	public void takeOff();
	public void turn();
	public void cruise();
	public void land();
*/
	
	default public void takeOff() {System.out.println("Fly::takeoff");}
	default public void turn() {System.out.println("Fly::turn");}
	default public void cruise() {System.out.println("Fly::cruise");}
	default public void land() {System.out.println("Fly::land");}
}

interface FastFly extends Fly
{
	default public void takeOff() {
		System.out.println("FastFly::takeOff");
	}
}

class Vehicle{
	public void land() {System.out.println("Vehicle::land");}
}

interface Sail{
	default public void cruise() {System.out.println("Sail::cruise");}
}

class SeaPlane extends Vehicle implements FastFly, Sail
{
	public void cruise()
	{
		System.out.println("SeaPlane::cruise");
		FastFly.super.cruise();
	}
}

public class SampleThree {
	public void use()
	{
		SeaPlane seaPlane = new SeaPlane();
		seaPlane.takeOff();
		seaPlane.turn();
		seaPlane.cruise();
		seaPlane.land();
	}
	public static void main(String[] args) {
		new SampleThree().use();
	}
}