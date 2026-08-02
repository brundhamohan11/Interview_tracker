import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InterviewDAO {

    // Add Interview
    public void addInterview(Interview interview) {

        String sql = "INSERT INTO interviews(company_name, role, interview_date, status) VALUES (?, ?, ?, ?)";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, interview.getCompanyName());
            ps.setString(2, interview.getRole());
            ps.setString(3, interview.getInterviewDate());
            ps.setString(4, interview.getStatus());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Interview Added Successfully!");
            }

            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // View Interviews
    public void viewInterviews() {

        String sql = "SELECT * FROM interviews";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("--------------------------------");
                System.out.println("ID : " + rs.getInt("id"));
                System.out.println("Company : " + rs.getString("company_name"));
                System.out.println("Role : " + rs.getString("role"));
                System.out.println("Interview Date : " + rs.getString("interview_date"));
                System.out.println("Status : " + rs.getString("status"));
            }

            rs.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Update Interview Status
    public void updateStatus(int id, String status) {

        String sql = "UPDATE interviews SET status=? WHERE id=?";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, status);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Interview Status Updated Successfully!");
            } else {
                System.out.println("Interview ID Not Found!");
            }

            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Interview
    public void deleteInterview(int id) {

        String sql = "DELETE FROM interviews WHERE id=?";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Interview Deleted Successfully!");
            } else {
                System.out.println("Interview ID Not Found!");
            }

            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}