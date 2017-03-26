package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer {
	private IMapCreator mc1 = new MapCreatorFromTxt();
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
double total=0;
		
		return total;
	}
	public void setAnalysis(String analysis){
		
	}

	@Override
	public String toString() {
		return "Radiation Analyzer";
	}
	public double calculateRadiation(){
		
	}
}
