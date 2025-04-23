package iub.aviation.Nishat;

import java.time.LocalDateTime;

public class Training {

    private String trainingId;
    private String trainingName;
    private int courseDuration; // in days or hours
    private String eligibilityRequirements;
    private String status;
    private String certificationStatus;
    private LocalDateTime completionDate;

    // Constructors
    public Training() {}

    public Training(String trainingId, String trainingName, int courseDuration, String eligibilityRequirements,
                    String status, String certificationStatus, LocalDateTime completionDate) {
        this.trainingId = trainingId;
        this.trainingName = trainingName;
        this.courseDuration = courseDuration;
        this.eligibilityRequirements = eligibilityRequirements;
        this.status = status;
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

    public String getCertificationStatus() {
        return certificationStatus;
    }

    public void setCertificationStatus(String certificationStatus) {
        this.certificationStatus = certificationStatus;
    }

    public LocalDateTime getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDateTime completionDate) {
        this.completionDate = completionDate;
    }

    @Override
    public String toString() {
        return "Training{" +
                "trainingId='" + trainingId + '\'' +
                ", trainingName='" + trainingName + '\'' +
                ", courseDuration=" + courseDuration +
                ", eligibilityRequirements='" + eligibilityRequirements + '\'' +
                ", status='" + status + '\'' +
                ", certificationStatus='" + certificationStatus + '\'' +
                ", completionDate=" + completionDate +
                '}';
    }
}
