package baseline;

import baseline.Solution25;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void testVeryWeakPassword(){
        Solution25 app = new Solution25();
        int expected = 0;
        int actual = app.passwordValidator("abcdef");
    assertEquals(expected,actual);
    }


}
