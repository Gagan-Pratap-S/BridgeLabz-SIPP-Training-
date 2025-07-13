package Day1_ProgrammingElements.Level1_practice;

public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Original course fee
        double fee = 125000;

        // Discount percentage
        double discountPercent = 10;

        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        // Print the result
        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );
    }
}
