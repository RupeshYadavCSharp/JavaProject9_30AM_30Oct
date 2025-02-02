package pack_Internship.Employee;

import java.sql.*;
import java.util.Scanner;

public class Employee_2 {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "Nagpur123!";
        Connection connection = DriverManager.getConnection(url, user, password);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Get Employee by ID");
            System.out.println("2. Get Employee Details by Name");
            System.out.println("3. Get Employees by Department");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    getEmployeeById(connection, scanner);
                    break;
                case 2:
                    getEmployeeDetailsByName(connection, scanner);
                    break;
                case 3:
                    getEmployeesByDepartment(connection, scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    connection.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void getEmployeeById(Connection connection, Scanner scanner) throws SQLException {
        String query = """
                SELECT e.emp_id, ed.name, ed.address, ed.age, ed.dob, ed.gender,
                       ed2.dept_description, ed2.dept_name
                FROM "Employee" e
                JOIN "Employee detail" ed ON ed.emp_detail_id = e.emp_detail_id
                JOIN "Employee department" ed2 ON ed2.emp_dept_id = e.emp_dept_id
                WHERE e.emp_id = ?;
                """;

        PreparedStatement pstmt = connection.prepareStatement(query);
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        pstmt.setInt(1, empId);
        ResultSet resultSet = pstmt.executeQuery();

        System.out.println("Data by emp_id:");
        if (resultSet.next()) {
            System.out.println("Emp ID: " + resultSet.getInt("emp_id"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Age: " + resultSet.getInt("age"));
            System.out.println("Address: " + resultSet.getString("address"));
            System.out.println("DOB: " + resultSet.getDate("dob"));
            System.out.println("Gender: " + resultSet.getString("gender"));
            System.out.println("Department: " + resultSet.getString("dept_name"));
            System.out.println("Department Description: " + resultSet.getString("dept_description"));
        } else {
            System.out.println("No employee found with emp_id = " + empId);
        }
    }

    public static void getEmployeeDetailsByName(Connection connection, Scanner scanner) throws SQLException {
        String query = """
                SELECT e.emp_id, ed.name, ed.address, ed.age, ed.dob, ed.gender,
                       ed2.dept_name, ed2.dept_description
                FROM "Employee" e
                JOIN "Employee detail" ed ON e.emp_detail_id = ed.emp_detail_id
                JOIN "Employee department" ed2 ON ed2.emp_dept_id = e.emp_dept_id
                WHERE ed.name = ?;
                """;

        PreparedStatement pstmt = connection.prepareStatement(query);
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        pstmt.setString(1, empName);
        ResultSet resultSet = pstmt.executeQuery();

        System.out.println("Data by name:");
        if (resultSet.next()) {
            System.out.println("Emp ID: " + resultSet.getInt("emp_id"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Age: " + resultSet.getInt("age"));
            System.out.println("Address: " + resultSet.getString("address"));
            System.out.println("DOB: " + resultSet.getDate("dob"));
            System.out.println("Gender: " + resultSet.getString("gender"));
            System.out.println("Department: " + resultSet.getString("dept_name"));
            System.out.println("Department Description: " + resultSet.getString("dept_description"));
        } else {
            System.out.println("No employee found with name = " + empName);
        }
    }

    public static void getEmployeesByDepartment(Connection connection, Scanner scanner) throws SQLException {
        String query = """
                SELECT e.emp_id, ed.name, ed.address, ed.age, ed.dob, ed.gender,
                       ed2.dept_name, ed2.dept_description
                FROM "Employee" e
                JOIN "Employee detail" ed ON e.emp_detail_id = ed.emp_detail_id
                JOIN "Employee department" ed2 ON ed2.emp_dept_id = e.emp_dept_id
                WHERE ed2.dept_name = ?;
                """;

        PreparedStatement pstmt = connection.prepareStatement(query);
        System.out.print("Enter Department Name: ");
        String departmentName = scanner.nextLine();
        pstmt.setString(1, departmentName);
        ResultSet resultSet = pstmt.executeQuery();

        System.out.println("Employees in Department: " + departmentName);
        boolean hasData = false;
        while (resultSet.next()) {
            hasData = true;
            System.out.println("Emp ID: " + resultSet.getInt("emp_id"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Age: " + resultSet.getInt("age"));
            System.out.println("Address: " + resultSet.getString("address"));
            System.out.println("DOB: " + resultSet.getDate("dob"));
            System.out.println("Gender: " + resultSet.getString("gender"));
            System.out.println("Department: " + resultSet.getString("dept_name"));
            System.out.println("Department Description: " + resultSet.getString("dept_description"));
        }
        if (!hasData) {
            System.out.println("No employees found in the department: " + departmentName);
        }
    }
}
