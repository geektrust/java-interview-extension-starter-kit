import java.util.*;

public class TravelCost {

    public static void main(String[] args) {
        /*
         * Format of the 'args' array: `<Input 1> <Input 2> <Input 3>`
         * Example: ["3 Paris round"]
         */
        handle(args[0]);
    }

    private static void handle(String input) {
        String trimmedInput = input.trim();
        String[] inputList = trimmedInput.split(" ");

        if (inputList.length < 3) {
            System.out.println("Invalid input. Format: <numTravelers> <destination> <tripType>");
            return;
        }

        String numTravelersStr = inputList[0];
        String destinationName = inputList[1];
        String tripTypeStr = inputList[2];

        int numTravelers = Integer.parseInt(numTravelersStr);

        // get base cost for destination
        int baseCost = 0;
        if (destinationName.equals("Paris")) {
            baseCost = 250;
        } else if (destinationName.equals("Tokyo")) {
            baseCost = 450;
        } else if (destinationName.equals("Cairo")) {
            baseCost = 300;
        } else {
            System.out.println("INVALID DESTINATION");
            return;
        }

        // get multiplier for trip type
        int multiplier = 0;
        if (tripTypeStr.equalsIgnoreCase("one-way")) {
            multiplier = 1;
        } else if (tripTypeStr.equalsIgnoreCase("round")) {
            multiplier = 2;
        } else {
            System.out.println("INVALID TRIP TYPE");
            return;
        }

        // calculate total cost
        int costPerPerson = baseCost * multiplier;
        int totalCost = costPerPerson * numTravelers;

        System.out.println("Total Flight Cost: " + totalCost);
    }
}
