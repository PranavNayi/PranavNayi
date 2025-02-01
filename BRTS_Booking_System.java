import java.util.*;

class Bus {
    // Coordinates of Station 1
    double lat1, lon1; // Lat/Long of Station 1
    double lat2, lon2; // Lat/Long of Station 2

    int busId;
    String route;
    int totalSeats;
    int bookedSeats;

    Scanner sc = new Scanner(System.in);

    String[] station = {"Nehrunager", "Maninager(Railway Station)", "CTM", "GitaMandir", "Sharkej", "SolarCrossroad", "SouthBopal", "ScienceCity"};

    String currentStation, destinationStation;

    Bus(int busId, String route, int totalSeats) {
        this.busId = busId;
        this.route = route;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    boolean bookSeat() {
        if (bookedSeats < totalSeats) {
            bookedSeats++;
            return true;
        }
        return false;
    }

    boolean cancelSeat() {
        if (bookedSeats > 0) {
            bookedSeats--;
            return true;
        }
        return false;
    }

    void displayBusInfo() {
        System.out.println("Bus ID: " + busId);
        System.out.println("Route: " + route);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Booked Seats: " + bookedSeats);
        System.out.println("-------------------------------");
    }

    void calculateDistance() {
        // Ask for current and destination stations
        getStationCoordinates();

        // Radius of Earth in kilometers
        double radius = 6371.0;

        // Calculate the difference in latitude and longitude
        double latDiff = Math.toRadians(lat2 - lat1);
        double lonDiff = Math.toRadians(lon2 - lon1);

        // Haversine formula
        double a = Math.sin(latDiff / 2) * Math.sin(latDiff / 2)
                 + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                 * Math.sin(lonDiff / 2) * Math.sin(lonDiff / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Calculate the distance
        double distance = (radius * c);
        if (distance < 10) {
            distance += 5;
        } else if (distance > 10 && distance <= 15) {
            distance += 7.5;
        } else if (distance > 15 && distance <= 20) {
            distance += 10;
        } else if (distance > 20 && distance <= 30) {
            distance += 12;
        }

        System.out.println("The distance between the two stations is: " + distance + " kilometers.");
    }

    private void getStationCoordinates() {
        // Get coordinates for current station
        boolean looper1 = true;
        while (looper1) {
            System.out.println("Enter your Current station: ");
            for (int i = 0; i < station.length; i++) {
                System.out.println((i + 1) + ". " + station[i]);
            }
            currentStation = sc.next().toLowerCase();

            switch (currentStation) {
                case "nehrunager":
                    lat1 = 23.0225; lon1 = 72.5300; looper1 = false; break;
                case "maninager":
                    lat1 = 22.9920; lon1 = 72.6000; looper1 = false; break;
                case "ctm":
                    lat1 = 22.9900; lon1 = 72.6100; looper1 = false; break;
                case "gitamandir":
                    lat1 = 23.0100; lon1 = 72.5800; looper1 = false; break;
                case "sharkej":
                    lat1 = 23.0300; lon1 = 72.5100; looper1 = false; break;
                case "solarcrossroad":
                    lat1 = 23.0400; lon1 = 72.5200; looper1 = false; break;
                case "southbopal":
                    lat1 = 23.0500; lon1 = 72.5300; looper1 = false; break;
                case "sciencecity":
                    lat1 = 23.0700; lon1 = 72.5100; looper1 = false; break;
                default:
                    System.out.println("Invalid station. Please enter again.");
            }
        }

        // Get coordinates for destination station
        boolean looper2 = true;
        while (looper2) {
            System.out.println("Enter your destination station: ");
            for (int i = 0; i < station.length; i++) {
                System.out.println((i + 1) + ". " + station[i]);
            }
            destinationStation = sc.next().toLowerCase();

            switch (destinationStation) {
                case "nehrunager":
                    lat2 = 23.0225; lon2 = 72.5300; looper2 = false; break;
                case "maninager":
                    lat2 = 22.9920; lon2 = 72.6000; looper2 = false; break;
                case "ctm":
                    lat2 = 22.9900; lon2 = 72.6100; looper2 = false; break;
                case "gitamandir":
                    lat2 = 23.0100; lon2 = 72.5800; looper2 = false; break;
                case "sharkej":
                    lat2 = 23.0300; lon2 = 72.5100; looper2 = false; break;
                case "solarcrossroad":
                    lat2 = 23.0400; lon2 = 72.5200; looper2 = false; break;
                case "southbopal":
                    lat2 = 23.0500; lon2 = 72.5300; looper2 = false; break;
                case "sciencecity":
                    lat2 = 23.0700; lon2 = 72.5100; looper2 = false; break;
                default:
                    System.out.println("Invalid destination station. Please enter again.");
            }
        }
    }
}

class Member {
    static final int MAX_TICKETS = 10;
    String name;
    int age;
    String bloodGroup;
    String mobileNumber;
    String address;
    Ticket[] tickets = new Ticket[MAX_TICKETS];
    int ticketCount = 0;
    Scanner sc = new Scanner(System.in);

    public Member(String name, int age, String bloodGroup, String mobileNumber, String address) {
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    void displayDetails() {
        System.out.println("\nMember Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Address: " + address);
    }

    void bookTicket() {
        if (ticketCount >= MAX_TICKETS) {
            System.out.println("Ticket limit reached. Cannot book more tickets.");
            return;
        }

        System.out.println("Enter passenger name: ");
        String passengerName = sc.nextLine();
        System.out.println("Enter passenger age: ");
        int passengerAge = sc.nextInt();
        sc.nextLine(); // Consume leftover newline
        String departure;
        String arrival;
        do {
            System.out.println("Enter departure location: ");
            departure = sc.nextLine();
            System.out.println("Enter arrival location: ");
            arrival = sc.nextLine();
        } while (departure.equals("") || arrival.equals(""));

        tickets[ticketCount++] = new Ticket(passengerName, passengerAge, departure, arrival);
        System.out.println("Ticket booked successfully!");
    }
}

class Ticket {
    String passengerName;
    int passengerAge;
    String departure;
    String arrival;

    public Ticket(String passengerName, int passengerAge, String departure, String arrival) {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.departure = departure;
        this.arrival = arrival;
    }

    @Override
    public String toString() {
        return "Passenger: " + passengerName + "\n" +
       "Age: " + passengerAge + "\n" +
       "From: " + departure + "\n" +
       "To: " + arrival;
    }
}

public class BRTS_Booking_System {
    static Bus[] buses = new Bus[5]; // Fixed array for buses
    static int busCount = 0;

    public static void main(String[] args) {
        Scanner
