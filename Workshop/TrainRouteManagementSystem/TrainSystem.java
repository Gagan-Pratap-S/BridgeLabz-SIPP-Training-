package TrainRouteManagementSystem;
public class TrainSystem {
     public static void main(String[] args) {
         TrainRoute trainRoute = new TrainRoute();
         
         Station station1 = new Station("Station A");
         Station station2 = new Station("Station B");
         Station station3 = new Station("station C");
         
         trainRoute.addStation(station1);
         trainRoute.addStation(station2);
         trainRoute.addStation(station3);
         
         trainRoute.displayRoute();
         
         trainRoute.removeStation(station2);
         
         trainRoute.displayRoute();
     }
}
