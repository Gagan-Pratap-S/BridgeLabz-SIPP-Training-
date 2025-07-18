package Day4_Methods;

    import java.util.Scanner;

public class NaturalNumberSum {

   
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

    
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a natural number greater than 0.");
            return;
        }

        
        int recursiveResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        //
        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using formula:   " + formulaResult);

        
        if (recursiveResult == formulaResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("There is a mismatch in the results.");
        }

        scanner.close();
    }
}


