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

    private static void handle(String input) {
        String[] inputList = input.trim().split(" ");
        if (inputList.length < 3) {
            System.out.println("Invalid input. Format: <numTravelers> <destination> <tripType>");
            return;
        }

        int numTravelers = Integer.parseInt(inputList[0]);
        String destinationName = inputList[1];
        String tripTypeStr = inputList[2];

        try {
            Destination destination = Destination.of(destinationName);
            TripType tripType = TripType.of(tripTypeStr);

            TravelCostCalculator calculator = new TravelCostCalculator();
            int totalCost = calculator.calculate(numTravelers, destination, tripType);

            System.out.println("Total Flight Cost: " + totalCost);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

/* ---------------- Domain Models ---------------- */

class TripType {
    private final String name;
    private final int multiplier;

    private TripType(String name, int multiplier) {
        this.name = name;
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public String getName() {
        return name;
    }

    public static TripType of(String type) {
        switch (type.toLowerCase()) {
            case "one-way": return new TripType("one-way", 1);
            case "round":   return new TripType("round", 2);
            default: throw new IllegalArgumentException("INVALID TRIP TYPE");
        }
    }
}

class Destination {
    private static final Map<String, Integer> COST_MAP = new HashMap<>();
    static {
        COST_MAP.put("Paris", 250);
        COST_MAP.put("Tokyo", 450);
        COST_MAP.put("Cairo", 300);
    }

    private final String name;
    private final int baseCost;

    private Destination(String name, int baseCost) {
        this.name = name;
        this.baseCost = baseCost;
    }

    public int getBaseCost() {
        return baseCost;
    }

    public String getName() {
        return name;
    }

    public static Destination of(String name) {
        Integer cost = COST_MAP.get(name);
        if (cost == null) {
            throw new IllegalArgumentException("INVALID DESTINATION");
        }
        return new Destination(name, cost);
    }
}

class TravelCostCalculator {
    public int calculate(int numTravelers, Destination destination, TripType tripType) {
        return numTravelers * tripType.getMultiplier() * destination.getBaseCost();
    }
}
