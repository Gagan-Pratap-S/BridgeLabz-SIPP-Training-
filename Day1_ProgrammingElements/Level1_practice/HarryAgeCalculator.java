package Day1_ProgrammingElements.Level1_practice;

//Creating Class with name HarryAgeCalculator indicating the purpose is to display result.
public class HarryAgeCalculator {
    public static void main(String[] args) {
        // Creating int variable birthYear and assigning value 2000.
        int birthYear = 2000;
        // Creating int variable currentYear and assigning value 2024.
        int currentYear = 2024;
        // creating int variable age and assigning value currentYear - birthYear, which calculate age.
        int age = currentYear - birthYear;
        // print the result
        System.out.println("Harry's age in " + currentYear + " is " + age);
    }
}
