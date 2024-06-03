package SalaryCalculator;

public class salaryCalculator {
    public String calculateSalary() {
        String carrier = "Software Tester";

        float perDaySalary = 1194.433333333f;
        float perHourSalary = 149.304166667f;
        int totalDaysInMonth = 20;

        double totalSalaryInMonth = perDaySalary * totalDaysInMonth;

       return "My Current Salary In The Month Of April Is " + totalSalaryInMonth;
    }
}
