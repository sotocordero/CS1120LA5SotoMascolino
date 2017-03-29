package edu.wmich.cs1120.la5;

public class Addition implements IOperation{

	/**
	 * 
	 * @param IExpression object 
	 * @param IExpression object
	 * @return Returns the sum of the left and right objects
	 */
	public Integer perform(IExpression left, IExpression right) {
		
		return (left.getValue()+right.getValue());
	}

}
