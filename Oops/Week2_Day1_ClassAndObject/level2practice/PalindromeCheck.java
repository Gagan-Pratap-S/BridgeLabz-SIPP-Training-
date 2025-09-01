package Week2_Day1_ClassAndObject.level2practice;


import java.util.Scanner;

public class PalindromeCheck {
    String text;

    public boolean isPalindrome() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) rev += text.charAt(i);
        return text.equalsIgnoreCase(rev);
    }

    public void displayResult() {
        System.out.println("Is Palindrome: " + isPalindrome());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeCheck obj = new PalindromeCheck();
        System.out.print("Enter text: ");
        obj.text = sc.nextLine();
        obj.displayResult();
        sc.close();
    }
}
