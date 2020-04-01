package edu.hm.hafner.analysis;

public class LineRangeBuilder {
    private int start;
    private int end;

    public LineRangeBuilder(final int start, final int end) {
        this.start = start;
        this.end = end;
    }

    public LineRangeBuilder() {

    }

    public LineRangeBuilder setStart(final int start) {
        this.start = start;
        return this;
    }

    public LineRangeBuilder setEnd(final int end) {
        this.end = end;
        return this;
    }

    public LineRange build(){
        return new LineRange(start, end);
    }
}
