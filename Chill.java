import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Chill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu ob = new Menu();
        song ob1 = new song();
        System.out.println("Enter number of customer : ");
        int size = sc.nextInt();
        Menu data[] = new Menu[size];
        for(int i=0;i<data.length;i++){
            data[i] = new Menu();
        }
        int choice=0;
        do {
            System.out.println("1.MENU");
            System.out.println("2.SONG");
            System.out.println("3.SEX");
            System.out.println("4.EXIT");
            choice = sc.nextInt();
        } while (choice>3  ||  choice <1) ;  
        switch (choice) {
            case 1:
                ob.display();
                break;
        
            case 2:
                ob1.play();
                break;
        }    
        
    
        

    }
}
class Menu {
    void display() {
        System.out.println("1.WAFFERS");
        System.out.println("2.COLD-DRINK");
        System.out.println("3.PIZZA");
        System.out.println("4.ICE-CREAM");
        System.out.println("5.MANCHURIAN DRY");
        System.out.println("6.CHOLE BHATURE");
        System.out.println("7.MAGGI");
        System.out.println("8.NOODLES");
    }
}
class song {
    Scanner sc = new Scanner(System.in);
    int choiceSong;

    void play()
    {
        System.out.println(" Enter 1.Tum Tak - Raanjhanaa \n");
        choiceSong = sc.nextInt();

        switch (choiceSong) {
            case 1 :
            try {
                File file = new File("C:\\JAVA\\Songs for project\\Tum Tak - Raanjhanaa 320 Kbps.wav");
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
    
                // Keep the program running to allow the clip to play
                Thread.sleep(clip.getMicrosecondLength() / 1000);
            } catch (UnsupportedAudioFileException e) {
                System.out.println("Unsupported audio file: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("I/O error: " + e.getMessage());
            } catch (LineUnavailableException e) {
                System.out.println("Line unavailable: " + e.getMessage());
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
                break;
            default:
                throw new AssertionError();
        }
        
    }
}
