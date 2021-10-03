package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    @Test
    void calctest() throws IOException {
        Solution29 app = new Solution29();
        int expected = 18;
        int actual = app.calc(4);

        assertEquals(expected,actual);
    }

}