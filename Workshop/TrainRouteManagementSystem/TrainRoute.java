package TrainRouteManagementSystem;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class TrainRoute {
    private List<Station> routeStations;

    public TrainRoute() {
        this.routeStations = new LinkedList<>();
    }
    public void addStation(Station station) {
        routeStations.add(station);
        System.out.println("Station added: " + station.getName());
        
    }
    public void removeStation(Station stationName) {
        Iterator<Station> iterator = routeStations.iterator();
        while (iterator.hasNext()) {
            Station station = iterator.next();
            if (station.getName().equals(station.getName())) {
                iterator.remove();
                System.out.println("Station removed: " + station.getName());
                return;
            }
        }
        System.out.println("Station not found: " + stationName.getName());
        }
    public void displayRoute() {
        System.out.println("Train Route:");
        if (routeStations.isEmpty()) {
            System.out.println("No stations in the route.");
        } else {
            for (Station station : routeStations) {
                System.out.println(station.getName());
            }
        }
    }
}

