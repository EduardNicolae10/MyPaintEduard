package com.example.mypaint;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import shapes.*;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        MyBagOfShapes mbs = new MyBagOfShapes();


        MyCircle circle1 = new MyCircle(new MyPoint(300, 300), 100);

        MyRectangle myr1 = new MyRectangle(new MyPoint(30, 700), 50, 100);

        MyRectangle myr2 = new MyRectangle(new MyPoint(450, 500), 150, 40);

        mbs.addShape(circle1);
        mbs.addShape(myr1);
        mbs.addShape(myr2);

        drawShapeInJavaFX(mbs,stage);



    }

    private void drawShapeInJavaFX(MyBagOfShapes mbs,Stage stage){

        Group group = new Group();// de pe net din javafx
        Group root = new Group();
        //aici trebuie sa lucrez  eu cu mbs in context de javafx

        MyShape[] shapes = mbs.getShapes();
        for(int i=0; i< shapes.length; i++){
            if (shapes[i]instanceof MyCircle){
                Circle circle = new Circle(); // de pe net
                circle.setCenterX(((MyCircle) shapes[i]).getCenter().getX()); // de pe net
                circle.setCenterY(((MyCircle) shapes[i]).getCenter().getY()); // de pe net
                circle.setRadius(((MyCircle) shapes[i]).getRadius()); // de pe net
                group.getChildren().add(circle); // de pe net

            }
            else if (shapes[i]instanceof MyRectangle){
                Rectangle rectangle = new Rectangle(); //  de pe net
                rectangle.setX(((MyRectangle) shapes[i]).getStart().getX()); // de pe net
                rectangle.setY(((MyRectangle) shapes[i]).getStart().getY()); // de pe net
                rectangle.setWidth(((MyRectangle) shapes[i]).getWidth());  // de pe net
                rectangle.setHeight(((MyRectangle) shapes[i]).getHeight()); // de pe net
                group.getChildren().add(rectangle); // asta de pe net
            }
            else if(shapes[i]instanceof MySquare){
                Rectangle rectangle = new Rectangle(); //  de pe net
                rectangle.setX(((MySquare) shapes[i]).getStartsq().getX()); // de pe net
                rectangle.setY(((MySquare) shapes[i]).getStartsq().getY()); // de pe net
                rectangle.setWidth(((MySquare) shapes[i]).getWidthsq());  // de pe net
                rectangle.setHeight(((MySquare) shapes[i]).getHeightsq()); // de pe net
                group.getChildren().add(rectangle);
            }
            else if(shapes[i]instanceof MyRoundeRectangle) {
                Rectangle rectangle = new Rectangle(); //  de pe net
                rectangle.setX(((MyRoundeRectangle) shapes[i]).getStartr().getX()); // de pe net
                rectangle.setY(((MyRoundeRectangle) shapes[i]).getStartr().getY()); // de pe net
                rectangle.setWidth(((MyRoundeRectangle) shapes[i]).getWidthr());  // de pe net
                rectangle.setHeight(((MyRoundeRectangle) shapes[i]).getHeightr());
                rectangle.setArcWidth(((MyRoundeRectangle) shapes[i]).getArcwidth());
                rectangle.setHeight(((MyRoundeRectangle) shapes[i]).getArcheight());
                group.getChildren().add(rectangle);
            }
        }

        //set file scene
        Scene scene = new Scene(group,1000,1000);

        Scene scene1 = new Scene(root,600,300);
        stage.setScene(scene);
        stage.setScene(scene1);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}