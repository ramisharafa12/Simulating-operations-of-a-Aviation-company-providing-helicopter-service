package iub.aviation.Nishat;

public class Admin extends User {
    public Admin(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void login() {
        System.out.println("Admin " + name + " logged in.");
    }

    // Admin-specific method
    public void addHelicopter(Helicopter h) {
        System.out.println("Helicopter " + h.getModel() + " added.");
    }
}
