package iub.aviation.Nishat;

import java.util.Date;

public class Helicopter {
    private String id;
    private String model;
    private String status;
    private Date lastMaintenanceDate;
    private Date nextMaintenanceDate;

    // Constructor
    public Helicopter(String id, String model, String status, Date lastMaintenanceDate, Date nextMaintenanceDate) {
        this.id = id;
        this.model = model;
        this.status = status;
        this.lastMaintenanceDate = lastMaintenanceDate;
        this.nextMaintenanceDate = nextMaintenanceDate;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(Date lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public Date getNextMaintenanceDate() {
        return nextMaintenanceDate;
    }

    public void setNextMaintenanceDate(Date nextMaintenanceDate) {
        this.nextMaintenanceDate = nextMaintenanceDate;
    }

    // Optional: toString method for debugging
    @Override
    public String toString() {
        return "Helicopter{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", status='" + status + '\'' +
                ", lastMaintenanceDate=" + lastMaintenanceDate +
                ", nextMaintenanceDate=" + nextMaintenanceDate +
                '}';
    }
}
