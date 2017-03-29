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
		IExpression left;
		IExpression right;
		IExpression total;
		left=new Literal(val1);
		right= new Literal(val2);
		if(operator== '+'){
			operate=new Addition();
			total=new BinaryExpression(operate, left, right);
			return total;
		}
		else{
			operate=new Subtraction();
			total=new BinaryExpression(operate, left, right);
			return total;
		}
		//Double.BYTES;
		//Integer.BYTES;
		//Character.BYTES;
		
	
	}
}
