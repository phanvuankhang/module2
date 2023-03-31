package case_study.furama_resort_manager.model.facility;

public class House extends Facility {
    public String roomStandard;
    public int floorsNumber;

    public House() {
    }

    public House(String nameService, float usableArea, float rentalCosts, int peopleMaximum, String rentalType, String roomStandard, int floorsNumber) {
        super(nameService, usableArea, rentalCosts, peopleMaximum, rentalType);
        this.roomStandard = roomStandard;
        this.floorsNumber = floorsNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", peopleMaximum=" + peopleMaximum +
                ", rentalType='" + rentalType + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", floorsNumber=" + floorsNumber +
                '}';
    }
}
