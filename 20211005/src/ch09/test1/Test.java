package ch09.test1;

public class Test {
	public static void main(String[] args) {
		
	}
}

abstract class Vehicle{
	public static final double load = 1000.0;
	public static final double maxLoad = 5000.0;
	
	public abstract double calcFuelEfficiency();
	
	public abstract double calcTripDistance();
}

class Truck extends Vehicle{
	@Override
	public double calcFuelEfficiency() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	@Override
	public double calcTripDistance() {
		// TODO Auto-generated method stub
		return 0.0;
	}
}

class RiverBarge extends Vehicle{
	@Override
	public double calcFuelEfficiency() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	@Override
	public double calcTripDistance() {
		// TODO Auto-generated method stub
		return 0.0;
	}
}