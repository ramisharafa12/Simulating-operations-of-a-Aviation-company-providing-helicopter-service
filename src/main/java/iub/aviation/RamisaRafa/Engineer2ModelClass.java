package iub.aviation.RamisaRafa;

public class Engineer2ModelClass {

    private String helicopter;
    private String maintenance;
    private String assign;

    public Engineer2ModelClass(String helicopter, String maintenance, String assign) {
        this.helicopter = helicopter;
        this.maintenance = maintenance;
        this.assign = assign;
    }

    public String getHelicopter() {
        return helicopter;
    }

    public void setHelicopter(String helicopter) {
        this.helicopter = helicopter;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    @Override
    public String toString() {
        return "Engineer2ModelClass{" +
                "helicopter='" + helicopter + '\'' +
                ", maintenance='" + maintenance + '\'' +
                ", assign='" + assign + '\'' +
                '}';
    }
}
