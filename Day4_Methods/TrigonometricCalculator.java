package Day4_Methods;
public class TrigonometricCalculator {

    
    public double[] calculateTrigonometricFunctions(double angle) {
       
        double radians = Math.toRadians(angle);

       
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        
        return new double[] { sinValue, cosValue, tanValue };
    }

    public static void main(String[] args) {
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        double angle = 45.0; 
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        System.out.printf("Angle: %.2f degrees%n", angle);
        System.out.printf("Sine: %.5f%n", results[0]);
        System.out.printf("Cosine: %.5f%n", results[1]);
        System.out.printf("Tangent: %.5f%n", results[2]);
    }
}
