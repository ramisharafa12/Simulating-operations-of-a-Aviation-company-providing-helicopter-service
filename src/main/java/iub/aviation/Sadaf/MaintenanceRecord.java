package iub.aviation.Sadaf;

public class MaintenanceRecord {
    private String mainType;
    private String status;
    private String technician;
    private String date;

    public MaintenanceRecord(String mainType, String status, String technician, String date) {
        this.mainType = mainType;
        this.status = status;
        this.technician = technician;
        this.date = date;
    }

    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}