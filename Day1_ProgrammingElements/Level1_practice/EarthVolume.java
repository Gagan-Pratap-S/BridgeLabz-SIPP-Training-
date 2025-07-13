package Day1_ProgrammingElements.Level1_practice;

public class EarthVolume {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378;

        // Pi constant
        double pi = Math.PI;

        // Volume of the Earth in cubic kilometers using the sphere volume formula
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Conversion factor: 1 km^3 = approx 0.239913 mi^3
        double km3ToMi3 = 0.239913;

        // Convert volume to cubic miles
        double volumeMi3 = volumeKm3 * km3ToMi3;

        // Print the result
        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm3 +
            " and cubic miles is " + volumeMi3
        );
    }
}
