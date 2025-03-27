
import java.util.Scanner;

class train {

    int trainNo;
    String trainName;
    String[] stops;
    int[] distance;
    int[] stoptime;
    int s1=72,s2=72,b1=72,a1=48,h1=24;

    train(int trainNo, String trainName, String[] stops, int[] distance, int[] stoptime) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.stops = stops;
        this.distance = distance;
        this.stoptime = stoptime;
    }
}

class ticket {

    int ticketNo;
    int NoOfPassengers;
    int trainNo;
    String seatNo;

    ticket(int ticketNo, int NoOfPassengers, int trainNo, String seatNo) {
        this.ticketNo = ticketNo;
        this.NoOfPassengers = NoOfPassengers;
        this.trainNo = trainNo;
        this.seatNo = seatNo;
    }
}

public class TicketBooking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        train Train[] = new train[4];
        String[] stops1 = {"Jamnagar", "Hapa", "Rajkot", "Wankaner", "Surendranagar", "Viramgam", "Ahmedabad", "Anand", "Vadodara", "Bharuch", "udhna", "Vapi", "Borivali", "Bandra"};
        int[] distance1 = {0, 9, 85, 127, 201, 267, 332, 396, 432, 502, 565, 653, 793, 812};
        int[] stoptime1 = {0, 2, 5, 2, 2, 2, 5, 2, 5, 2, 5, 2, 4, 0};
        Train[0] = new train(22924, "BDTS Hamsafar", stops1, distance1, stoptime1);

        String[] stops2 = {"Okha", "Dwarka", "Bhatiya", "Khambhaliya", "Jamnagar", "Hapa", "Rajkot", "Wankaner", "Surendranagar", "Viramgam", "Mehsana", "Unjha", "Palanpur", "Abu", "Ajmer", "Jaipur", "Gurgoan", "Delhi Cantt", "New Dehli", "Roorkee", "Haridwar", "Dehradun"};
        int[] distance2 = {0, 29, 71, 114, 168, 177, 253, 294, 369, 434, 498, 519, 563, 616, 921, 1056, 1332, 1349, 1364, 1583, 1628, 1680};
        int[] stoptime2 = {0, 5, 1, 2, 5, 2, 5, 2, 2, 2, 2, 2, 1, 10, 10, 2, 2, 15, 5, 10, 0};
        Train[1] = new train(19565, "Okha Ddn Express", stops2, distance2, stoptime2);

        String[] stops3 = {"Mumbai", "Thane", "Kalyan", "Lonavala", "Pune", "Solapur", "Wadi", "Gulbarga", "Yadgir", "Raichur", "Mantralayam", "Guntakal", "Dharmavaram", "Penukonda", "Hindupur", "Yelahanka", "Bangalore"};
        int[] distance3 = {0, 34, 54, 128, 192, 456, 618, 682, 724, 775, 804, 870, 964, 1014, 1054, 1104, 1134};
        int[] stoptime3 = {0, 2, 2, 2, 5, 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0};
        Train[2] = new train(11013, "Mumbai Express", stops3, distance3, stoptime3);

        String[] stops4 = {"Chennai", "Arakkonam", "Katpadi", "Jolarpettai", "Salem", "Erode", "Tiruppur", "Coimbatore", "Palakkad", "Shoranur", "Thrissur", "Aluva", "Ernakulam", "Kottayam", "Changanassery", "Tiruvalla", "Chengannur", "Mavelikara", "Kayamkulam", "Karunagappalli", "Kollam", "Trivandrum"};
        int[] distance4 = {0, 69, 130, 213, 335, 399, 450, 497, 561, 603, 644, 688, 707, 763, 783, 800, 814, 832, 851, 871, 902, 929};
        int[] stoptime4 = {0, 2, 2, 2, 5, 5, 2, 2, 2, 2, 2, 2, 5, 2, 2, 2, 2, 2, 2, 2, 2, 0};
        Train[3] = new train(12623, "Trivandrum Mail", stops4, distance4, stoptime4);  
        
        
        
        
        
        
        
        System.out.print("Enter Boarding Point:");
        String BoardingPoint = sc.next();
        System.out.print("Enter your Final Destination:");
        String Destination = sc.next();
        System.out.print("Enter class:(S-Sleeper  /  B-3 Tier AC  /  A-2 Tier AC  /  H-1st class AC)First Character Capital :");
        String Coach=sc.next(); 
        System.out.print("Enter No of Passengers:");
        int NoOfPassengers = sc.nextInt();
        boolean startPointFound = false;
        for (int i = 0; i < Train.length; i++) {
            for (int j = 0; j < Train[i].stops.length; j++) {
                if (Train[i].stops[j].equals(BoardingPoint)) {
                    startPointFound = true;
                }
                if (Train[i].stops[j].equals(Destination) && startPointFound == true) {
                    System.out.println("----------Train Found----------");
                    System.out.println("TrainNo :" + Train[i].trainNo);
                    System.out.println("Train Name :" + Train[i].trainName);
                    System.out.println("Seats Available :" +"Sleeper = "+Train[i].s1 +", Sleeper = "+Train[i].s2+", 3 Tier AC = "+Train[i].b1+", 2 Tier AC = "+Train[i].a1+", First Class = "+Train[i].h1);
                }
                else{
                    System.out.println("Train Not Found");
                }
            }
        }
    }
}
