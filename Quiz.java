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
            
        
            while (true) //enter name until no no. or special char used
            {   
                arr[i].name = sc.next();
                if (arr[i].name.matches("[a-zA-Z]+")) {
                    break;
                } else {
                    System.out.println("Invalid name. Please enter a name with alphabets only.");
                }
            }
        }

            System.out.print("first player guess a no. 1 or 2: ");   //to find who will go first
            arr[0].guess=sc.nextInt();
        
            while(arr[0].guess>2 || arr[0].guess<1)
                {
                    System.out.print("Enter a valid number,try again:Enter 1 or 2: ");
                    arr[0].guess=sc.nextInt();
                }
                if(arr[0].guess==1)
                {
                    arr[1].guess=2;
                }
                else
                {
                    arr[1].guess=1;
                }
        // Generate a random number between 1 and 2
        random1 = (int) (Math.random() * 2) + 1;
        System.out.println("-----------------> Random number generated: " + random1);
        p1 = arr[0].guess;
        p2 = arr[1].guess;
                
        if(random1==arr[0].guess)
        {
            System.out.println("-------------->  "+arr[0].name+" will go first");
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
        int player1_option = 3;
        int player2_option = 3;
        String needOption;

        for(int i = 0;i<2;i++)
        {
            if(p1==random1)
            {
                    p1= random1+1;
                    p2=random1;
                while (count1 <5)//to ask 5 quations to player1
                {
                    // Generate a random number between 1 to 20
                    random2 = (int) (Math.random() * 20) + 1;
                    System.out.println("---------->"+arr[0].name+"'s "+(count1+1)+" question is: ");
                    switch(random2)
                    {
                        case 1:
                            System.out.println("Who is known as the Father of the Nation in India?");
                            System.out.println();
                            
                            while (player1_option>0) //to give options if asked
                            {   
                                System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                                needOption = sc.nextLine().toLowerCase();
                                if (needOption.equals("yes")) 
                                {
                                    if(player1_option>0)
                                    {
                                        player1_option--;
                                        System.out.println("1. Jawaharlal Nehru 2. Mahatma Gandhi 3. Subhas Chandra Bose 4. Sardar Patel 5. Bhagat Singh 6. Rajendra Prasad");
                                    }
                                    needOption = "false";
                                    break;
                                } 
                                else if (needOption.equals("no")) 
                                {
                                    break;
                                } 
                                else 
                                {
                                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                            }
                            System.out.println("Enter Answer : ");
                            ans1 = sc.nextLine().toLowerCase();
                            

                            if(ans1.equalsIgnoreCase("mahatma gandhi"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else if(ans1.equalsIgnoreCase("gandhi"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Mahatma Gandhi");
                                point1--;
                            }
                           break;
                        case 2:
                           System.out.println("What is the national animal of India?");
                           while (player1_option>0)//to give options if asked
                            {   
                                System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                                needOption = sc.nextLine().toLowerCase();
                                if (needOption.equals("yes")) 
                                {
                                    if(player1_option>0)
                                    {
                                        player1_option--;
                                        System.out.println("1. Lion 2. Elephant 3. Tiger 4. Leopard 5.Rhinoceros 6.Penguin");
                                    }
                                    needOption = "false";
                                    break;
                                } 
                                else if (needOption.equals("no")) 
                                {
                                    break;
                                }
                                else 
                                {
                                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                            }
                            System.out.println("Enter Answer : ");
                            ans2 = sc.nextLine().toLowerCase();

                            if(ans2.equalsIgnoreCase("tiger"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Tiger");
                                point1--;
                            }
                           break;
                        case 3:
                           System.out.println("What is the national bird of India?");
                           while (player1_option>0)//to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Eagle  2. Parrot  3. Peacock  4. Sparrow  5. Crow  6. Dove");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans3 = sc.nextLine().toLowerCase();

                            if(ans3.equalsIgnoreCase("peacock"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Peacock");
                                point1--;
                            }
                           break;
                        case 4:
                           System.out.println("What is the national flower of India?");
                           while (player1_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Rose  2. Jasmine  3. Lotus  4. Sunflower  5. Orchid  6. Tulip");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans4 = sc.nextLine().toLowerCase();

                            if(ans4.equalsIgnoreCase("lotus"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Lotus");
                                point1--;
                            }
                           break;
                        case 5:
                           System.out.println("What is the national fruit of India?");
                           while (player1_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Apple  2. Mango  3. Banana  4. Papaya  5. Pomegranate  6. Orange");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans5 = sc.nextLine().toLowerCase();

                            if(ans5.equalsIgnoreCase("mango"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Mango");
                                point1--;
                            }
                           break;
                        case 6:
                           System.out.println("Who wrote the Indian national anthem?");
                           while (player1_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Swami Vivekananda  2. Rabindranath Tagore  3. Subhas Chandra Bose  4. Lata Mangeshkar  5. C. Rajagopalachari  6. Bankim Chandra Chattopadhyay");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans6 = sc.nextLine().toLowerCase();

                            if(ans6.equalsIgnoreCase("rabindranath tagore"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Rabindranath Tegore");
                                point1--;
                            }
                           break;
                        case 7:
                           System.out.println("Which is the longest river in India?");
                           while (player1_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Yamuna  2. Ganga  3. Brahmaputra  4. Godavari  5. Narmada  6. Krishna");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans7 = sc.nextLine().toLowerCase();

                            if(ans7.equalsIgnoreCase("ganga"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Ganga");
                                point1--;
                            }
                           break;
                        case 8:
                           System.out.println("Which Indian city is known as the Pink City?");
                           while (player1_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Jaipur  2. Delhi  3. Chandigarh  4. Mumbai  5. Bhopal  6. Lucknow");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans8 = sc.nextLine().toLowerCase();

                            if(ans8.equalsIgnoreCase("jaipur"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is jaipur");
                                point1--;
                            }
                           break;
                        case 9:
                           System.out.println("Which Indian city is known as the Silicon Valley of India?");
                           while (player1_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Pune  2. Bengaluru  3. Hyderabad  4. Noida  5. Chennai  6. Gurgaon");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans9 = sc.nextLine().toLowerCase();

                            if(ans9.equalsIgnoreCase("bangalore"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else if(ans9.equalsIgnoreCase("bengaluru"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Banglore");
                                point1--;
                            }
                           break;
                        case 10:
                           System.out.println("Which Indian state is known as the Land of Five Rivers?");
                           while (player1_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Haryana  2. Punjab  3. Uttar Pradesh  4. Rajasthan  5. Maharashtra  6. Gujarat");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans10 = sc.nextLine().toLowerCase();

                            if(ans10.equalsIgnoreCase("punjab"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Panjab");
                                point1--;
                            }
                           break;
                        case 11:
                           System.out.println("In which year was the Battle of Plassey fought?");
                           while (player1_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. 1748  2. 1757  3. 1761  4. 1776  5. 1780  6. 1792");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               }
                                else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans11 = sc.nextLine().toLowerCase();

                            if(ans11.equalsIgnoreCase("1757"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is 1757");
                                point1--;
                            }
                           break;
                        case 12:
                                System.out.println("Who was the first Indian to win a Nobel Prize?");
                                while (player1_option>0) //to give options if asked
                                {   
                                    System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                                    needOption = sc.nextLine().toLowerCase();
                                    if (needOption.equals("yes")) 
                                    {
                                        if(player1_option>0)
                                        {
                                            player1_option--;
                                            System.out.println("1. C. V. Raman  2. Mother Teresa  3. Rabindranath Tagore  4. Subrahmanyan Chandrasekhar  5. Har Gobind Khorana  6. Venkatraman Ramakrishnan");
                                        }
                                        needOption = "false";
                                        break;
                                    } 
                                    else if (needOption.equals("no")) 
                                    {
                                        break;
                                    } 
                                    else 
                                    {
                                        System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                    }
                                }
                                System.out.println("Enter Answer : ");
                                    ans12 = sc.nextLine().toLowerCase();

                            if(ans12.equalsIgnoreCase("rabindranath tagore"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else if(ans12.equalsIgnoreCase("rabindranath"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Rabindranath Tegore");
                                point1--;
                            }
                           break;
                        case 13:
                            System.out.println("Which Indian mathematician is known for his contributions to number theory and continued fractions?");
                            while (player1_option>0) //to give options if asked
                            {   
                                System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                                needOption = sc.nextLine().toLowerCase();
                                if (needOption.equals("yes")) 
                                {
                                    if(player1_option>0)
                                    {
                                        player1_option--;
                                        System.out.println("1. Aryabhata  2. Brahmagupta  3. Srinivasa Ramanujan  4. Bhaskara I  5. Ramanujan's mentor  6. Madhava of Sangamagrama");
                                    }
                                    needOption = "false";
                                    break;
                                } 
                                else if (needOption.equals("no")) 
                                {
                                    break;
                                } 
                                else 
                                {
                                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                            }
                            System.out.println("Enter Answer : ");
                            ans13 = sc.nextLine().toLowerCase();

                            if(ans13.equalsIgnoreCase("srinivasa ramanujan"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else if(ans13.equalsIgnoreCase("ramanujan"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Srinivasa Ramanujan");
                                point1--;
                            }
                            break;
                        case 14:
                            System.out.println("Which Indian state has the highest literacy rate?");
                            while (player1_option>0) //to give options if asked
                            {   
                                System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                                needOption = sc.nextLine().toLowerCase();
                                if (needOption.equals("yes")) 
                                {
                                    if(player1_option>0)
                                    {
                                        player1_option--;
                                        System.out.println("1. Punjab  2. Kerala  3. Tamil Nadu  4. Maharashtra  5. Haryana  6. Karnataka");
                                    }
                                    needOption = "false";
                                    break;
                                } 
                                else if (needOption.equals("no")) 
                                {
                                    break;
                                } 
                                else 
                                {
                                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                            }
                            System.out.println("Enter Answer : ");
                            ans14 = sc.nextLine().toLowerCase();

                            if(ans14.equalsIgnoreCase("kerala"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Kerala");
                                point1--;
                            }
                            break;
                        case 15:
                            System.out.println("Who was the founder of the Maurya Empire?");
                            while (player1_option>0) //to give options if asked
                            {   
                                System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                                needOption = sc.nextLine().toLowerCase();
                                if (needOption.equals("yes")) 
                                {
                                    if(player1_option>0)
                                    {
                                        player1_option--;
                                        System.out.println("1. Chandragupta Maurya 2. Ashoka the Great 3. Bindusara 4. Maurya Dharma 5. Chandragupta I 6. Shishunaga");
                                    }
                                    needOption = "false";
                                    break;
                                } 
                                else if (needOption.equals("no")) 
                                {
                                    break;
                                } 
                                else 
                                {
                                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                            }
                            System.out.println("Enter Answer : ");
                            ans15 = sc.nextLine().toLowerCase();

                            if(ans15.equalsIgnoreCase("chandragupta maurya"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Chandragupta Maurya");
                                point1--;
                            }
                            break;
                        case 16:
                           System.out.println("Which Indian state is known for its tea gardens?");
                           while (player1_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Assam  2. Kerala  3. West Bengal  4. Tamil Nadu  5. Uttar Pradesh  6. Bihar");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else
                                {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                           }
                           System.out.println("Enter Answer : ");
                            ans16 = sc.nextLine().toLowerCase();

                            if(ans16.equalsIgnoreCase("assam"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Assam");
                                point1--;
                            }
                           break;
                        case 17:
                           System.out.println("Which Indian state is known as the Spice Garden of India?");
                           while (player1_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Kerala  2. Tamil Nadu  3. Karnataka  4. Assam  5. Andhra Pradesh  6. West Bengal");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans17 = sc.next().toLowerCase();
                            if(ans17.equalsIgnoreCase("kerala"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Kerala");
                                point1--;
                            }
                           break;
                        case 18:
                           System.out.println("Which Indian state is known as the Land of Rising Sun?");
                           while (player1_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Arunachal Pradesh  2. Assam  3. Nagaland  4. Manipur  5. Mizoram  6. Meghalaya");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans18 = sc.nextLine().toLowerCase();

                            if(ans18.equalsIgnoreCase("arunachal pradesh"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Arunachal Pradesh");
                                point1--;
                            }
                           break;
                        case 19:
                           System.out.println("Which Indian state is known for its backwaters?");
                           while (player1_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Kerala  2. Goa  3. Tamil Nadu  4. Karnataka  5. Andhra Pradesh  6. West Bengal");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans19 = sc.nextLine().toLowerCase();

                            if(ans19.equalsIgnoreCase("kerala"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Kerala");
                                point1--;
                            }
                           break;
                        case 20:
                            System.out.println("Who was the first President of India?");
                            while (player1_option>0) //to give options if asked
                            {   
                               System.out.println("Do you need options? You can ask for options "+player1_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player1_option>0)
                                   {
                                       player1_option--;
                                       System.out.println("1. Dr. Rajendra Prasad  2. Jawaharlal Nehru  3. S. Radhakrishnan  4. Zakir Husain  5. V. V. Giri  6. Lal Bahadur Shastri");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                            }
                            System.out.println("Enter Answer : ");
                            ans20 = sc.nextLine().toLowerCase();

                            if(ans20.equalsIgnoreCase("dr.rajendra prasad"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else if(ans20.equalsIgnoreCase("rajendra prasad"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Dr. Rajendra Prasad");
                                point1--;
                            }
                           break;
                    }
                    count1++;
                }
            }
            else 
            {
                p2= random1+1;
                p1=random1;
                while (count2 <5) //to ask 5 quations to player2
                {
                    // Generate a random number between 1 to 20
                    random2 = (int) (Math.random() * 20) + 1;
                    System.out.println(arr[1].name+"'s "+(count2+1)+" question is: ");
                    switch(random2)
                        {
                            case 1:
                            System.out.println("Who is known as the Father of the Nation in India?");
                            System.out.println();
                            
                            while (player2_option>0) //to give options if asked
                            {   
                                System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                                needOption = sc.nextLine().toLowerCase();
                                if (needOption.equals("yes")) 
                                {
                                    if(player2_option>0)
                                    {
                                        player2_option--;
                                        System.out.println("1. Jawaharlal Nehru 2. Mahatma Gandhi 3. Subhas Chandra Bose 4. Sardar Patel 5. Bhagat Singh 6. Rajendra Prasad");
                                    }
                                    needOption = "false";
                                    break;
                                } 
                                else if (needOption.equals("no")) 
                                {
                                    break;
                                } 
                                else 
                                {
                                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                            }
                            System.out.println("Enter Answer : ");
                            ans1 = sc.nextLine();

                            if(ans1.equalsIgnoreCase("mahatma gandhi"))
                            {
                                System.out.println("Correct answer");
                                point2++;


                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Mahatma Gandhi");
                                point2--;
                            }
                           break;
                        case 2:
                           System.out.println("What is the national animal of India?");
                           while (player2_option>0) //to give options if asked
                            {   
                                System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                                needOption = sc.nextLine().toLowerCase();
                                if (needOption.equals("yes")) 
                                {
                                    if(player2_option>0)
                                    {
                                        player1_option--;
                                        System.out.println("1. Lion 2. Elephant 3. Tiger 4. Leopard 5.Rhinoceros 6.Penguin");
                                    }
                                    needOption = "false";
                                    break;
                                } 
                                else if (needOption.equals("no")) 
                                {
                                    break;
                                }
                                else 
                                {
                                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                            }
                            System.out.println("Enter Answer : ");
                            ans2 = sc.nextLine();

                            if(ans2.equalsIgnoreCase("tiger"))
                            {
                                System.out.println("Correct answer");
                                point2++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Tiger");
                                point2--;
                            }
                           break;
                        case 3:
                           System.out.println("What is the national bird of India?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Eagle  2. Parrot  3. Peacock  4. Sparrow  5. Crow  6. Dove");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans3 = sc.nextLine();

                            if(ans3.equalsIgnoreCase("peacock"))
                            {
                                System.out.println("Correct answer");
                                point2++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Peacock");
                                point2--;
                            }
                           break;
                        case 4:
                           System.out.println("What is the national flower of India?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Rose  2. Jasmine  3. Lotus  4. Sunflower  5. Orchid  6. Tulip");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans4 = sc.nextLine();

                            if(ans4.equalsIgnoreCase("lotus"))
                            {
                                System.out.println("Correct answer");
                                point2++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Lotus");
                                point2--;
                            }
                           break;
                        case 5:
                           System.out.println("What is the national fruit of India?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Apple  2. Mango  3. Banana  4. Papaya  5. Pomegranate  6. Orange");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans5 = sc.nextLine();

                            if(ans5.equalsIgnoreCase("mango"))
                            {
                                System.out.println("Correct answer");
                                point2++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Mango");
                                point2--;
                            }
                           break;
                        case 6:
                           System.out.println("Who wrote the Indian national anthem?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Swami Vivekananda  2. Rabindranath Tagore  3. Subhas Chandra Bose  4. Lata Mangeshkar  5. C. Rajagopalachari  6. Bankim Chandra Chattopadhyay");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans6 = sc.nextLine();

                            if(ans6.equalsIgnoreCase("rabindranath tagore"))
                            {
                                System.out.println("Correct answer");
                                point2++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Rabindranath Tegore");
                                point2--;
                            }
                           break;
                        case 7:
                           System.out.println("Which is the longest river in India?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Yamuna  2. Ganga  3. Brahmaputra  4. Godavari  5. Narmada  6. Krishna");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans7 = sc.nextLine();

                            if(ans7.equalsIgnoreCase("ganga"))
                            {
                                System.out.println("Correct answer");
                                point2++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Ganga");
                                point2--;
                            }
                           break;
                        case 8:
                           System.out.println("Which Indian city is known as the Pink City?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Jaipur  2. Delhi  3. Chandigarh  4. Mumbai  5. Bhopal  6. Lucknow");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans8 = sc.nextLine();

                            if(ans8.equalsIgnoreCase("jaipur"))
                            {
                                System.out.println("Correct answer");
                                point2++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is jaipur");
                                point2--;
                            }
                           break;
                        case 9:
                           System.out.println("Which Indian city is known as the Silicon Valley of India?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Pune  2. Bengaluru  3. Hyderabad  4. Noida  5. Chennai  6. Gurgaon");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans9 = sc.nextLine().toLowerCase();

                            if(ans9.equalsIgnoreCase("bangalore"))
                            {
                                System.out.println("Correct answer");
                                point2++;

                            }
                            else if(ans9.equalsIgnoreCase("bengaluru"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Banglore");
                                point2--;
                            }
                           break;
                        case 10:
                           System.out.println("Which Indian state is known as the Land of Five Rivers?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Haryana  2. Punjab  3. Uttar Pradesh  4. Rajasthan  5. Maharashtra  6. Gujarat");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans10 = sc.nextLine().toLowerCase();

                            if(ans10.equalsIgnoreCase("punjab"))
                            {
                                System.out.println("Correct answer");
                                point2++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Panjab");
                                point2--;
                            }
                           break;
                        case 11:
                           System.out.println("In which year was the Battle of Plassey fought?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. 1748  2. 1757  3. 1761  4. 1776  5. 1780  6. 1792");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               }
                                else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans11 = sc.nextLine().toLowerCase();

                            if(ans11.equalsIgnoreCase("1757"))
                            {
                                System.out.println("Correct answer");
                                point2++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is 1757");
                                point2--;
                            }
                           break;
                        case 12:
                                System.out.println("Who was the first Indian to win a Nobel Prize?");
                                while (player2_option>0) //to give options if asked
                                {   
                                    System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                                    needOption = sc.nextLine().toLowerCase();
                                    if (needOption.equals("yes")) 
                                    {
                                        if(player2_option>0)
                                        {
                                            player2_option--;
                                            System.out.println("1. C. V. Raman  2. Mother Teresa  3. Rabindranath Tagore  4. Subrahmanyan Chandrasekhar  5. Har Gobind Khorana  6. Venkatraman Ramakrishnan");
                                        }
                                        needOption = "false";
                                        break;
                                    } 
                                    else if (needOption.equals("no")) 
                                    {
                                        break;
                                    } 
                                    else 
                                    {
                                        System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                    }
                                }
                                System.out.println("Enter Answer : ");
                                    ans12 = sc.nextLine();

                            if(ans12.equalsIgnoreCase("rabindranath tagore"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else if(ans12.equalsIgnoreCase("rabindranath"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Rabindranath Tegore");
                                point1--;
                            }
                           break;
                        case 13:
                            System.out.println("Which Indian mathematician is known for his contributions to number theory and continued fractions?");
                            while (player2_option>0) //to give options if asked
                            {   
                                System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                                needOption = sc.nextLine().toLowerCase();
                                if (needOption.equals("yes")) 
                                {
                                    if(player2_option>0)
                                    {
                                        player2_option--;
                                        System.out.println("1. Aryabhata  2. Brahmagupta  3. Srinivasa Ramanujan  4. Bhaskara I  5. Ramanujan's mentor  6. Madhava of Sangamagrama");
                                    }
                                    needOption = "false";
                                    break;
                                } 
                                else if (needOption.equals("no")) 
                                {
                                    break;
                                } 
                                else 
                                {
                                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                            }
                            System.out.println("Enter Answer : ");
                            ans13 = sc.nextLine();

                            if(ans13.equalsIgnoreCase("srinivasa ramanujan"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else if(ans13.equalsIgnoreCase("ramanujan"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Srinivasa Ramanujan");
                                point1--;
                            }
                            break;
                        case 14:
                            System.out.println("Which Indian state has the highest literacy rate?");
                            while (player2_option>0) //to give options if asked
                            {   
                                System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                                needOption = sc.nextLine().toLowerCase();
                                if (needOption.equals("yes")) 
                                {
                                    if(player2_option>0)
                                    {
                                        player2_option--;
                                        System.out.println("1. Punjab  2. Kerala  3. Tamil Nadu  4. Maharashtra  5. Haryana  6. Karnataka");
                                    }
                                    needOption = "false";
                                    break;
                                } 
                                else if (needOption.equals("no")) 
                                {
                                    break;
                                } 
                                else 
                                {
                                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                            }
                            System.out.println("Enter Answer : ");
                            ans14 = sc.nextLine();

                            if(ans14.equalsIgnoreCase("kerala"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Kerala");
                                point1--;
                            }
                            break;
                        case 15:
                            System.out.println("Who was the founder of the Maurya Empire?");
                            while (player2_option>0) //to give options if asked
                            {   
                                System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                                needOption = sc.nextLine().toLowerCase();
                                if (needOption.equals("yes")) 
                                {
                                    if(player2_option>0)
                                    {
                                        player2_option--;
                                        System.out.println("1. Chandragupta Maurya 2. Ashoka the Great 3. Bindusara 4. Maurya Dharma 5. Chandragupta I 6. Shishunaga");
                                    }
                                    needOption = "false";
                                    break;
                                } 
                                else if (needOption.equals("no")) 
                                {
                                    break;
                                } 
                                else 
                                {
                                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                            }
                            System.out.println("Enter Answer : ");
                            ans15 = sc.nextLine();

                            if(ans15.equalsIgnoreCase("chandragupta maurya"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Chandragupta Maurya");
                                point1--;
                            }
                            break;
                        case 16:
                           System.out.println("Which Indian state is known for its tea gardens?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Assam  2. Kerala  3. West Bengal  4. Tamil Nadu  5. Uttar Pradesh  6. Bihar");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else
                                {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                           }
                           System.out.println("Enter Answer : ");
                            ans16 = sc.nextLine();

                            if(ans16.equalsIgnoreCase("assam"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Assam");
                                point1--;
                            }
                           break;
                        case 17:
                           System.out.println("Which Indian state is known as the Spice Garden of India?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Kerala  2. Tamil Nadu  3. Karnataka  4. Assam  5. Andhra Pradesh  6. West Bengal");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans17 = sc.next();
                            if(ans17.equalsIgnoreCase("kerala"))
                            {
                                System.out.println("Correct answer");
                                point1++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Kerala");
                                point1--;
                            }
                           break;
                        case 18:
                           System.out.println("Which Indian state is known as the Land of Rising Sun?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Arunachal Pradesh  2. Assam  3. Nagaland  4. Manipur  5. Mizoram  6. Meghalaya");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans18 = sc.nextLine();

                            if(ans18.equalsIgnoreCase("arunachal pradesh"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Arunachal Pradesh");
                                point1--;
                            }
                           break;
                        case 19:
                           System.out.println("Which Indian state is known for its backwaters?");
                           while (player2_option>0) //to give options if asked
                           {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Kerala  2. Goa  3. Tamil Nadu  4. Karnataka  5. Andhra Pradesh  6. West Bengal");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                           }
                           System.out.println("Enter Answer : ");
                            ans19 = sc.nextLine();

                            if(ans19.equalsIgnoreCase("kerala"))
                            {
                                System.out.println("Correct answer");
                                point1++;

                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Kerala");
                                point1--;
                            }
                           break;
                        case 20:
                            System.out.println("Who was the first President of India?");
                            while (player2_option>0) //to give options if asked
                            {   
                               System.out.println("Do you need options? You can ask for options "+player2_option+" time.(yes or no)");
                               needOption = sc.nextLine().toLowerCase();
                               if (needOption.equals("yes")) 
                               {
                                   if(player2_option>0)
                                   {
                                       player2_option--;
                                       System.out.println("1. Dr. Rajendra Prasad  2. Jawaharlal Nehru  3. S. Radhakrishnan  4. Zakir Husain  5. V. V. Giri  6. Lal Bahadur Shastri");
                                   }
                                   needOption = "false";
                                   break;
                               } 
                               else if (needOption.equals("no")) 
                               {
                                   break;
                               } 
                               else 
                               {
                                   System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                               }
                            }
                            System.out.println("Enter Answer : ");
                            ans20 = sc.nextLine();

                            if(ans20.equalsIgnoreCase("dr.rajendra prasad"))
                            {
                                System.out.println("Correct answer");
                                point2++;

                            }
                            else if(ans20.equalsIgnoreCase("rajendra prasad"))
                            {
                                System.out.println("Correct answer");
                                point2++;
                            }
                            else
                            {
                                System.out.println("Wrong answer");
                                System.out.println("Right answer is Dr. Rajendra Prasad");
                                point2--;
                            }
                           break;
                        }
                    count2++;
                }
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
        else if(point1==point2)
        {
            System.out.println(arr[0].name+"'s points are "+point1);
            System.out.println(arr[1].name+"'s points are "+point2);
            System.out.println();
            System.out.println("The game is draw");
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
    
