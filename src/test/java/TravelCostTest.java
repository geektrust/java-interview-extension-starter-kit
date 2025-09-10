import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TravelCostTest {

    @Test
    void testParisRoundTrip() {
        String input = "3 Paris round";
        String expected = "Total Flight Cost: 1500";

        assertEquals(expected, getOutput(input));
    }

    @Test
    void testTokyoOneWay() {
        String input = "2 Tokyo one-way";
        String expected = "Total Flight Cost: 900";

        assertEquals(expected, getOutput(input));
    }

    @Test
    void testCairoRoundTrip() {
        String input = "5 Cairo round";
        String expected = "Total Flight Cost: 3000";

        assertEquals(expected, getOutput(input));
    }

    @Test
    void testInvalidDestination() {
        String input = "3 London round";
        String expected = "INVALID DESTINATION";

        assertEquals(expected, getOutput(input));
    }

    // Helper method to capture printed output
    private String getOutput(String input) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        TravelCost.main(new String[]{input});

        return outContent.toString().trim();
    }
}
