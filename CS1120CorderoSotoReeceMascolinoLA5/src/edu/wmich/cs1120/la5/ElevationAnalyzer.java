package edu.wmich.cs1120.la5;

import java.io.IOException;
import java.util.ArrayList;


import edu.wmich.cs1120.la5.TerrainScanner;

public class ElevationAnalyzer implements IRover{
	private IMapCreator mc = new MapCreatorFromDat();
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private String analysis;
	
	/**
	 * Getter for ArrayList of IArea
	 * @return Returns ArrayList of IArea
	 */
	public ArrayList<IArea> getPath(){
			return path;
		}
	
	/**
	 * Setter for ArrayList of IArea
	 * @param Takes an ArrayList of IArea
	 */
	public void setPath(ArrayList<IArea> path){
		this.path= path;
	}
	
	/**
	 * This method finds the average elevation of the 
	 * ArrayList path
	 * Calls the setAnalysis method
	 */
	public void analyzePath(){
		double sum = 0;
		double average;
		for(int i=0;i<path.size();i++){
			sum=sum+path.get(i).getElevation();
		}
		average=sum/path.size();
		setAnalysis(""+average);
	}
	/**
	 * getter for analysis
	 * @return Returns String analysis
	 */
	public String getAnalysis(){
		return analysis;
	}
	/**
	 * setter for analysis
	 * @param Takes a String analysis
	 */
	public void setAnalysis(String analysis){
		this.analysis=analysis;
	}

	@Override
	
	public String toString() {
		return "Elevation Analyzer";
	}
	
	
	
	
}
