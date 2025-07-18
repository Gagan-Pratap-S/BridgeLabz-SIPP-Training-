package Day4_Methods;
public class WindChillCalculator {

    
    public double calculateWindChill(double temperature, double windSpeed) {
        if (temperature > 50 || windSpeed < 3) {
            System.out.println("Wind chill is only valid for temperatures <= 50°F and wind speed >= 3 mph.");
            return temperature;
        }
        
        return 35.74 + 0.6215 * temperature 
               - 35.75 * Math.pow(windSpeed, 0.16) 
               + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        WindChillCalculator calculator = new WindChillCalculator();

        
        double temperature = 30.0;  
        double windSpeed = 10.0;     

        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
    }
}
