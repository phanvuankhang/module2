package case_study.furama_resort_manager.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String nameService, float usableArea, float rentalCosts, int peopleMaximum, String rentalType, String freeService) {
        super(nameService, usableArea, rentalCosts, peopleMaximum, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", peopleMaximum=" + peopleMaximum +
                ", rentalType='" + rentalType + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
