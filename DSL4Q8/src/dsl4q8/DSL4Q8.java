/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q8;

import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Scanner;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
/**
 *
 * @author user
 */
public class DSL4Q8 {

    /**
     * @param args the command line arguments
     */
    static JFXPanel panel;
    static String song;
    static Media hit;
    static MediaPlayer mediaplayer;
    
    public static void main(String[] args) {
        CircularLinkedList<String> list = new CircularLinkedList<>();
        Scanner s = new Scanner(System.in);
//        System.out.println("Input something:");
//        String in = s.nextLine();
//        String[] input = in.split(" ");
//        for(String ins:input){
//            list.addCircularNode(ins);
//        }
//        list.showCircularList();
        
        
//        mediaplayer.play();
//        try{
//            Thread.sleep(10000);
//        }catch(Exception e){
//            
//        }
//        mediaplayer.stop();
//        System.exit(0);

        System.out.println("My Music Playlist");
        CircularLinkedList<Music> music = new CircularLinkedList<>();
        music.addCircularNode(new Music("Love","love.mp3"));
        music.addCircularNode(new Music("Rock","rocks.mp3"));
        music.addCircularNode(new Music("Jazz","jazz.mp3"));
        music.addCircularNode(new Music("Punk","punk.mp3"));
        //System.out.println(music.getCircularItem(1));
        
        Iterator<Music> iterateMusic = music.circularLinkedListIterator();
        int input;
        int index=0;
        
        while(true){
            music.showCircularList();
            System.out.println("1 Play Music | 2 Forward | 3 Back | 4 Stop | -1 Exit : ");
            input = s.nextInt();
            s.nextLine();
            if(input ==1){
                System.out.println("Play Music : "+music.getCircularItem(index));
                musicplay(iterateMusic.next().getFile());
            }
            else if(input == 2){
                if(index == 3)
                    index=0;
                else
                    index++;
                if(mediaplayer != null)
                    mediaplayer.stop();
                System.out.println("Forward One Position - Play Music : "+music.getCircularItem(index));
                musicplay(iterateMusic.next().getFile());
            }
            else if(input ==3){
                if(index==3)
                    index=0;
                else
                    index--;
                if(mediaplayer != null)
                    mediaplayer.stop();
                System.out.println("Backward One Position - Play Music : "+music.getCircularItem(index));
                musicplay(music.getCircularItem(index).getFile());
            }
            else if(input == 4){
                mediaplayer.stop();
            }
            else if(input == -1){
                System.out.println("Exit music player");
                System.exit(0);
                break;
            }
        }
        
        
    }
        
    public static void musicplay(String song){
        panel = new JFXPanel();
        hit = new Media(Paths.get(song).toUri().toString());
        mediaplayer = new MediaPlayer(hit);
        mediaplayer.play();
    }
    public void stopmusic(){
        mediaplayer.stop();
    }
    
}
