package shapes;

public class MyRoundeRectangle extends MyShape{
    MyPoint startr;
    int widthr;
    int heightr;
    int arcwidth;
    int archeight;

    public MyRoundeRectangle(MyPoint startr, int widthr, int heightr, int arcwidth, int archeight) {
        this.startr = startr;
        this.widthr = widthr;
        this.heightr = heightr;
        this.arcwidth = arcwidth;
        this.archeight = archeight;
    }

    public MyPoint getStartr() {
        return startr;
    }

    public void setStartr(MyPoint startr) {
        this.startr = startr;
    }

    public int getWidthr() {
        return widthr;
    }

    public void setWidthr(int widthr) {
        this.widthr = widthr;
    }

    public int getHeightr() {
        return heightr;
    }

    public void setHeightr(int heightr) {
        this.heightr = heightr;
    }

    public int getArcwidth() {
        return arcwidth;
    }

    public void setArcwidth(int arcwidth) {
        this.arcwidth = arcwidth;
    }

    public int getArcheight() {
        return archeight;
    }

    public void setArcheight(int archeight) {
        this.archeight = archeight;
    }
}
