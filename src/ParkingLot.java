import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    String parkingLotId;
    List<List<Slot>> slots;

    public ParkingLot(String parkingLotId, int nFloors, int noOfSlotsPerFloor) {
        this.parkingLotId = parkingLotId;
        slots = new ArrayList<>();
        for (int i = 0; i < nFloors; i++) {
            slots.add(new ArrayList<>());
            List<Slot> floorSlots = slots.get(i);
            floorSlots.add(new Slot("truck"));
            floorSlots.add(new Slot("bike"));
            floorSlots.add(new Slot("bike"));
            for (int j = 3; j < noOfSlotsPerFloor; j++) {
                floorSlots.add(new Slot("car"));
            }
        }
    }

    public String parkVehicle(String type, String regNo, String color) {
        Vehicle vehicle = new Vehicle(type, regNo, color);
        for (int i = 0; i < slots.size(); i++) {
            for (int j = 0; j < slots.get(i).size(); j++) {
                Slot slot = slots.get(i).get(j);
                if (slot.type.equals(type) && slot.vehicle == null) {
                    slot.vehicle = vehicle;
                    slot.ticketId = generateTicketId(i + 1, j + 1);
                    return slot.ticketId;
                }
            }
        }
        System.out.println("No slot available for " + type);
        return null;
    }

    private String generateTicketId(int floor, int slotNo) {
        return parkingLotId + "_" + floor + "_" + slotNo;
    }

    public void unPark(String ticketId) {
        String[] extract = ticketId.split("_");
        try {
            int floorIdx = Integer.parseInt(extract[1]) - 1;
            int slotIdx = Integer.parseInt(extract[2]) - 1;
            Slot slot = slots.get(floorIdx).get(slotIdx);
            if (slot.vehicle != null) {
                slot.vehicle = null;
                slot.ticketId = null;
                System.out.println("Unparked vehicle from slot: " + ticketId);
            } else {
                System.out.println("Slot is already empty!");
            }
        } catch (Exception e) {
            System.out.println("Invalid ticket ID!");
        }
    }

    public int getNoOfOpenSlots(String type) {
        int count = 0;
        for (List<Slot> floor : slots) {
            for (Slot slot : floor) {
                if (slot.vehicle == null && slot.type.equals(type)) {
                    count++;
                }
            }
        }
        return count;
    }

    public void displayOpenSlots(String type) {
        for (int i = 0; i < slots.size(); i++) {
            for (int j = 0; j < slots.get(i).size(); j++) {
                Slot slot = slots.get(i).get(j);
                if (slot.vehicle == null && slot.type.equals(type)) {
                    System.out.println("Floor " + (i + 1) + ", Slot " + (j + 1));
                }
            }
        }
    }

    public void displayOccupiedSlots(String type) {
        for (int i = 0; i < slots.size(); i++) {
            for (int j = 0; j < slots.get(i).size(); j++) {
                Slot slot = slots.get(i).get(j);
                if (slot.vehicle != null && slot.type.equals(type)) {
                    System.out.println("Floor " + (i + 1) + ", Slot " + (j + 1));
                }
            }
        }
    }
}

