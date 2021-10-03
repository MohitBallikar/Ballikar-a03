package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    @Test
    void testloopfunct() throws IOException {
        Solution28 app = new Solution28();

        int expected = 15;

        int actual = app.loopfunct();

        assertEquals(expected, actual);
    }

}