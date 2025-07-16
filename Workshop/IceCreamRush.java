
package Workshop;

class Flavor {
     String name;
     int sales;

    
    public Flavor(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }
    
    public String getName() {
        return name;
    }
}

class bubbleSort {
    public static void sort(Flavor[] flavors) {
        int n = flavors.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (flavors[j].sales > flavors[j + 1].sales) {
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }
}


public class IceCreamRush {
    public static void main(String[] args) {
        Flavor[] flavors = {
            new Flavor("Vanilla", 150),
            new Flavor("Chocolate", 200),
            new Flavor("Strawberry", 100),
            new Flavor("Mint", 120),
            new Flavor("Badam", 180),
            new Flavor("Pistachio", 130),
            new Flavor("Mango", 160),
            new Flavor("Orange", 250)
        };

        bubbleSort.sort(flavors);

        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + ": " + flavor.sales);
        }
    }
}
 