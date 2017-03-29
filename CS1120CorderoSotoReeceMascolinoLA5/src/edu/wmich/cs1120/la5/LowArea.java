package edu.wmich.cs1120.la5;

public class LowArea extends Area {
	LowArea(){
		super();
	}
	/**
	 * 
	 * @returns Returns the double consumed energy
	 */
	public double calcConsumedEnergy(){
		double consumedEnergy=getBasicEnergyCost() * 2;
		
		return consumedEnergy;
		
	}
}
