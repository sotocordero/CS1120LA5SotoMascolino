package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer {
	private IMapCreator mc1 = new MapCreatorFromTxt();
	private IMapCreator mc2 = new MapCreatorFromDat();
	private ArrayList<IArea> path = new ArrayList<IArea>();
	
	
	public ArrayList<IArea> getPath(){
			return path;
		}
	
	public void setPath(ArrayList<IArea> path){
		path= mc1.getScanner().getPath(int a, int b);
	}
	
	public void analyzePath(){
		
	}
	
	public String getAnalysis(){
double total=0;
		
		return total+"";
	}
	public void setAnalysis(String analysis){
		
	}

	@Override
	public String toString() {
		return "Radiation Analyzer";
	}
	
}
