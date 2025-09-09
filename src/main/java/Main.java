private static void handle(String input) {
    String[] inputList = input.trim().split(" ");
    String input1 = inputList[0];
    String input2 = inputList[1];
    String input3 = inputList[2];

    // Pass inputs to TravelCost
    String[] travelCostArgs = {input1, input2, input3};
    TravelCost.main(travelCostArgs);
}
