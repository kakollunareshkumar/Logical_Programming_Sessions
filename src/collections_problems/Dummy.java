package collections_problems;
import java.util.*;
public class Dummy {
    // Java program to demonstrate
// computeIfPresent(Key, BiFunction) method.
        public static void main(String[] args)
        {

            // Create a HashMap and add some values
            HashMap<String, Integer> wordCount = new HashMap<>();
            wordCount.put("Geeks", 1);
            wordCount.put("for", 2);
            wordCount.put("geeks", 3);

            // print HashMap details
            System.out.println("Hashmap before operation :\n "
                    + wordCount);

            // provide new value for keys which is present
            // using computeIfPresent method
            wordCount.computeIfPresent("Geek",
                    (key, val) -> val + 100);

            // print new mapping
            System.out.println("HashMap after operation :\n "
                    + wordCount);
        }
    }

