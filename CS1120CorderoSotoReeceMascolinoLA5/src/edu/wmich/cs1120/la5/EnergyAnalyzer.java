package edu.wmich.cs1120.la5;
import edu.wmich.cs1120.la3.Area;
import edu.wmich.cs1120.la3.MapCreator;
import edu.wmich.cs1120.la5.TerrainScanner;
import java.io.IOException;
import java.util.ArrayList;

public class EnergyAnalyzer implements IRover{
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
		double total=0;
		for(int i=0;i<path.size();i++){
			total=path.get(i).calcConsumedEnergy()+total;
		}
		return total+"";
	}
	public void setAnalysis(String analysis){
		
	}

	@Override
	public String toString() {
		return "Energy Analyzer ";
	}
	
}
