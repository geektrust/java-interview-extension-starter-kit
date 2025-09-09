public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide input: <numTravelers> <destination> <tripType>");
            return;
        }
        handle(args[0]);
    }

    private static void handle(String input) {
        String[] inputList = input.trim().split(" ");
        if (inputList.length < 3) {
            System.out.println("Invalid input. Format: <numTravelers> <destination> <tripType>");
            return;
        }

        String input1 = inputList[0];
        String input2 = inputList[1];
        String input3 = inputList[2];

        // Forward inputs to TravelCost
        String[] travelCostArgs = {input1 + " " + input2 + " " + input3}; // pass as single string
        TravelCost.main(travelCostArgs);
    }
}
