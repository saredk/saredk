package projects;

import java.util.HashMap;
import java.util.Map;

/*
Write a program to print out duplicate elements from an Array of Strings?
 */
public class project10 {
        public static void main(String[] args) {
            String[] stringArray = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi"};

            Map<String, Integer> elementCountMap = new HashMap<>();

            for (String element : stringArray) {
                elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
            }

            System.out.println("Duplicate elements in the array are:");
            for (Map.Entry<String, Integer> entry : elementCountMap.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }


