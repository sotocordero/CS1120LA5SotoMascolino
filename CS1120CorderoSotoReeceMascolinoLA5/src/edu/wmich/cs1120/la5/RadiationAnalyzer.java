package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer {
	//private IMapCreator mc1 = new MapCreatorFromTxt();
	private IMapCreator mc2 = new MapCreatorFromDat();
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
		
		for(int i=0;i<path.size();i++){
			sum=sum+path.get(i).getRadiation();
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
		return "Radiation Analyzer";
	}
	
}
