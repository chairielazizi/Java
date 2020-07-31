/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urbansmallroad;

import java.awt.Graphics;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Rectangle;  
import javafx.scene.transform.Rotate;  
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;

import java.util.concurrent.CountDownLatch;
import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import static javafx.scene.text.Font.font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author user
 */
public class window extends Application{
    public static final CountDownLatch latch = new CountDownLatch(1);
    public static window window = null;

    public static window waitForStartUpTest() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return window;
    }

    public static void setStartUpTest(window startUpTest0) {
        window = startUpTest0;
        latch.countDown();
    }

    public window() {
        setStartUpTest(this);
    }

    public void printSomething() {
        System.out.println("You called a method on the application");
    }
    
    //public static GridPane grid = new GridPane();
    
   
    public int[][] check(){
        int h=0,l=0;
        int[][] got = new int[h][l];
        try {
            Scanner s = new Scanner( (Readable) new FileOutputStream("check.txt"));
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < l; j++) {
                    got[i][j] = s.nextInt();
                }
            }
            s.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
    }
        return got;
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Window");
        BorderPane pane = new BorderPane();
        GridPane grid1 = new GridPane();
        GridPane grid2 = new GridPane();
        AnchorPane anchor1 = new AnchorPane();
        Text text1 = new Text("City Map");
        
        grid1.setPadding(new Insets(10,10,10,10));
        grid1.setMinSize(400, 200);
        grid1.setVgap(1);
        grid1.setHgap(1);
        grid1.setAlignment(Pos.TOP_CENTER);
        grid1.setStyle("-fx-background-color: #F0E68C;");
        
        grid2.setPadding(new Insets(10,10,10,10));
        grid2.setMinSize(400, 200);
        grid2.setVgap(1);
        grid2.setHgap(1);
        grid2.setAlignment(Pos.TOP_CENTER);
        grid2.setStyle("-fx-background-color: #F0E68C;");
        
        pane.setLeft(grid1);
        pane.setRight(grid2);
        //pane.setTop(anchor1);
        
        text1.setFont(Font.font(STYLESHEET_MODENA, FontWeight.BOLD, FontPosture.ITALIC, 40));
        text1.setX(150);
        text1.setY(0);
        
        Scene scene = new Scene(pane,1100,700);
        stage.setScene(scene);
        stage.show();
        
        grid1.add(text1, 50, 70);
        
        /*
        HBox hb = new HBox();
        hb.getChildren().addAll(text1);
        anchor1.getChildren().addAll(hb);
        anchor1.setMinSize(100,100);
        anchor1.setTopAnchor(hb,8.0);
        */
        String[][] map = new String[20][20] ;
        
        //check();
        for(int row=0;row<map.length;row++){
            for(int column=0;column<map[row].length;column++){
                Rectangle rec = new Rectangle(0,0,12,12);
                //rec.setFill(Color.BLUE);
                grid1.add(rec, row, column);
                /*
                if(map[row][column].equals(1)){
                    rec.setFill(Color.BLUE);
                    grid.add(rec, row, column);
                }
                */
            }
        }
        for(int row=0;row<map.length;row++){
            for(int column=0;column<map[row].length;column++){
                Rectangle rec = new Rectangle(0,0,12,12);
                grid2.add(rec, row, column);
            }
        }
    }
    
    public static void main(String[] args){
        Application.launch(args);
    }
}
