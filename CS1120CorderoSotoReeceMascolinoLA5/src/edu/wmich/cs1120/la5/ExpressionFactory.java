package edu.wmich.cs1120.la5;
import edu.wmich.cs1120.la5.TerrainScanner;
import java.io.IOException;
import java.text.CharacterIterator;
import java.util.ArrayList;

public class ExpressionFactory {
	// This method will create and return a proper object
	//according to the arguments received
	public static IExpression getExpression(char operator, int
	val1, int val2) {
		IOperation operate;
		if(operator== '+'){
			operate=new Addition();
			return operate.;
		}
		
		return null;
	
	}
}
