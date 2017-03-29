package edu.wmich.cs1120.la5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;


/**
 * 
 * @author sotocordero
 *
 */
public class MapCreatorFromDat implements IMapCreator{
	private TerrainScanner scanner=new TerrainScanner();
	private IArea[][] area=new IArea[10][10];
	
	/**
	 * @param fileName: Name of the random access file 
	 * @param threshold: threshold input for area calculations
	 * @param pointer: Marks location of next file input
	 * @param val1: integer input from data file used for calculations in finding the next pointer position
	 * @param val2: integer input from data file used for calculations in finding the next pointer position
	 * @param operator: input from data file used for calculations in finding the next pointer position
	 * @param temp1: temporary storage for energy data 
	 * @param temp2: temporary storage for elevation data and used for area calculations
	 * @param temp3: temporary storage for radiation data and used for area calculations
	 * 
	 * 
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {
		RandomAccessFile file=new RandomAccessFile(fileName, "r");
		int pointer=0;
		
		Integer val1;
		Integer val2;
		Character operator;
		file.seek(0);
		double temp1;
		double temp2;
		double temp3;
		
		for(int i=0;i<area.length;i++){
			for(int j=0;j<area[0].length;j++){
				temp1=(file.readDouble());
				temp2=(file.readDouble());
				temp3=(file.readDouble());
				//System.out.println(temp1+" "+temp2+" "+temp3+" ");
				
				operator=file.readChar();
				
				val1=file.readInt();
				val2=file.readInt();
				if(temp3>0.5||temp2>(threshold*0.5)){
					area[i][j]=new HighArea();
					area[i][j].setBasicEnergyCost(temp1);
					area[i][j].setElevation(temp2);
					area[i][j].setRadiation(temp3);
				}
				else{
					area[i][j]=new LowArea();
					area[i][j].setBasicEnergyCost(temp1);
					area[i][j].setElevation(temp2);
					area[i][j].setRadiation(temp3);
				}
				
				//area[i][j]
				
				pointer=ExpressionFactory.getExpression(operator, val1, val2).getValue();
				if(pointer==-1){
					break;
				}
				pointer=pointer*((3*Double.BYTES)+Character.BYTES+(2*Integer.BYTES));
				
				file.seek(pointer);
				
			}
		}
		scanner.setTerrain(area);
	}

	/**
	 * 
	 * @return scanner: returns the scanner object
	 */
	public TerrainScanner getScanner() {
		return scanner;
		
	}

	/**
	 * @param Scanner: the terrainScanner object
	 */
	public void setScanner(TerrainScanner scanner) {
		this.scanner=scanner;
	}

}
