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
		ArrayList<Double> inputs=new ArrayList<Double>();
		int counter=0;
	}

	
	public TerrainScanner getScanner() {
		return scanner;
		
	}

	
	public void setScanner(TerrainScanner scanner) {
		this.scanner=scanner;
	}

}
