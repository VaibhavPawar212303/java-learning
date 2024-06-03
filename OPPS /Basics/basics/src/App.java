import SalaryCalculator.salaryCalculator;
import WeatherForcasting.weatherForcasting;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World! Learning About Java Basics");

        // create object of specified class
        salaryCalculator s1 = new salaryCalculator();
        weatherForcasting w1 = new weatherForcasting();

        String ClassName = "weatherForcasting";

        // switch case to access class
        switch (ClassName) {
            case "weatherForcasting":
                System.out.println("Today's Weather: " + w1.forcastWeather("Rain"));
                break;
            case "salaryCalculator":
                System.out.println("My Current Salary: " + s1.calculateSalary());
                break;
            default:
                break;
        }
    }
}
