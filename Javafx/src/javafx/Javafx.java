/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Rectangle;  
import javafx.scene.transform.Rotate;  
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;  

/**
 *
 * @author user
 */
public class Javafx extends Application{  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        primaryStage.setTitle("Window");
        StackPane layout = new StackPane();
        
        Scene scene = new Scene(layout,900,500);
        primaryStage.setScene(scene);
        primaryStage.show();
        // TODO Auto-generated method stub  
        // creating the rectangles   
        /*
        Rectangle rect1 = new Rectangle(100,100,200,200);  
        Rectangle rect2 = new Rectangle(100,100,200,200);  

        // setting the color and stroke for the Rectangles    
        rect1.setFill(Color.LIMEGREEN);  
        rect2.setFill(Color.DARKGREY);  
        rect1.setStroke(Color.BLACK);  
        rect2.setStroke(Color.BLACK);  

        // instantiating the Rotate class.   
        Rotate rotate = new Rotate();  

        //setting properties for the rotate object.   
        rotate.setAngle(30);  
        rotate.setPivotX(100);  
        rotate.setPivotY(300);  

        //rotating the 2nd rectangle.   
        rect2.getTransforms().add(rotate);  

        Group root = new Group();  
        root.getChildren().addAll(rect1,rect2);  
        Scene scene = new Scene(root,500,420);  
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Rotation Example");  
        primaryStage.show();  
    */
    }  
public static void main(String[] args) {  
    launch(args);  
}  
}  
