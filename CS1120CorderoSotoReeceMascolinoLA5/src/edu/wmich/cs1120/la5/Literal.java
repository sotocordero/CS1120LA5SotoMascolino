package edu.wmich.cs1120.la5;

public class Literal implements IExpression{
	private int value;
	public Literal(int value1){
		this.value=value1;
	}
	
	public Integer getValue(){
		return value;
	}
}
