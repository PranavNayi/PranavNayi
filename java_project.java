import java.util.*;
    class java_project 
    {
    String name;
    int age;
    String Password;
    String mobileNumber;
    String Disabled;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Booking ob = new Booking();

        System.out.println("---------WELCOME TO BRTS BOOKING PORTAL---------");
        int option;
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. New Member(Sign up)");
            System.out.println("2. Existing Member(Login)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    ob.addMember();
                    break;
                case 2:
                    ob.ExistingMember();
                    break;
                case 3:
                    System.out.println("Thank you for using the BRTS Booking System!");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        } while (option != 3);

        sc.close();
    }
}

class Booking 
{
    Scanner sc = new Scanner(System.in);
    static final int MAX_MEMBERS = 100;
    Member members[] = new Member[MAX_MEMBERS];
    java_project ob = new java_project();
    int memberCount = 0;

    void addMember() 
    {
        if (memberCount >= MAX_MEMBERS) 
        {
            System.out.println("Member limit reached. Cannot add more members.");
            return;
        }
    
        while (true) //enter name until no no. or special char used
        {   
            System.out.println("Enter your name: ");
            
            ob.name = sc.next();
            if (ob.name.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("Invalid name. Please enter a name with alphabets only.");
            }
        }
        
        System.out.println("Enter your age: ");
        ob.age = sc.nextInt();
        while(ob.age>100 || ob.age<14)
        {
            System.out.println("Enter Valid age,Enter again between(14 to 100)");
            ob.age = sc.nextInt();
        }
        System.out.println("Enter your Password(with length exectly 8): ");
        ob.Password = sc.next();

        while(ob.Password.length() != 8)  //asks for password until it is of 8 length
        {
            System.out.println("Again!,Enter your Password(with length exectly 8): ");
            ob.Password = sc.next();
        }
        
            
            System.out.println("Enter your mobile number(with length exectly 10): ");
            ob.mobileNumber = sc.next();
        for (int i =0;i <ob.mobileNumber.length();i++) 
        {
            char w = ob.mobileNumber.charAt(i);
            if(w>'9' || w<'0')
            {
                System.out.println("Not Valid Mobile Number, Enter Digits Only");
                break;
            }
        }
        
        while(ob.mobileNumber.length()!=10)
        {
            System.out.println("Again!,Enter your mobile number(with length exectly 10): ");
            ob.mobileNumber = sc.next();
            
        }
        
        while (true) 
        {
            System.out.println("Are you physically disabled? (yes/no): ");
            ob.Disabled = sc.next().toLowerCase();
            if (ob.Disabled.equals("yes")) {
                ob.Disabled = "true";
                break;
            } else if (ob.Disabled.equals("no")) {
                ob.Disabled = "false";
                break;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }

        members[memberCount++] = new Member(ob.name, ob.age, ob.Password, ob.mobileNumber, ob.Disabled);
        System.out.println("Membership created successfully!");
    }

    void ExistingMember() {
        System.out.println("Enter your mobile number to log in: ");
        String mobileNumber = sc.next();
        boolean u = true;
    while(u)
        {
            if(ob.mobileNumber.equals(mobileNumber))
            {
                System.out.println("Member Found:- ");
                u = false;
            }
            else 
            {
                System.out.println("No such Member Found, Please Enter again:- ");
                mobileNumber = sc.next();
            }
        }

        Member member = findMemberByMobileNumber(ob.mobileNumber);
        if (member != null) {
            member.displayDetails();

            int choice;
            do {
                System.out.println("\nMember Menu:");
                System.out.println("1. Book Ticket");
                System.out.println("2. Get card");
                System.out.println("3. Show Tickets");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // Consume the leftover newline

                switch (choice) {
                    case 1:
                        member.bookTicket();
                        member.Distance();
                        break;
                    case 2:
                        member.Card_Making();
                        break;
                    case 3:
                        member.Show_Ticket();
                        break;
                    case 4:
                        System.out.println("Returning to main menu...");
                        break;
                    default:
                        System.out.println("Invalid option! Please try again.");
                }
            } while (choice != 4);
        } 
        else 
        {
            System.out.println("No member found with this mobile number!");
        }
    }

    Member findMemberByMobileNumber(String mobileNumber) 
    {
        for (int i = 0; i < memberCount; i++) 
        {
            if (ob.mobileNumber.equals(mobileNumber)) {
                return members[i];
            }
        }
        return null;
    }
}

class Member 
{
    final int MAX_TICKETS = 32;
    Scanner sc = new Scanner(System.in);

