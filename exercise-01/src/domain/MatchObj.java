package src.domain;

public class MatchObj {
    private int[] expected;
    private int[] actual;
    private int clipLimit;
    private int delta;

    public MatchObj(int[] expected, int[] actual, int clipLimit, int delta) {
        this.expected = expected;
        this.actual = actual;
        this.clipLimit = clipLimit;
        this.delta = delta;
    }

    public int[] getExpected() {
        return expected;
    }

    public int[] getActual() {
        return actual;
    }

    public void setActual(int[] actual) {
        this.actual = actual;
    }

    public int getClipLimit() {
        return clipLimit;
    }

    public int getDelta() {
        return delta;
    }

}
