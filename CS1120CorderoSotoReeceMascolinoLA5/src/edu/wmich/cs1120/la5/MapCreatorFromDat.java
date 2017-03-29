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

	
	public TerrainScanner getScanner() {
		return scanner;
		
	}

	
	public void setScanner(TerrainScanner scanner) {
		this.scanner=scanner;
	}

}
