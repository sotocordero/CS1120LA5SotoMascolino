package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer {
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
		return "Radiation Analyzer";
	}
	public double calculateRadiation(){
		double total=0;
		
		return total;
	}
}
