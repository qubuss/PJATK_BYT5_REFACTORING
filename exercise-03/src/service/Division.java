package src.service;

import src.Expression;

public class Division {
    public int eval(Expression expression) throws IllegalStateException{
        return expression.getLeft().getConstant() / expression.getRight().getConstant();
    }
}
