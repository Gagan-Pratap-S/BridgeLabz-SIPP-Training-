package Day4_Methods;


    import java.util.Scanner;

public class NumberAnalysis {


    public boolean isPositive(int number) {
        return number >= 0;
    }


    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    
    public int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberAnalysis analysis = new NumberAnalysis();

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        System.out.println("\nAnalysis:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number " + num + " is ");
            if (analysis.isPositive(num)) {
                System.out.print("positive and ");
                if (analysis.isEven(num)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("negative.");
            }
        }

        
        int comparison = analysis.compare(numbers[0], numbers[4]);
        System.out.println("\nComparison of first and last number:");
        if (comparison == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (comparison == 0) {
            System.out.println("First and last numbers are equal.");
        } else {
            System.out.println("First number is less than the last number.");
        }

        scanner.close();
    }
}


