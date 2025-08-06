package Workshop;
import java.util.LinkedList;

// Base Checkpoint class
abstract class Checkpoint {
    protected String checkpointId;
    protected String locationName;
    protected double distanceFromLast;
    protected int expectedDuration;
    protected int actualDuration;

    public Checkpoint(String checkpointId, String locationName, double distanceFromLast,
                      int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    public String getCheckpointId() {
        return checkpointId;
    }

    public String getLocationName() {
        return locationName;
    }

    public double getDistanceFromLast() {
        return distanceFromLast;
    }

    public int getExpectedDuration() {
        return expectedDuration;
    }

    public int getActualDuration() {
        return actualDuration;
    }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract double calculatePenalty();
    public abstract String getType();
    public abstract boolean isCritical();
}

class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    @Override
    public double calculatePenalty() {
        return isDelayed() ? (actualDuration - expectedDuration) * 2.0 : 0.0;
    }

    @Override
    public String getType() {
        return "Delivery";
    }

    @Override
    public boolean isCritical() {
        return true;
    }
}

class FuelCheckpoint extends Checkpoint {
    public FuelCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    @Override
    public double calculatePenalty() {
        return isDelayed() ? 10.0 : 0.0;
    }

    @Override
    public String getType() {
        return "Fuel";
    }

    @Override
    public boolean isCritical() {
        return true;
    }
}

class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    @Override
    public double calculatePenalty() {
        if (!isDelayed()) return 0.0;
        int delay = actualDuration - expectedDuration;
        return delay > 30 ? delay * 0.5 : 0.0;
    }

    @Override
    public String getType() {
        return "Rest";
    }

    @Override
    public boolean isCritical() {
        return false;
    }
}

class RouteLinkedList<T extends Checkpoint> {
    private class Node {
        T data;
        Node next;
        Node(T data) {
            this.data = data;
        }
    }

    private Node head;

    public void addCheckpoint(T checkpoint) {
        Node newNode = new Node(checkpoint);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = newNode;
        }
    }

    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;
        if (head.data.getCheckpointId().equals(checkpointId)) {
            head = head.next;
            return true;
        }

        Node curr = head;
        while (curr.next != null) {
            if (curr.next.data.getCheckpointId().equals(checkpointId)) {
                curr.next = curr.next.next;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node curr = head;
        while (curr != null) {
            if (curr.data.getCheckpointId().equals(checkpointId)) {
                return curr.data;
            }
            curr = curr.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0.0;
        Node curr = head;
        while (curr != null) {
            total += curr.data.getDistanceFromLast();
            curr = curr.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double penalty = 0.0;
        Node curr = head;
        while (curr != null) {
            penalty += curr.data.calculatePenalty();
            curr = curr.next;
        }
        return penalty;
    }

    public void printRoute() {
        Node curr = head;
        int index = 1;
        while (curr != null) {
            T cp = curr.data;
            String status = cp.isDelayed() ? "Delayed" : "On Time";
            System.out.printf("%d. %sCheckpoint - %s - %s - Penalty: %.1f%n",
                    index++, cp.getType(), cp.getLocationName(), status, cp.calculatePenalty());
            curr = curr.next;
        }
    }

    public boolean checkCriticalCheckpointsPresent() {
        boolean hasDelivery = false, hasFuel = false;
        Node curr = head;
        while (curr != null) {
            if (curr.data instanceof DeliveryCheckpoint) hasDelivery = true;
            if (curr.data instanceof FuelCheckpoint) hasFuel = true;
            curr = curr.next;
        }
        return hasDelivery && hasFuel;
    }
}

class Driver {
    private String driverId;
    private String name;
    private RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public void addCheckpoint(Checkpoint cp) {
        routeHistory.addCheckpoint(cp);
    }

    public void printSummary() {
        System.out.printf("Driver: %s – %s%n", driverId, name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();
        double distance = routeHistory.computeTotalDistance();
        double penalty = routeHistory.computeTotalPenalty();
        double score = distance - penalty;
        System.out.printf("Total Distance: %.1f km%n", distance);
        System.out.printf("Total Penalty: %.1f%n", penalty);
        System.out.printf("Route Score: %.1f%n", score);
        System.out.println("Critical Route Check: " + 
            (routeHistory.checkCriticalCheckpointsPresent() ? 
            "All required checkpoints present" : "Missing critical checkpoints"));
    }
}


public class RouteTrackerSyatem {
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Kavita Nair");

        driver.addCheckpoint(new DeliveryCheckpoint("CP01", "Warehouse A", 30.0, 60, 70)); // 10*2 = 20
        driver.addCheckpoint(new FuelCheckpoint("CP02", "Pump 12", 20.0, 15, 15));         // On time
        driver.addCheckpoint(new RestCheckpoint("CP03", "Motel X", 40.0, 60, 65));         // 5 > 30? No => 0
        driver.addCheckpoint(new DeliveryCheckpoint("CP04", "Client Hub", 30.0, 45, 60));  // 15*2 = 30

        driver.printSummary();
    }
}
