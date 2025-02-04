
import java.util.*;

class Distance
{

    public static void main(String []rags)
    {
        Cal ob = new Cal();
        ob.Distancecal();
    }
}
class Cal
{
    Scanner sc = new Scanner(System.in);

    // Coordinates of Station 1
    double lat1;//Latitudw of Station 1
    double lon1;//Longitude of Station 1
   
   // Coordinates of Station 2
    double lat2;  // Latitude of Station 2
    double lon2; // Longitude of Station 2

    String station[] = new String[2];       //Array to store station names

    String currentStation;
    String destinationStation;

{
 station[0] = "India";
 station[1] = "Landon";
}
void Distancecal()                            //Method to calculate distance between two points in a great sphere
    {

        boolean looper1 = true;  // to loop
        boolean looper2 = true; //to loop

        while(looper1)
        {
            System.out.println("--------------> Enter your current station : 1."+station[0]+" 2."+station[1]);
            currentStation = sc.next().toLowerCase();
            System.out.println();

            switch (currentStation)
            { 
                case "india":
                    lat1 = 20.5937;  // Latitude of Nehrunagar
                    lon1 = 78.9629; // Longitude of Nehrunagar
                    looper1 = false;
                break;
                case "landon":
                    lat1 = 51.5072; // Latitude of Maninagar Railway Station
                    lon1 = 0.1276; // Longitude of Maninagar Railway Station
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
            System.out.println("--------------> Enter your destination station : 1."+station[0]+" 2."+station[1]);
            destinationStation = sc.next().toLowerCase();
            System.out.println();

            switch (destinationStation) 
            { 
                case "india":
                    lat2 = 20.5937;  // Latitude of Nehrunagar
                    lon2 = 78.9629; // Longitude of Nehrunagar
                    looper2 = false;
                    break;
                case "landon":
                    lat2 = 51.5072; // Latitude of Maninagar Railway Station
                    lon2 = 0.1276; // Longitude of Maninagar Railway Station
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

        System.out.println("The distance between the two stations is: " + distance + " kilometers.");
    }
}