 // Coordinates of Station 1
 double lat1;//Latitudw of Station 1
 double lon1;//Longitude of Station 1

// Coordinates of Station 2
 double lat2;  // Latitude of Station 2
 double lon2; // Longitude of Station 2

String station[] = new String[10];       //Array to store station names
String passengerName[] = new String[10];  //Array to store passenger name
int passenger_No = 0;
int passengerAge[] = new int[10];
int Tickets[]= new int[10];
String passenger_Mo[] = new String[10];

{
 station[0] = "Nehrunager";
 station[1] = "Maninager";
 station[2] = "CTM";
 station[3] = "GitaMandir";
 station[4] = "Sharkej";
 station[5] = "SolarCrossroad";
 station[6] = "SouthBopal";
 station[7] = "ScienceCity";
}

String currentStation;
String destinationStation;
static String[][] Seat = new String[8][6];
Scanner input = new Scanner(System.in);
java_project ob2 = new java_project();
int payment=0;
int bookedseats=0;
String Card_validity;

    
   

    Member(String name, int age, String Password, String mobileNumber, String phyDisabled) 
    {
            ob2.name = name;
            ob2.age = age;
            ob2.Password = Password;
            ob2.mobileNumber = mobileNumber;
            ob2.Disabled = phyDisabled;
    }

    void displayDetails() 
    {
        System.out.println("\nMember Details:");
        System.out.println("Name: " + ob2.name);
        System.out.println("Age: " + ob2.age);
        System.out.println("Password: " + ob2.Password);
        System.out.println("Mobile Number: " + ob2.mobileNumber);
        System.out.println("Physicaly Disable: " + ob2.Disabled);
    }

    void bookTicket() 
    {
        if (bookedseats >= MAX_TICKETS) {
            System.out.println("Ticket limit reached. Cannot book more tickets.");
            return;
        }
        char seatch=65;
        // int seatnu=1;
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<6;j++)
            {
                if(j==3)
                {
                    Seat[i][j]=" ";
                }
                else if (j==0)
                {
                    Seat[i][j]=String.valueOf((char)seatch)+".";
                    seatch++;
                }
                else
                {
                    Seat[i][j]="O ";
                }
            }
        }

        passenger_No++;
        System.out.println("Enter passenger name: ");
        passengerName[passenger_No] = sc.next();
        
        for(int i=0;i<passengerName[passenger_No].length();i++)
        {
            passenger_Mo[passenger_No]=(ob2.mobileNumber);  //to assign login phone No. to passanger phone No.
            char c=ob2.name.charAt(i);
            if(c>='0' && c<='9')
            {
                System.out.println("again!,Enter Passenger name: ");
                passengerName[passenger_No] = sc.next();
            }

            else 
            continue;
        }

        System.out.println("Enter passenger age: ");
        passengerAge[passenger_No] = sc.nextInt();
        while(passengerAge[passenger_No]>100 || passengerAge[passenger_No]<16)
        {
            System.out.println("Enter Valid age,Enter again between(16 to 100)");
            passengerAge[passenger_No] = sc.nextInt();
        }


        
        System.out.print("how many Tickets do you want: ");
        Tickets[passenger_No]=input.nextInt();
        if(Tickets[passenger_No]<0)
        {
            System.out.println("No. of Tickets can't be in negetive");
            Tickets[passenger_No] = input.nextInt();
        }
        if(Tickets[passenger_No]>(32-bookedseats))
        {
            System.out.println(" Sorry!,We dont have That many Tickets,maximum we can give is"+(32 -bookedseats));
            System.out.println("How many Do you want: ");
            Tickets[passenger_No] = input.nextInt();
        }

