import java.util.*;
class Quiz{

    
    public static void main(String args[])
    {
        details ob = new details();
        ob.getDetails();
        ob.Quation();
        ob.winer();
    }
}
class details
{
    String name;    // to store the name of the player
    int id;     // to store the player id
    details[] arr;
    int guess;         //to find who will go first
    int random1;     //to store the random number
    int p1=0,p2=0;  //to find who will go first
    int point1=0,point2=0;  //to store the points of the players
    void getDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("                Welcome to the quiz game");
        System.out.println();
        System.out.println("               There will be two players");
        System.err.println();
        arr = new details[2];
        System.out.println("   Enter the details of the players");
        for(int i=0;i<2;i++)
        {
            arr[i]=new details();
            System.out.print("Enter the name of the player "+(i+1)+": ");
            arr[i].name=sc.next();
            System.out.print("Enter the user id: ");
            arr[i].id=sc.nextInt();
            System.out.print("guess a no. 1 or 2: ");
            arr[i].guess=sc.nextInt();
        
            while(arr[i].guess>2 || arr[i].guess<1)
                {
                    System.out.print("Enter a valid number,try again:Enter 1 or 2: ");
                    arr[i].guess=sc.nextInt();
                }
        }

        // Generate a random number between 1 and 2
        random1 = (int) (Math.random() * 2) + 1;
        System.out.println("-----------------> Random number generated: " + random1);
        p1 = arr[0].guess;
        p2 = arr[1].guess;
                
