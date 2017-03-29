package edu.wmich.cs1120.la5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import edu.wmich.cs1120.la5.Area;
import edu.wmich.cs1120.la5.HighArea;
import edu.wmich.cs1120.la5.LowArea;
import edu.wmich.cs1120.la5.TerrainScanner;
import edu.wmich.cs1120.la5.Area;
import edu.wmich.cs1120.la5.HighArea;
import edu.wmich.cs1120.la5.LowArea;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromTxt {
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

   Scanner inFile = new Scanner(textFile);
   while(inFile.hasNextDouble()){
	   csv.add(inFile.nextDouble());
   }
   
   for(int i=0;i<10;i++){
	   for(int n=0;n<10;n++){
		   if(csv.get(counter +2)>=0.5)
			   area[i][n]=new HighArea();
		   else if(csv.get(counter+2)<0.5 && csv.get(counter+1)>=threshold*0.5){
			   area[i][n]=new HighArea();
		   }
		   else{
			   area[i][n]=new LowArea();
		   }
		   area[i][n].setBasicEnergyCost(csv.get(counter));
		   counter++;
		   area[i][n].setElevation(csv.get(counter));
		   counter++;
		   area[i][n].setRadiation(csv.get(counter));
		   counter++;
	   }
		   
   }
   scanner.setTerrain(area);

}
	/**
	 * 
	 * @return scanner: returns the scanner object
	 */

	public TerrainScanner getScanner(){
		return scanner;
	}
	
	/**
	 * @param Scanner: the terrainScanner object
	 */
	
	public void setScanner(TerrainScanner scanner){
		this.scanner=scanner;
	}
/**
 * 
 * @return Area: returns the 2x2 area array
 */
	
	public Area[][] getArea() {
		return area;
	}
	
/**
 * 
 * @param area: sets area
 */
	
	public void setArea(Area[][] area) {
		this.area = area;
	}
	

}
