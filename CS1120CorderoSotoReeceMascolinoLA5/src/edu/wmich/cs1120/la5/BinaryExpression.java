package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {
	private IOperation op;
	private IExpression left;
	private IExpression right;
	BinaryExpression(IOperation op, IExpression left, IExpression right){
	     this.op=op;
	     this.left=left;
	     this.right=right;
	}
	
	public Integer getValue(){
		//test push
		return op.perform(left, right);
	}

}
