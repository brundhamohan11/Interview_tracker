public class Interview {

    private int id;
    private String companyName;
    private String role;
    private String interviewDate;
    private String status;

    // Constructor without id
    public Interview(String companyName, String role, String interviewDate, String status) {
        this.companyName = companyName;
        this.role = role;
        this.interviewDate = interviewDate;
        this.status = status;
    }

    // Constructor with id
    public Interview(int id, String companyName, String role, String interviewDate, String status) {
        this.id = id;
        this.companyName = companyName;
        this.role = role;
        this.interviewDate = interviewDate;
        this.status = status;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getRole() {
        return role;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}