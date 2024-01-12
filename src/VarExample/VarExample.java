package VarExample;
import java.util.ArrayList;

public class VarExample {
    public static void main(String[] args) {
        // Before Java 10
        ArrayList<String> myListBeforeJava10 = new ArrayList<String>();
        myListBeforeJava10.add("Apple");
        myListBeforeJava10.add("Banana");

        // After Java 10
        var myListAfterJava10 = new ArrayList<String>();
        myListAfterJava10.add("Orange");
        myListAfterJava10.add("Grapes");

        // Print the elements
        System.out.println("Before Java 10: " + myListBeforeJava10);
        System.out.println("After Java 10: " + myListAfterJava10);
    }
}
