import java.util.*;

/*
 ***********************************************
 * This is the driver code. Don't change it!!!
 ***********************************************
 */
public class TravelCost {

    public static void main(String[] args) {
        /*
         * Format of the 'args' array: `<Input 1> <Input 2> <Input 3>`
         * Example: ["3 Paris round"]
         */
        handle(args[0]);
    }

    /*
     * Inefficient implementation to calculate total flight cost.
     * Refactor this to improve readability, maintainability, and efficiency.
     */
    private static void handle(String input) {
        String[] inputList = input.trim().split(" ");
        int numTravelers = Integer.parseInt(inputList[0]);
        String destination = inputList[1];
        String tripType = inputList[2];

        // Inefficient dataset representation
        Map<String, Integer> costMap = new HashMap<>();
        costMap.put("Paris", 250);
        costMap.put("Tokyo", 450);
        costMap.put("Cairo", 300);

        int totalCost = 0;

        // Redundant if-else structure
        if (destination.equals("Paris")) {
            if (tripType.equals("round")) {
                totalCost = numTravelers * 2 * costMap.get("Paris");
            } else if (tripType.equals("one-way")) {
                totalCost = numTravelers * costMap.get("Paris");
            }
        } else if (destination.equals("Tokyo")) {
            if (tripType.equals("round")) {
                totalCost = numTravelers * 2 * costMap.get("Tokyo");
            } else if (tripType.equals("one-way")) {
                totalCost = numTravelers * costMap.get("Tokyo");
            }
        } else if (destination.equals("Cairo")) {
            if (tripType.equals("round")) {
                totalCost = numTravelers * 2 * costMap.get("Cairo");
            } else if (tripType.equals("one-way")) {
                totalCost = numTravelers * costMap.get("Cairo");
            }
        } else {
            System.out.println("INVALID DESTINATION");
            return;
        }

        System.out.println("Total Flight Cost: " + totalCost);
    }
}
