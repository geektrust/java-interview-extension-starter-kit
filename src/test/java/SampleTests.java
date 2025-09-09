/*
 * A sample test class to help you get started.
 * Can be deleted or renamed as appropriate.
 * Make sure these classes end with `Tests`
 */

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleTests {
    
    @Test
    void testPassing() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void testFailing() {
        assertEquals(2, 1 + 1 + 1);
    }
}
