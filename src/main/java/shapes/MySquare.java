package shapes;

public class MySquare extends MyShape{

    MyPoint startsq;
    int widthsq;
    int heightsq;

    public MySquare(MyPoint startsq, int widthsq, int heightsq) {
        this.startsq = startsq;
        this.widthsq = widthsq;
        this.heightsq = heightsq;
    }

    public MyPoint getStartsq() {
        return startsq;
    }

    public void setStartsq(MyPoint startsq) {
        this.startsq = startsq;
    }

    public int getWidthsq() {
        return widthsq;
    }

    public void setWidthsq(int widthsq) {
        this.widthsq = widthsq;
    }

    public int getHeightsq() {
        return heightsq;
    }

    public void setHeightsq(int heightsq) {
        this.heightsq = heightsq;
    }
}
