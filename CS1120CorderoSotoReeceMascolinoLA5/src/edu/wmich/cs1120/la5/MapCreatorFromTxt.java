package edu.wmich.cs1120.la5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.wmich.cs1120.la5.Area;
import edu.wmich.cs1120.la5.HighArea;
import edu.wmich.cs1120.la5.LowArea;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromTxt{
	private TerrainScanner scanner=new TerrainScanner();
	private Area[][] area=new Area[10][10];
	/**
	 * Description: scanTerrain takes incoming data and parses it to a 2x2 Area array for rover use.
	 * This method also distinguishes different Areas into high or low areas.
	 * @param csv- takes all incoming data and puts into an arraylist for further sorting
	 * @param counter- an integer used to help sort the csv data into a 2x2 array
	 */
public void scanTerrain(String fileName, int threshold) throws IOException{
	
    Scanner keyboard=new Scanner(System.in);
    ArrayList<Double> csv =new ArrayList<Double>();
    int counter=0;
     File textFile = new File(fileName);

}	
}
