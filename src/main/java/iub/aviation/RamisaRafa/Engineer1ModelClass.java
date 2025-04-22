package iub.aviation.RamisaRafa;


public class Engineer1ModelClass {
    private String helicopter;
    private String system;
    private String problem;
    private String replacement;
    private String status;

    public Engineer1ModelClass(String helicopter, String system, String problem, String replacement, String status) {
        this.helicopter = helicopter;
        this.system = system;
        this.problem = problem;
        this.replacement = replacement;
        this.status = status;
    }

    public String getHelicopter() {
        return helicopter;
    }

    public void setHelicopter(String helicopter) {
        this.helicopter = helicopter;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getReplacement() {
        return replacement;
    }

    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "engineer01{" +
                "helicopter='" + helicopter + '\'' +
                ", system='" + system + '\'' +
                ", problem='" + problem + '\'' +
                ", replacement='" + replacement + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
