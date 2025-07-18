import java.util.ArrayList;
import java.util.List;

public class MovieTime {

    public static void insertShow(List<Show> showList, Show newShow) {
        int newTime = newShow.getTimeAsInt();

        for (int i = 0; i < showList.size(); i++) {
            if (newTime < showList.get(i).getTimeAsInt()) {
                showList.add(i, newShow); 
                return;
            }
        }

        showList.add(newShow); 
    }

    public static void main(String[] args) {
        List<Show> showtimes = new ArrayList<>();
        showtimes.add(new Show("Dune: Part Two", "12:00"));
        showtimes.add(new Show("The Batman", "14:00"));
        showtimes.add(new Show("Wonka", "16:00"));

        Show newShow = new Show("Inside Out 2", "13:30");
        insertShow(showtimes, newShow);

        System.out.println("📅 Updated Showtimes:");
        for (Show s : showtimes) {
            System.out.println(s);
        }
    }
}