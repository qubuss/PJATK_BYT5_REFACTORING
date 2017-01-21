package src.service;

import src.Expression;
import src.domain.Mapa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class Calc {

    private Map<Character, Class> mapaDzialan;
    public Calc() {
        Mapa mapa = new Mapa();
        mapaDzialan = mapa.getMapa();
    }

    public int eval(Expression e){
        try {

            Method method = mapaDzialan.get(e.getOp()).getMethod("eval", Expression.class);
            Object i = method.invoke(mapaDzialan.get(e.getOp()).newInstance(), e);
            System.out.println(i);

        } catch (NoSuchMethodException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        } catch (InvocationTargetException e1) {
            e1.printStackTrace();
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        }
        return 0;
    }

}
