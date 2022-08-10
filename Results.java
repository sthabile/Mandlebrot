package mandelbrot;

public class Results
{
    private int start;
    private int end;
    private byte[][] results;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public byte[][] getResults() {
        return results;
    }

    public void setResults(byte[][] results) {
        this.results = results;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
