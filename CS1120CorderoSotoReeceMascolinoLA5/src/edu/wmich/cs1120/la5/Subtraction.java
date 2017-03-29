package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation{

	

	/**
	 * @param IExpression object
	 * @param IExpression object
	 * @return Returns the difference of two IExpression objects 
	 */
	public Integer perform(IExpression left, IExpression right) {
		// TODO Auto-generated method stub
		return (left.getValue()-right.getValue());
	}

}
