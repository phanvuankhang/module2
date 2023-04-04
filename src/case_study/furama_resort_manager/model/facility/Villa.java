package case_study.furama_resort_manager.model.facility;

public class Villa extends Facility {
    public String roomStandard;
    public float poolArea;
    public int floorsNumber;

    public Villa() {
    }

    public Villa(String codeService, float usableArea, float rentalCosts, int peopleMaximum, String rentalType, String roomStandard, float poolArea, int floorsNumber) {
        super(codeService, usableArea, rentalCosts, peopleMaximum, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorsNumber = floorsNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +
                ", nameService='" + codeService + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", peopleMaximum=" + peopleMaximum +
                ", rentalType='" + rentalType + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floorsNumber=" + floorsNumber +
                '}';
    }

    public String getInfoToVilla() {
        return codeService + "," + usableArea + "," + rentalCosts + "," + peopleMaximum + "," + rentalType + "," + roomStandard + "," + poolArea + "," + floorsNumber;
    }
}
