package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.TerrainScanner;
import java.io.IOException;
import java.util.ArrayList;

public class EnergyAnalyzer implements IRover{
	private IMapCreator mc = new MapCreatorFromDat();
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private String analysis;
	
	/**
	 * getter for ArrayList of IArea
	 * @return Returns ArrayList Path
	 */
public ArrayList<IArea> getPath(){
		return path;
	}
	
/**
 * setter for ArrayList Path
 * @param ArrayList for the setter
 */
	public void setPath(ArrayList<IArea> path){
		this.path=path;
	}
	/**
	 * 
	 * 
	 */
	public void analyzePath(){
		double sum = 0;
		
		for(int i=0;i<path.size();i++){
			sum=sum+path.get(i).calcConsumedEnergy();
		}
		
		setAnalysis(""+sum);
	}
	/**
	 * getter for analysis
	 * @return String analysis
	 */
	public String getAnalysis(){
		return analysis;
	}
	
	/**
	 *setter for analysis
	 *@param String for setter
	 */
	public void setAnalysis(String analysis){
		this.analysis=analysis;
	}

	@Override
	public String toString() {
		return "Energy Analyzer ";
	}
	
}