        System.out.println("  1 2  3 4");
        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0;j<6;j++) 
            {
             System.out.print(Seat[i][j]);    
            }
            System.out.println();
            
        }
        for(int i=0;i<Tickets[passenger_No];i++)
        {
        System.out.print("Enter seat number to book (e.g., A1): ");
        String seat = input.next().toUpperCase();

        if (seat.length() == 2) 
        {
            char rowChar = seat.charAt(0);
            int col = seat.charAt(1)-'1'+1; // Convert seat number to array index

            if (rowChar >= 'A' && rowChar <= 'H' && col >= 1 && col <= 4) 
            {
                int row = rowChar - 'A';
                int column = (col >= 3 ? col + 1 : col); // Adjust column index to account for space
                if (Seat[row][column].equals("O "))  
                {
                    Seat[row][column]="X "; // Mark seat as booked
                    System.out.println("Seat " + seat + " booked successfully!");
                    bookedseats++;
                }

                else 
                {
                    System.out.println("Seat " + seat + " is already booked.");
                    i--;
                }
            } 
            else 
            {
                System.out.println("Invalid seat number. Please try again.");
                i--;
            }
        }
         else 
        {
            System.out.println("Invalid input format. Please try again.");
            i--;
        }
    }

        
        System.out.println(" 1 2  3 4");
        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0;j<6;j++) 
            {
             System.out.print(Seat[i][j]);    
            }
            System.out.println();
            
        }
    }

    void Distance()                            //Method to calculate distance between two stations
    {

        boolean looper1 = true;  // to loop
        boolean looper2 = true; //to loop

        while(looper1)
        {
            System.out.println("--------------> Enter your current station : 1."+station[0]+" 2."+station[1]+" 3."+station[2]+"  4."+station[3]+" 5."+station[4]+"\n                                             6."+station[5]+" 7."+station[6]+" 8."+station[7]);
            currentStation = sc.next().toLowerCase();
            System.out.println();

            switch (currentStation)
            { 
                case "nehrunager":
                    lat1 = 23.0225;  // Latitude of Nehrunagar
                    lon1 = 72.5300; // Longitude of Nehrunagar
                    looper1 = false;
                break;
                case "maninager":
                    lat1 = 22.9920; // Latitude of Maninagar Railway Station
                    lon1 = 72.6000; // Longitude of Maninagar Railway Station
                    looper1 = false;
                break;
                case "ctm":
                    lat1 = 22.9900;  // Latitude of CTM
                    lon1 = 72.6100; // Longitude of CTM
                    looper1 = false;
                break;
                case "gitamandir":
                    lat1 = 23.0100;  // Latitude of Gita Mandir
                    lon1 = 72.5800; // Longitude of Gita Mandir
                    looper1 = false;
                break;
                case "sharkej":
                    lat1 = 23.0300;  // Latitude of Sharkej
                    lon1 = 72.5100; // Longitude of Sharkej
                    looper1 = false;
                break;
                case "solarcrossroad":
                    lat1 = 23.0400; // Latitude of Solar Crossroad
                    lon1 = 72.5200; // Longitude of Solar Crossroad
                    looper1 = false;
                break;
                case "southbopal":
                    lat1 = 23.0500; // Latitude of South Bopal
                    lon1 = 72.5300; // Longitude of South Bopal
                    looper1 = false;
                break;
                case "sciencecity":
                    lat1 = 23.0700; // Latitude of Science City
                    lon1 = 72.5100; // Longitude of Science City
                    looper1 = false;
                break;
                default:
                    System.out.println("Invalid Current station");
                    System.out.println("Plese enter Again");
                break;
            }
        }

        

        while(looper2)
        {
            System.out.println("--------------> Enter your destination station : 1."+station[0]+" 2."+station[1]+" 3."+station[2]+"  4."+station[3]+" 5."+station[4]+"\n                                                 6."+station[5]+" 7."+station[6]+" 8."+station[7]);
            destinationStation = sc.next().toLowerCase();
            System.out.println();

            switch (destinationStation) 
            { 
                case "nehrunager":
                    lat2 = 23.0225;  // Latitude of Nehrunagar
                    lon2 = 72.5300; // Longitude of Nehrunagar
                    looper2 = false;
                    break;
                case "maninager":
                    lat2 = 22.9920; // Latitude of Maninagar Railway Station
                    lon2 = 72.6000; // Longitude of Maninagar Railway Station
                    looper2 = false;
                    break;
                case "ctm":
                    lat2 = 22.9900;  // Latitude of CTM
                    lon2 = 72.6100; // Longitude of CTM
                    looper2 = false;
                    break;
                case "gitamandir":
                    lat2 = 23.0100;  // Latitude of Gita Mandir
                    lon2 = 72.5800; // Longitude of Gita Mandir
                    looper2 = false;
                    break;
                case "sharkej":
                    lat2 = 23.0300;  // Latitude of Sharkej
                    lon2 = 72.5100; // Longitude of Sharkej
                    looper2 = false;
                    break;
                case "solarcrossroad":
                    lat2 = 23.0400; // Latitude of Solar Crossroad
                    lon2 = 72.5200; // Longitude of Solar Crossroad
                    looper2 = false;
                    break;
                case "southbopal":
                    lat2 = 23.0500; // Latitude of South Bopal
                    lon2 = 72.5300; // Longitude of South Bopal
                    looper2 = false;
                    break;
                case "sciencecity":
                    lat2 = 23.0700; // Latitude of Science City
                    lon2 = 72.5100; // Longitude of Science City
                    looper2 = false;
                    break;
                default:
                    System.out.println("Invalid destination station");
                    System.out.println("Plese enter Again");
                break;
            }
        }

        // Radius of Earth in kilometers
        double radius = 6371.0;

        // Calculate the difference in latitude and longitude
        double latDiff = Math.toRadians(lat2 - lat1);
        double lonDiff = Math.toRadians(lon2 - lon1);

        // Haversine formula
        double a = Math.sin(latDiff / 2) * Math.sin(latDiff / 2)+ Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))* Math.sin(lonDiff / 2) * Math.sin(lonDiff / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Calculate the distance
        double distance = (radius * c);
        if (distance<10)
        {
            distance = distance + 5;
        }
        else if (distance > 10 && distance <= 15) 
        {
            distance += 7.5;
        }
        else if (distance > 15 && distance <=20)
        {
            distance +=10;
        }
        else if (distance > 20 && distance <=30)
        {
            distance +=12;
        }

        if(distance<=5)
        {
				payment=10;
        }
				if(distance>5 && distance<=8)
                {
					payment=15;
                }
						if(distance>8 && distance<=14)
                        {
						payment=20;
                        }
							if(	distance>18 && distance<=20)
                            {
							payment=25;
                            }
								if(distance>20)
                                {
								payment=30;
                                }
                                    if(currentStation.equals(destinationStation))
                                    {
                                        distance = 0;
                                        payment = 0;
                                        System.out.println("Already at the Station");
                                    }
							System.out.println("Payment is:"+payment);
        

        // Print the result
        System.out.println("The distance between the two stations is: " + distance + " kilometers.");
    }
    void Show_Ticket()
    {
        System.out.print("Enter Your name:");
        String search_passenger = sc.next();
        boolean l = true;
        while(l)
        {
            for (int o =1;o <10;o++)
            {
                if(search_passenger.equals(passengerName[o]))
                {
                    System.out.println();
                    System.out.println("Passenger Found:- "+passengerName[o]+"\n");
                    System.out.println("Passenger Age:- "+passengerAge[o]+"\n");
                    System.out.println("Total No. of Tickits Booked by Passenger:- "+Tickets[o]+"\n");
                    System.out.println("Passenger Contect Number:- "+passenger_Mo[o]+"\n");
                    System.out.println("Passenger Payment:- "+payment+"\n");
                
                l=false;
                break;
                }
                else
                {
                    if(passengerName[1]==null)
                    {
                        System.out.println("No members yet.");
                        l=false;
                        break;
                    }
                    System.out.println("No Such name Found");
                    
                    l=false;
                    break;
                }
            }
        }
    }
    void Card_Making()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-Student Pass");
        System.out.println("2-Monthly Pass for 1 Mounth");
        System.out.println("3-Monthly Pass for 3 Mounth");
        System.out.println("4-Exit");
        System.out.println();
        System.out.println("Enter your choice:");
        int choice2=sc.nextInt();
        
        switch(choice2)
        {
            case 1: Student_Pass();
                    break;
           // case 2:ob2.Pass_1();
           //         break;
                    
           // case 3:ob2.Pass_3();
             //       break;
            case 4:
                break;
                
            default:
            System.out.println("Invalid choice, please try again.");
        }
    }
    void Student_Pass()
    {
        if(ob2.age>18)
        {
            System.out.println();
            System.out.println("Age Criteria Did not Satisfied");
            System.out.println();
            Card_Making();
        }
        else
        {

        }
    }
}
