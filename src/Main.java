import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Declare and instantiate an ArrayList
        ArrayList<String> kombuchaFlavors = new ArrayList<>();

        // Add elements to the ArrayList
        kombuchaFlavors.add("Ginger-Lemon");
        kombuchaFlavors.add("Blueberry-Basil");
        kombuchaFlavors.add("Raspberry-Lime");

        // Access elements from the ArrayList
        String favoriteFlavor = kombuchaFlavors.get(0); // Accesses the first element, "Ginger-Lemon"
        System.out.println("Favorite flavor: " + favoriteFlavor);

        kombuchaFlavors.set(0, "Mango-Ginger"); // Updates "Ginger-Lemon" to "Mango-Ginger"

        kombuchaFlavors.remove("Blueberry-Basil"); // Removes "Blueberry-Basil" from the list

        System.out.println("Available Flavors:");
        for (String flavor : kombuchaFlavors) {
            System.out.println(flavor);
        }
    }
}
