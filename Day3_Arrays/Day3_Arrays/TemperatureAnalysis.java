package Day3_Arrays; 
public class TemperatureAnalysis {
    public static void main(String[] args) {
        float[][] temps = new float[7][24];

        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 24; j++)
            temps[i][j] = (float)(Math.random() * 40);

            float max = temps[0][0];
            float min = temps[0][0];
            int hottestDay = 0; 
            int coldestDay = 0;
    
            for (int i = 0; i < 7; i++) {
                float sum = 0;
                for (int j = 0; j < 24; j++) {
                    float temp = temps[i][j];
                    sum += temp;
    
                    if (temp > max) {
                        max = temp;
                        hottestDay = i;
                    }
                    if (temp < min) {
                        min = temp;
                        coldestDay = i;
                    }
                }
                float average = (sum / 24);
                System.out.println("Day " + (i + 1) + " average: " + (average));
            }
    
            System.out.println("Hottest day: Day " + (hottestDay));
            System.out.println("Coldest day: Day " + (coldestDay));
        }
    }
