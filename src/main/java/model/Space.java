package model;

public class Space {

    private final boolean fixed;
    private Integer actual;
    private final int expected;


    public Space(final int expected, final boolean fixed) {
        this.fixed = fixed;
        this.expected = expected;
        if (fixed){
            actual = expected;
        }
    }

    public boolean isFixed() {
        return fixed;
    }

    public Integer getActual() {
        return actual;
    }

    public int getExpected() {
        return expected;
    }

    public void clearSpace(){
        setActual(null);
    }

    public void setActual(Integer actual) {
        if (fixed) return;
        this.actual = actual;
    }
}
