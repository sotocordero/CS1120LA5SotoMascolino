package edu.wmich.cs1120.la5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;



public class MapCreatorFromDat implements IMapCreator{
	private TerrainScanner scanner=new TerrainScanner();
	private IArea[][] area=new IArea[10][10];
	
	public void scanTerrain(String fileName, int threshold) throws IOException {
		RandomAccessFile file=new RandomAccessFile("terrain.dat", "r");
		int pointer=0;
		
		Integer val1;
		Integer val2;
		Character operator;
		
		for(int i=0;i<area.length;i++){
			for(int j=0;j<area[0].length;j++){
				area[i][j].setBasicEnergyCost(file.readDouble());
				area[i][j].setElevation(file.readDouble());
				area[i][j].setRadiation(file.readDouble());
				operator=file.readChar();
				val1=file.readInt();
				val2=file.readInt();
				
				pointer=ExpressionFactory.getExpression(operator, val1, val2).getValue();
				pointer=pointer*((3*Double.BYTES)+Character.BYTES+(2*Integer.BYTES));
				file.seek(pointer);
			}
		}
		
	}

	
	public TerrainScanner getScanner() {
		return scanner;
		
	}

	
	public void setScanner(TerrainScanner scanner) {
		this.scanner=scanner;
	}

}
