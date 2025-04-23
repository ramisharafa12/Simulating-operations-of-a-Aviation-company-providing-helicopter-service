package iub.aviation.Nishat;

public class Pilot extends User {
    public Pilot(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void login() {
        System.out.println("Pilot " + name + " logged in.");
    }

    public void viewFlightSchedule() {
        System.out.println(name + " is viewing their flight schedule.");
    }
}
