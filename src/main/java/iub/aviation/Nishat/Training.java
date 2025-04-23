package iub.aviation.Nishat;

import java.util.Date;
import java.util.List;

public class FlightTraining {
    private String trainingId;
    private String trainingName;
    private int courseDuration;  // Duration in days, or however you'd like to represent it
    private String eligibilityRequirements;
    private String status;
    private List<TestResult> assessmentResults;
    private String certificationStatus;
    private Date completionDate;

    // Constructor
    public FlightTraining(String trainingId, String trainingName, int courseDuration,
                          String eligibilityRequirements, String status,
                          List<TestResult> assessmentResults, String certificationStatus,
                          Date completionDate) {
        this.trainingId = trainingId;
        this.trainingName = trainingName;
        this.courseDuration = courseDuration;
        this.eligibilityRequirements = eligibilityRequirements;
        this.status = status;
        this.assessmentResults = assessmentResults;
        this.certificationStatus = certificationStatus;
        this.completionDate = completionDate;
    }

    // Getters and Setters
    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getEligibilityRequirements() {
        return eligibilityRequirements;
    }

    public void setEligibilityRequirements(String eligibilityRequirements) {
        this.eligibilityRequirements = eligibilityRequirements;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<TestResult> getAssessmentResults() {
        return assessmentResults;
    }

    public void setAssessmentResults(List<TestResult> assessmentResults) {
        this.assessmentResults = assessmentResults;
    }

    public String getCertificationStatus() {
        return certificationStatus;
    }

    public void setCertificationStatus(String certificationStatus) {
        this.certificationStatus = certificationStatus;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    // Optional: toString method for debugging
    @Override
    public String toString() {
        return "FlightTraining{" +
                "trainingId='" + trainingId + '\'' +
                ", trainingName='" + trainingName + '\'' +
                ", courseDuration=" + courseDuration +
                ", eligibilityRequirements='" + eligibilityRequirements + '\'' +
                ", status='" + status + '\'' +
                ", assessmentResults=" + assessmentResults +
                ", certificationStatus='" + certificationStatus + '\'' +
                ", completionDate=" + completionDate +
                '}';
    }
}
