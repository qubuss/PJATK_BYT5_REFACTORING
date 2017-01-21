package src.service;

import src.Expression;

public class Addition {
    public Integer eval(Expression expression) throws IllegalStateException{
        return expression.getLeft().getConstant() + expression.getRight().getConstant();
    }
}
