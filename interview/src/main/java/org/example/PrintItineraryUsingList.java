package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintItineraryUsingList {

    public static List<String> arrangeTrips(List<String> tripTickets) {
        List<String> sequence = new ArrayList<>();
        String startingPoint = null;

        // Find the starting point (assuming there's only one trip starting the journey)
        for (String trip : tripTickets) {
            String[] parts = trip.split("-");
            if (!containsDestination(tripTickets, parts[0])) { // If origin is not present as a destination, it's the starting point
                startingPoint = parts[0];
                break;
            }
        }

        // Build the sequence
        String current = startingPoint;
        while (current != null) {
            int index = findNextDestinationIndex(tripTickets, current);
            if (index != -1) {
                sequence.add(current + "-" + tripTickets.get(index).split("-")[1]);
                current = tripTickets.get(index).split("-")[1];
            } else {
                current = null; // No more destinations found
            }
        }

        return sequence;
    }

    private static boolean containsDestination(List<String> tickets, String destination) {
        for (String ticket : tickets) {
            if (ticket.split("-")[1].equals(destination)) {
                return true;
            }
        }
        return false;
    }

    private static int findNextDestinationIndex(List<String> tickets, String origin) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).startsWith(origin + "-")) {
                return i;
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        List<String> tripTickets = Arrays.asList("KOL-BOM", "BOM-DEL", "HYD-KOL");
        List<String> sequence = arrangeTrips(tripTickets);
        System.out.println(sequence);
    }
}
