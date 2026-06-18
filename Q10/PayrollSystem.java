import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class PayrollSystem {
    static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        // Add employees
        staff.add(new FullTimeEmployee("Ram", 50000));
        staff.add(new Contractor("Sita", 200, 120));
        staff.add(new FullTimeEmployee("Hari", 60000));
        staff.add(new Contractor("Gita", 250, 100));
        // File writing
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("payroll_report.txt")
            );

            writer.write("=== Payroll Report ===\n\n");

            for (Employee emp : staff) {
                writer.write(
                        "Name: " + emp.getName() +
                                " | Pay: " + emp.calculatePay() +
                                "\n"
                );
            }
            writer.close();
            System.out.println("Payroll report generated successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
