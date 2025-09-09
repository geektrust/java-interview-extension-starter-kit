public class Main{

    /*
     ***********************************************
     * This is the driver code. Don't change it!!!
     * *********************************************
     */
    public static void main(String[] args){
        /*
         * Format of the 'args' array: `<Input 1> <Input 2> <Input 3>`
         * Example: ["Input1 Input2 Input3"]
         * 
         * The code evaluator will execute this code by using the command 
         * java -jar dist/lib/dist.jar 'Input1 Input2 Input3'
         * 
         * So the value of the variable "input" given below will be the string "Input1 Input2 Input3".
         */
        
        handle(args[0]);
    }

    /*
     * This method parses each input and assigns it to different variables.
     * 
     * The value of the function parameter "input" could be in this format: "Input1 Input2 Input3".
     * We split the string and retrieve the input data appropriately. 
     * Once retrieved, it is available as String data for you to implement the solution.
     *  
     */
    private static void handle(String input) {
        String[] inputList = input.trim().split(" ");
        String input1 = inputList[0];
        String input2 = inputList[1];
        String input3 = inputList[2];

        /*
         * Implementation of the solution should begin after this. Please make sure you convert the variables into appropriate data types required for the solutioning. 
         */

    }

}
