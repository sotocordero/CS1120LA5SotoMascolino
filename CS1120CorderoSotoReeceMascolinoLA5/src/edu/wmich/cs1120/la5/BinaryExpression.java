package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression{
	private IOperation op;
	private IExpression left;
	private IExpression right;
	
	public BinaryExpression(IExpression left,IExpression right, IOperation op){
		this.left=left;
		this.right=right;
		this.op=op;
		
	}
	/**
	 * This method returns the value from the binary expression by using
	 * the perform method
	 * 
	 * @return Returns the value of the perform method
	 */
	public Integer getValue(){
		return op.perform(left, right);
		
	}

}
