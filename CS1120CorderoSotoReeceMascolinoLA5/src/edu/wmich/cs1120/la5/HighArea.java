package edu.wmich.cs1120.la5;

public class HighArea extends Area{
	HighArea(){
		super();
	}
	/**
	 * 
	 * @return Returns the double consumedEnergy
	 */
	public double calcConsumedEnergy(){
		double consumedEnergy=getBasicEnergyCost() * 4;
		
		return consumedEnergy;
		
	}
}
