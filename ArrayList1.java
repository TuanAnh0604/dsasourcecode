import java.util.ArrayList;

public class ArrayList1 { 
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        
        // Add elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Access an element by index
        System.out.println("Element at index 1: " + list.get(1));  // O(1)
        
        // Remove an element
        list.remove(0);  // O(n) due to shifting elements
        
        // Search for an element
        if (list.contains(20)) {
            System.out.println("Found 20 in the list");
        }
    }
}

