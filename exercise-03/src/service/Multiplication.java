package src.service;

import src.Expression;

public class Multiplication {
    public int eval(Expression expression) throws IllegalStateException{
        return expression.getLeft().getConstant() * expression.getRight().getConstant();
    }

}
