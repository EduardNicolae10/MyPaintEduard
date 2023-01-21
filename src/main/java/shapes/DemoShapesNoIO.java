package shapes;

public class DemoShapesNoIO {

    public static void main(String[] args) {

        MyBagOfShapes mbs = new MyBagOfShapes();


        MyCircle circle1 = new MyCircle(new MyPoint(300, 300), 100);

        MyRectangle myr1 = new MyRectangle(new MyPoint(30, 700), 50, 100);

        MyRectangle myr2 = new MyRectangle(new MyPoint(450, 500), 150, 40);

        MySquare mys = new MySquare(new MyPoint(750,750),50,50);

        MyRoundeRectangle myrr = new MyRoundeRectangle(new MyPoint(70,50),100, 45,
        44,55);

        mbs.addShape(circle1);
        mbs.addShape(myr1);
        mbs.addShape(myr2);
        mbs.addShape(mys);
        mbs.addShape(myrr);
    }
}