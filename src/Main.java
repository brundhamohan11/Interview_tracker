import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InterviewDAO dao = new InterviewDAO();

        while (true) {

            System.out.println("\n===== SMART INTERVIEW TRACKER =====");
            System.out.println("1. Add Interview");
            System.out.println("2. View Interviews");
            System.out.println("3. Update Interview Status");
            System.out.println("4. Delete Interview");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Company Name: ");
                    String company = sc.nextLine();

                    System.out.print("Enter Role: ");
                    String role = sc.nextLine();

                    System.out.print("Enter Interview Date (YYYY-MM-DD): ");
                    String date = sc.nextLine();

                    System.out.print("Enter Status: ");
                    String status = sc.nextLine();

                    Interview interview = new Interview(company, role, date, status);
                    dao.addInterview(interview);
                    break;

                case 2:

                    dao.viewInterviews();
                    break;

                case 3:

                    System.out.print("Enter Interview ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Status: ");
                    String newStatus = sc.nextLine();

                    dao.updateStatus(updateId, newStatus);
                    break;

                case 4:

                    System.out.print("Enter Interview ID: ");
                    int deleteId = sc.nextInt();

                    dao.deleteInterview(deleteId);
                    break;

                case 5:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}