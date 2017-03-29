package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.TerrainScanner;
import java.io.IOException;
import java.util.ArrayList;

public class EnergyAnalyzer implements IRover{
	private IMapCreator mc = new MapCreatorFromDat();
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private String analysis;
	
	
public ArrayList<IArea> getPath(){
		return path;
	}
	
	public void setPath(ArrayList<IArea> path){
		this.path=path;
	}
	
	public void analyzePath(){
		double sum = 0;
		
		for(int i=0;i<path.size();i++){
			sum=sum+path.get(i).calcConsumedEnergy();
		}
		
		setAnalysis(""+sum);
	}
	
	public String getAnalysis(){
		return analysis;
	}
	public void setAnalysis(String analysis){
		this.analysis=analysis;
	}

	@Override
	public String toString() {
		return "Energy Analyzer ";
	}
	
}
