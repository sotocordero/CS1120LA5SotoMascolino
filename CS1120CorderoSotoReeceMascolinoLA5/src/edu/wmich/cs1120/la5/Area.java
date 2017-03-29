package edu.wmich.cs1120.la5;


public abstract class Area implements IArea {
	
		private double basicEnergyCost;
		private double elevation;
		private double radiation;
		/**
		 * @return returns basicEnergyCost
		 */
		public double getBasicEnergyCost() {
			return basicEnergyCost;
		}
		
		/**
		 * @param basicEnergyCost: sets basicEnergyCost for the given area.
		 */
		
		public void setBasicEnergyCost(double basicEnergyCost) {
			this.basicEnergyCost = basicEnergyCost;
		}
		
		/**
		 * @return returns elevation
		 */
		public double getElevation() {
			return elevation;
		}
		
		/**
		 * @param elevation: sets elevation level for the given area.
		 */
		public void setElevation(double elevation) {
			this.elevation = elevation;
		}
		
		/**
		 * @return returns radiation
		 */
		public double getRadiation() {
			return radiation;
		}
		
		/**
		 * @param radiation: sets radiation level for the given area.
		 */
		public void setRadiation(double radiation) {
			this.radiation = radiation;
		}
		
		/**
		 * @return returns consumed energy. This method is extended by the subclasses for the actual calculations.
		 */
		public double calcConsumedEnergy(){
			double consumedEnergy=0;
			
			return consumedEnergy;
			
		}

	}


