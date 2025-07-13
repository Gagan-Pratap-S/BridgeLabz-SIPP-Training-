package Day2_controlFlows;
public class dayofweek {
    public static void main(String[] args) {
        
        if (args.length != 3) {
            System.out.println("Please provide date in format: <month> <day> <year>");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

       
        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }

        int K = y % 100;
        int J = y / 100;

        
        int h = (d + 13 * (m + 1) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;

        
        int dayOfWeek = (h + 6) % 7;

        
        System.out.println("Day of the week (0=Sunday, ..., 6=Saturday): " + dayOfWeek);
    }
}

 
    

