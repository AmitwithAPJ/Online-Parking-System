public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot("PR1234", 4, 6);

        System.out.println("Open slots for cars: " + parkingLot.getNoOfOpenSlots("car"));

        String ticket1 = parkingLot.parkVehicle("car", "MH-03-AB-1234", "Red");
        String ticket2 = parkingLot.parkVehicle("bike", "MH-05-CD-5678", "Blue");
        System.out.println("Ticket issued: " + ticket1);
        System.out.println("Ticket issued: " + ticket2);

        parkingLot.displayOccupiedSlots("car");
        parkingLot.displayOpenSlots("bike");

        parkingLot.unPark(ticket1);
        parkingLot.displayOpenSlots("car");
    }
}