        if(random1==arr[0].guess)
        {
            System.out.println("-------------->"+arr[0].name+" will go first");
        }
        if(random1==arr[1].guess)
        {
            System.out.println("-------------->  "+arr[1].name+" will go first");
        }
    }
    void Quation()
    {
        int count1=0,count2=0;
        int random2=0;
        String ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10,ans11,ans12,ans13,ans14,ans15,ans16,ans17,ans18,ans19,ans20;
        Scanner sc=new Scanner(System.in); 
        for(int i = 0;i<2;i++)
        {
            if(p1==random1)
            {
                p2=random1;
                while (count1 <5)
                {
                p1++;
                
                    // Generate a random number between 1 to 20
                    random2 = (int) (Math.random() * 20) + 1;
                    System.out.println("---------->"+arr[0].name+"'s "+(count1+1)+" question is: ");
                    switch(random2)
                    {
                        case 1:
                            System.out.println("Who is known as the Father of the Nation in India?");
                            ans1 = sc.next();
                            if(ans1.equals("mahatma gandhi"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 2:
                           System.out.println("What is the national animal of India?");
                            ans2 = sc.next();
                            if(ans2.equals("tiger"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 3:
                           System.out.println("What is the national bird of India?");
                            ans3 = sc.next();
                            if(ans3.equals("peacock"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 4:
                           System.out.println("What is the national flower of India?");
                            ans4 = sc.next();
                            if(ans4.equals("lotus"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 5:
                           System.out.println("What is the national fruit of India?");
                            ans5 = sc.next();
                            if(ans5.equals("mango"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 6:
                           System.out.println("Who wrote the Indian national anthem?");
                            ans6 = sc.next();
                            if(ans6.equals("rabindranath tagore"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 7:
                           System.out.println("Which is the longest river in India?");
                            ans7 = sc.next();
                            if(ans7.equals("ganga"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 8:
                           System.out.println("Which Indian city is known as the Pink City?");
                            ans8 = sc.next();
                            if(ans8.equals("jaipur"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 9:
                           System.out.println("Which Indian city is known as the Silicon Valley of India?");
                            ans9 = sc.next();
                            if(ans9.equals("bangalore"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 10:
                           System.out.println("Which Indian state is known as the Land of Five Rivers?");
                            ans10 = sc.next();
                            if(ans10.equals("punjab"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 11:
                           System.out.println("In which year was the Battle of Plassey fought?");
                            ans11 = sc.next();
                            if(ans11.equals("1757"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 12:
                                  System.out.println("Who was the first Indian to win a Nobel Prize?");
                            ans12 = sc.next();
                            if(ans12.equals("rabindranath tagore"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 13:
                            System.out.println("Which Indian mathematician is known for his contributions to number theory and continued fractions?");
                            ans13 = sc.next();
                            if(ans13.equals("srinivasa ramanujan"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                            break;
                        case 14:
                            System.out.println("Which Indian state has the highest literacy rate?");
                            ans14 = sc.next();
                            if(ans14.equals("kerala"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                            break;
                        case 15:
                            System.out.println("Who was the founder of the Maurya Empire?");
                            ans15 = sc.next();
                            if(ans15.equals("chandragupta maurya"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                            break;
                        case 16:
                           System.out.println("Which Indian state is known for its tea gardens?");
                            ans16 = sc.next();
                            if(ans16.equals("assam"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 17:
                           System.out.println("Which Indian state is known as the Spice Garden of India?");
                            ans17 = sc.next();
                            if(ans17.equals("kerala"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 18:
                           System.out.println("Which Indian state is known as the Land of Rising Sun?");
                            ans18 = sc.next();
                            if(ans18.equals("arunachal pradesh"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 19:
                           System.out.println("Which Indian state is known for its backwaters?");
                            ans19 = sc.next();
                            if(ans19.equals("kerala"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                        case 20:
                           System.out.println("Who was the first President of India?");
                            ans20 = sc.next();
                            if(ans20.equals("dr. rajendra prasad"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point1--;
                            }
                           break;
                    }
                    count1++;
                }
                System.out.println("Points of "+arr[0].name+" is "+point1);
            }
            if(p2==random1) 
            {
                while (count2 <5)
                {
                    // Generate a random number between 1 to 20
                    random2 = (int) (Math.random() * 20) + 1;
                    System.out.println(arr[1].name+"'s "+(count2+1)+" question is: ");
                    switch(random2)
                        {
                    case 1:
                            System.out.println("Who is known as the Father of the Nation in India?");
                            ans1 = sc.next();
                            if(ans1.equals("mahatma gandhi"))
                            {
                                System.out.println("Correct answer");
                                point2++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 2:
                           System.out.println("What is the national animal of India?");
                            ans2 = sc.next();
                            if(ans2.equals("tiger"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 3:
                           System.out.println("What is the national bird of India?");
                            ans3 = sc.next();
                            if(ans3.equals("peacock"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 4:
                           System.out.println("What is the national flower of India?");
                            ans4 = sc.next();
                            if(ans4.equals("lotus"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 5:
                           System.out.println("What is the national fruit of India?");
                            ans5 = sc.next();
                            if(ans5.equals("mango"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 6:
                           System.out.println("Who wrote the Indian national anthem?");
                            ans6 = sc.next();
                            if(ans6.equals("rabindranath tagore"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 7:
                           System.out.println("Which is the longest river in India?");
                            ans7 = sc.next();
                            if(ans7.equals("ganga"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 8:
                           System.out.println("Which Indian city is known as the Pink City?");
                            ans8 = sc.next();
                            if(ans8.equals("jaipur"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 9:
                           System.out.println("Which Indian city is known as the Silicon Valley of India?");
                            ans9 = sc.next();
                            if(ans9.equals("bangalore"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 10:
                           System.out.println("Which Indian state is known as the Land of Five Rivers?");
                            ans10 = sc.next();
                            if(ans10.equals("punjab"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 11:
                           System.out.println("In which year was the Battle of Plassey fought?");
                            ans11 = sc.next();
                            if(ans11.equals("1757"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 12:
                                  System.out.println("Who was the first Indian to win a Nobel Prize?");
                            ans12 = sc.next();
                            if(ans12.equals("rabindranath tagore"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 13:
                            System.out.println("Which Indian mathematician is known for his contributions to number theory and continued fractions?");
                            ans13 = sc.next();
                            if(ans13.equals("srinivasa ramanujan"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                            break;
                        case 14:
                            System.out.println("Which Indian state has the highest literacy rate?");
                            ans14 = sc.next();
                            if(ans14.equals("kerala"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                            break;
                        case 15:
                            System.out.println("Who was the founder of the Maurya Empire?");
                            ans15 = sc.next();
                            if(ans15.equals("chandragupta maurya"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                            break;
                        case 16:
                           System.out.println("Which Indian state is known for its tea gardens?");
                            ans16 = sc.next();
                            if(ans16.equals("assam"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 17:
                           System.out.println("Which Indian state is known as the Spice Garden of India?");
                            ans17 = sc.next();
                            if(ans17.equals("kerala"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 18:
                           System.out.println("Which Indian state is known as the Land of Rising Sun?");
                            ans18 = sc.next();
                            if(ans18.equals("arunachal pradesh"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 19:
                           System.out.println("Which Indian state is known for its backwaters?");
                            ans19 = sc.next();
                            if(ans19.equals("kerala"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        case 20:
                           System.out.println("Who was the first President of India?");
                            ans20 = sc.next();
                            if(ans20.equals("dr. rajendra prasad"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                point2--;
                            }
                           break;
                        }
                    count2++;
                }
                System.out.println("Points of "+arr[1].name+" is "+point2);
            }
        }
    }
    
    int winer()
    {
        if(point1>point2)
        {
            System.out.println(arr[0].name+"'s points are "+point1);
            System.out.println(arr[1].name+"'s points are "+point2);
            System.out.println();
            System.out.println(arr[0].name+" is the winner");
        }
        else
        {
            System.out.println(arr[0].name+"'s points are "+point1);
            System.out.println(arr[1].name+"'s points are "+point2);
            System.out.println();
            System.out.println(arr[1].name+" is the winner");
        }
        return 0;
    }
}
    
