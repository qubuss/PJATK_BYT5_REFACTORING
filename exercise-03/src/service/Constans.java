package src.service;

import src.Expression;

public class Constans {
    public Integer eval(Expression expression) throws IllegalStateException{
        return expression.getConstant();
    }
}
