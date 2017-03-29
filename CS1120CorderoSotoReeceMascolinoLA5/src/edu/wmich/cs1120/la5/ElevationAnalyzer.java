package edu.wmich.cs1120.la5;

import java.io.IOException;
import java.util.ArrayList;


import edu.wmich.cs1120.la5.TerrainScanner;

public class ElevationAnalyzer implements IRover{
	private IMapCreator mc = new MapCreatorFromDat();
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private String analysis;
	
	
	public ArrayList<IArea> getPath(){
			return path;
		}
	
	public void setPath(ArrayList<IArea> path){
		this.path= path;
	}
	
	public void analyzePath(){
		double sum = 0;
		double average;
		for(int i=0;i<path.size();i++){
			sum=sum+path.get(i).getElevation();
		}
		average=sum/path.size();
		setAnalysis(""+average);
	}
	
	public String getAnalysis(){
		return analysis;
	}
	public void setAnalysis(String analysis){
		this.analysis=analysis;
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
