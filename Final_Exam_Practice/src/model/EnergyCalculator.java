package model;

public class EnergyCalculator {
	public static String getKE(double mass, double velocity) {
		double massKG = mass*0.453592;
		double velocityMS = velocity / 3.6;
		
		double energy =  (massKG*velocityMS*velocityMS) / 2;
		
		String energyString = String.format("%.2f", energy);
		
		return energyString;
	}
}

