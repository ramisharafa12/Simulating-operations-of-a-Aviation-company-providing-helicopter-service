package iub.aviation.Nishat;


import javafx.beans.property.SimpleStringProperty;

public class PilotFlightSchedule {
    private final SimpleStringProperty pilotName;
    private final SimpleStringProperty flightTime;
    private final SimpleStringProperty helicopterModel;
    private final SimpleStringProperty location;

    public PilotFlightSchedule(String pilotName, String flightTime, String helicopterModel, String location) {
        this.pilotName = new SimpleStringProperty(pilotName);
        this.flightTime = new SimpleStringProperty(flightTime);
        this.helicopterModel = new SimpleStringProperty(helicopterModel);
        this.location = new SimpleStringProperty(location);
    }

    public String getPilotName() {
        return pilotName.get();
    }

    public String getFlightTime() {
        return flightTime.get();
    }

    public String getHelicopterModel() {
        return helicopterModel.get();
    }

    public String getLocation() {
        return location.get();
    }
}
