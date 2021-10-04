package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class Solution31Test {
@Test
    void diffcalc1test(){
    Solution31 app = new Solution31();

    int expected = 198;
    int actual = app.diffcalc1(22);
}
    @Test
    void diffcalc2test(){
        Solution31 app = new Solution31();

        int expected = 133;
        int actual = app.diffcalc2(198, 65);
    }

    @Test
    void thrcalctest(){
        Solution31 app = new Solution31();

        int expected = 198;
        int actual = app.thrcalc(133,55,65);
    }

}