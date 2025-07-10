package Day4_Methods;

 public class NumberChecker {

    
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2); 
        }
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10]; 
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }

        return result;
    }

        public static void main(String[] args) {
        int number = 221144;

        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        int[] digits = getDigitsArray(number);
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int digitSum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + digitSum);

        int squareSum = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + squareSum);

        boolean isHarshad = isHarshad(number, digits);
        System.out.println("Is Harshad number: " + isHarshad);

        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] pair : frequency) {
            System.out.println("Digit: " + pair[0] + ", Frequency: " + pair[1]);
        }
    }
}    

