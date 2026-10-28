
public class Job {

    private String company;
    private String role;
    private double minimumPercentage;
    private int maximumBacklogs;
    private int requiredGraduationYear;

    public Job(
            String company,
            String role,
            double minimumPercentage,
            int maximumBacklogs,
            int requiredGraduationYear
    ) {
        this.company = company;
        this.role = role;
        this.minimumPercentage = minimumPercentage;
        this.requiredGraduationYear = requiredGraduationYear;
    }

    public String getCompany() {
        return this.company;
    }

    public String getRole() {
        return this.role;
    }

    public double getMinimumPercentage() {
        return this.minimumPercentage;
    }

    public int getMaximumBacklogs() {
        return this.maximumBacklogs;
    }

    public int getRequiredGraduationYear() {
        return this.requiredGraduationYear;
    }
}
