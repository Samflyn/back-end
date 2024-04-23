package org.example;

import java.util.HashMap;
import java.util.Map;

public class PrintItineraryUsingMap {

    public static void main(String[] args) {
        // Define connections as a HashMap (source -> destination)
        Map<String, String> connections = new HashMap<>();
        connections.put("Chennai", "Bangalore");
        connections.put("Bombay", "Delhi");
        connections.put("Goa", "Chennai");
        connections.put("Delhi", "Goa");

        // Find the starting point (no incoming connection)
        String startingPoint = null;
        for (String destination : connections.keySet()) {
            if (!connections.containsValue(destination)) {
                startingPoint = destination;
                break;
            }
        }

        // Check if a valid starting point is found
        if (startingPoint == null) {
            System.out.println("Invalid itinerary data. No starting point found.");
            return;
        }

        // Build the itinerary string
        StringBuilder itinerary = new StringBuilder();
        String current = startingPoint;
        while (current != null) {
            itinerary.append(current);
            current = connections.get(current);
            if (current != null) {
                itinerary.append("->");
            }
        }

        // Print the itinerary
        System.out.println(itinerary);
    }
}
