import java.util.Scanner;

public class LinearWordSearch {

         
    
    public static int linearSearchWord(String paragraph, String targetWord) {
        if (paragraph == null || targetWord == null || paragraph.isEmpty() || targetWord.isEmpty()) {
            return -1;
        }

        String[] words = paragraph.split("\\s+"); 

        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(targetWord)) {
              
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the paragraph:");
        String paragraph = scanner.nextLine();

        System.out.println("Enter the word to search:");
        String targetWord = scanner.nextLine();

        int result = linearSearchWord(paragraph, targetWord);

        if (result != -1) {
            System.out.println("The word '" + targetWord + "' was found at word index " + result + ".");
        } else {
            System.out.println("The word '" + targetWord + "' was not found in the paragraph.");
        }

        scanner.close();
    }
}