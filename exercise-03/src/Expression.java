package src;


import src.service.Calc;

public class Expression {

//TODO DONE
	private char op;

	private Expression left;

	private Expression right;

	private int constant;

	public Expression(int constant) {
		this.op = 'c';
		this.constant = constant;
	}

	public Expression(char op, Expression left, Expression right) {
		this.op = op;
		this.left = left;
		this.right = right;
	}

	public int evaluate() {

		return new Calc().eval(this);
	}

	public char getOp() {
		return op;
	}

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}

	public int getConstant() {
		return constant;
	}
}
