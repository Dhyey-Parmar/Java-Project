
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
        train Train[] = new train[10];

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

        String[] stops4 = {"Kolkata", "Bardhaman", "Durgapur", "Asansol", "Dhanbad", "Koderma", "Gaya", "Dehri-on-Sone", "Mughalsarai", "Varanasi", "Sultanpur", "Lucknow", "Bareilly", "Moradabad", "Ghaziabad", "Delhi"};
        int[] distance4 = {0, 107, 158, 200, 259, 360, 450, 520, 636, 686, 770, 886, 986, 1086, 1236, 1316};
        int[] stoptime4 = {0, 2, 2, 2, 5, 2, 2, 2, 5, 2, 2, 5, 2, 2, 2, 0};
        Train[3] = new train(12301, "Kolkata Rajdhani", stops4, distance4, stoptime4);

        String[] stops5 = {"Mumbai", "Thane", "Kalyan", "Nasik", "Manmad", "Jalgaon", "Bhusawal", "Akola", "Badnera", "Nagpur"};
        int[] distance5 = {0, 30, 50, 167, 240, 370, 441, 581, 715, 837};
        int[] stoptime5 = {0, 2, 2, 5, 2, 2, 5, 5, 2, 0};
        Train[4] = new train(12289, "Duronto Express", stops5, distance5, stoptime5);

        String[] stops6 = {"Gandhidham", "Bhachau", "Ahmedabad", "Vadodara", "Bharuch", "Surat", "Nandurbar", "Jalgaon", "Solapur", "Wadi", "Raichur", "Guntakal", "Anantapur", "Yesvantpur", "Bangalore"};
        int[] distance6 = {0, 50, 310, 410, 470, 560, 650, 850, 1120, 1200, 1250, 1320, 1400, 1480, 1500};
        int[] stoptime6 = {0, 2, 5, 5, 2, 5, 2, 2, 5, 2, 2, 5, 2, 2, 0};
        Train[5] = new train(16505, "Gandhidham-Bangalore Express", stops6, distance6, stoptime6);

        String[] stops7 = {"Ahmedabad", "Gandhinagar", "Mehsana", "Palanpur", "Abu Road", "Sirohi Road", "Pindwara", "Udaipur", "Chittorgarh", "Bhilwara", "Ajmer", "Jaipur", "Dausa", "Agra Cantt", "Tundla", "Etawah", "Kanpur Central", "Unnao", "Lucknow", "Barabanki", "Rudauli", "Faizabad", "Ayodhya"};
        int[] distance7 = {0, 30, 75, 145, 215, 250, 270, 370, 460, 520, 570, 670, 710,850, 880, 920, 970, 1000, 1050, 1080, 1110, 1150, 1165};
        int[] stoptime7 = {0, 2, 2, 2, 2, 2, 2, 5, 2, 2, 5, 5, 2,5, 2, 2, 5, 2, 5, 2, 2, 2, 0};
        Train[6] = new train(19491, "Ahmedabad-Ayodhya Express", stops7, distance7, stoptime7);

        String[] stops8 = {"Delhi", "Ghaziabad", "Aligarh", "Tundla", "Firozabad", "Shikohabad","Etawah", "Bharthana", "Phaphund", "Jhinjhak", "Rura", "Kanpur","Unnao", "Lalganj", "Fatehpur", "Janghai", "Prayagraj","Naini", "Mirzapur", "Chunar", "Kashi", "Varanasi"};
        int[] distance8 = {0, 20, 130, 180, 200, 215, 250, 270, 300, 325, 340, 440, 465, 490, 500, 560, 630, 645, 720, 760, 770, 776};
        int[] stoptime8 = {0, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 5, 2, 1, 2, 2, 5, 2, 2, 2, 2, 0};
        Train[7] = new train(22436, "Vande Bharat Express", stops8, distance8, stoptime8);

        String[] stops9 = {"Mumbai", "Dadar", "Borivali", "Vasai Road", "Palghar", "Boisar", "Dahanu Road","Vapi", "Valsad", "Bilimora", "Navsari", "Surat", "Kosamba", "Bharuch", "Ankleshwar", "Vadodara", "Anand", "Nadiad", "Maninagar", "Ahmedabad"};
        int[] distance9 = {0, 10, 30, 55, 87, 100, 125, 159, 190, 210, 225, 263, 285, 320,330, 392, 430, 450, 475,491};
        int[] stoptime9 = {0, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2, 1, 2,1, 2, 2, 2, 1, 0};
        Train[8] = new train(12009, "Jan Shatabdi Express", stops9, distance9, stoptime9);

        String[] stops10 = {"Jammu Tawi", "Pathankot", "Jalandhar", "Ludhiana", "Ambala", "Panipat", "Delhi","Agra", "Gwalior", "Jhansi", "Bhopal", "Itarsi", "Nagpur", "Sewagram", "Wardha", "Balharshah", "Ramagundam", "Kazipet", "Hyderabad", "Kurnool", "Anantapur","Bengaluru", "Salem", "Erode", "Coimbatore", "Madurai", "Tirunelveli", "Nagercoil","Kanyakumari"};
        int[] distance10 = {00, 100, 200, 270, 360, 450, 580, 750, 870, 970, 1150, 1220, 1400, 1430, 1450, 1500, 1600, 1650, 1700, 1850, 1950, 2100, 2200, 2250, 2300, 2400, 2550, 2600, 2635};
        int[] stoptime10 = {0, 2, 2, 2, 2, 2, 5, 2, 2, 2, 5, 2, 5, 2, 1,2, 2, 2, 5, 2, 2, 5, 2, 1, 2, 2, 2, 2, 0};
        Train[9] = new train(22685, "Bharat Darshan SF Express", stops10, distance10, stoptime10);


        
        
        
        
        System.out.print("Enter Boarding Point:");
        String BoardingPoint = sc.next();
        System.out.print("Enter your Final Destination:");
        String Destination = sc.next();
        System.out.print("Enter class:(S-Sleeper  /  B-3 Tier AC  /  A-2 Tier AC  /  H-1st class AC)First Character Capital :");
        String Coach=sc.next(); 
        System.out.print("Enter No of Passengers:");
        int NoOfPassengers = sc.nextInt();
        boolean startPointFound = false;
        boolean TrainFound=false;
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
                    TrainFound=true;
                }
            }
        }
        if (!TrainFound) {
            System.out.println("-------No Train Available for the given route-------");
        }
    }
}
