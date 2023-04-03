package case_study.furama_resort_manager.model.facility;

public class Facility {
    String codeService;
    float usableArea;
    float rentalCosts;
    int peopleMaximum;
    String rentalType;

    public Facility() {
    }

    public Facility(String codeService, float usableArea, float rentalCosts, int peopleMaximum, String rentalType) {
        this.codeService = codeService;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.peopleMaximum = peopleMaximum;
        this.rentalType = rentalType;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public float getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(float usableArea) {
        this.usableArea = usableArea;
    }

    public float getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(float rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getPeopleMaximum() {
        return peopleMaximum;
    }

    public void setPeopleMaximum(int peopleMaximum) {
        this.peopleMaximum = peopleMaximum;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "codeService='" + codeService + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", peopleMaximum=" + peopleMaximum +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
