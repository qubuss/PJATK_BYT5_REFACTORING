package src.domain;

import src.service.*;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    Map<Character, Class> mapa = new HashMap<Character, Class>();

    public Mapa() {
        add();
    }

    private void add(){
        mapa.put('+', Addition.class);
        mapa.put('-', Subtraction.class);
        mapa.put('*', Multiplication.class);
        mapa.put('/', Division.class);
        mapa.put('c', Constans.class);
    }

    public Map<Character, Class> getMapa() {
        return mapa;
    }
}
