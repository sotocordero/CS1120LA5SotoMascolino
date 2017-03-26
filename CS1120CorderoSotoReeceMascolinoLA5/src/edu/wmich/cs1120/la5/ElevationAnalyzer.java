package edu.wmich.cs1120.la5;

import java.io.IOException;
import java.util.ArrayList;


import edu.wmich.cs1120.la5.TerrainScanner;

public class ElevationAnalyzer implements IRover{
	private MapCreator mc = new MapCreator();
	private ArrayList<IArea> path = new ArrayList<IArea>();
	
	
	public ArrayList<IArea> getPath(){
			return path;
		}
	
	public void setPath(ArrayList<IArea> path){
		path= mc.getScanner().getPath();
	}
	
	public void analyzePath(){
		
	}
	
	public String getAnalysis(){
		
	}
	public void setAnalysis(String analysis){
		
	}

	@Override
	public String toString() {
		return "Elevation Analyzer";
	}
	
	public double elevationAnalyzer(){
		double total=0;
		
		return total;
	}
}
