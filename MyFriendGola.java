import java.io.File;
import java.io.IOException;
import java.util.*;


import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
class MyFriendGola
{
public static void main(String []args) throws LineUnavailableException
{
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of friends: ");
        int No_Friends = sc.nextInt();
        Friends f[] = new Friends[No_Friends];
        if(No_Friends<0)
        {
            System.out.println("Womp Womp");
            return;
        }
        else
        {
            for(int i=0;i<No_Friends;i++)
            {
                
                while(true)
                {
                    System.out.print("Enter 1 to enter details of friend: ,\n 2 to print data of friend: ,\n 3 to find a friend:(this feature after pasu comes) ,\n 4 to exit: ,\n");
                    int choice = sc.nextInt();
                    switch(choice)
                    {
                        
                        case 1:
                            for(int j=0;j<No_Friends;j++)
                            {
                                f[j] = new Friends();
                                System.out.println("Enter the details of friend "+(j+1));
                                f[j].getDetails();
                            }
                            break;
                        
                        case 2:
                            for(int j=0;j<No_Friends;j++)
                            {
                                System.out.println("Details of Friend "+(j+1));
                                f[j].printData();
                            }
                            break;
                       // case 3 :
                          // f[i].find();
                           ///break;
                       
                           case 4:
                           System.out.println("ok tata bye bye babai");
                           try {
                               File file = new File("C:\\JAVA\\sad-meow-song.wav");
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
                           return;

                        default:
                            System.out.println("ak kaaam sarku nai thy chutiya thi sacho no. nake ne tari ma ne");
                            break;
                    }
                
                }
            }
        }
    }
}

class Friends
{
    String Name;
    String ling;
    String task;

    
    void getDetails()
    {
        String male = "male";
        String female = "female";
        Scanner sc = new Scanner(System.in);
        System.out.println("Unke Pujya Pitaji our hot chick ne diya hua naam: ");
        Name = sc.next();
        System.out.println("Unka ling(male or female only no satranji or narangi): ");
        ling = sc.next();
        if(ling.equals(male))
        {
            System.out.println("Hat Lowde");
        }
        else if(ling.equals(female))
        {
            System.out.println("aia apka intazar tha");
        }
        else
        {
            System.out.println("e ka hovat ba chutiya");
        }
        System.out.print("ap is dunya me hamare kis kaam ke ho: ");
        task = sc.next();
        if(Name.equals("pasu"))
        {
            task = "bj(bhajan)                                                                                                                                  (blow job)";
        }
        if(Name.equals("bhumit"))
        {
            task = "gand marawa,babli gand";
        }
    }
    void printData()
    {
        System.out.println("Name: "+Name);
        System.out.println("Ling: "+ling);
        System.out.println("Task: "+task);
    }
   /*  void find ()
    {
        System.out.println("Enter the name of the friend you want to find: ");
        Scanner sc = new Scanner(System.in);
        String find = sc.next();
        if(find.equals(Name))
        {
            System.out.println("Naam: "+Name);
            System.out.println("Ling: "+ling);
            System.out.println("kaam: "+task);
        }
    }*/
}
