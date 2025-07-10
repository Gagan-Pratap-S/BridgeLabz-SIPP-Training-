package Day4_Methods;
public class RandomStatsCalculator {

    
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        return numbers;
    }

    
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        RandomStatsCalculator calculator = new RandomStatsCalculator();

      
        int[] randomNumbers = calculator.generate4DigitRandomArray(5);

        System.out.print("Generated 4-digit numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

  
        double[] results = calculator.findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f%n", results[0]);
        System.out.println("Minimum: " + (int)results[1]);
        System.out.println("Maximum: " + (int)results[2]);
    }
}
