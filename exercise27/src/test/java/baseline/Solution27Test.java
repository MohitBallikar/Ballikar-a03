package baseline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void testfirstname(){
        Solution27 app = new Solution27();

        int expected = 0;
        int actual = app.checkfirstname("John");
        assertEquals(expected, actual);

    }

    @Test
    void testlastname(){
        Solution27 app = new Solution27();

        int expected = 0;
        int actual = app.checklastname("Gomez");
        assertEquals(expected, actual);

    }

    @Test
    void testlastnamelessthan2(){
        Solution27 app = new Solution27();

        int expected = 1;
        int actual = app.checklastname("G");
        assertEquals(expected, actual);

    }

    @Test
    void testlastnameempty(){
        Solution27 app = new Solution27();

        int expected = 2;
        int actual = app.checklastname("");
        assertEquals(expected, actual);

    }

    @Test
    void testzipcode(){
        Solution27 app = new Solution27();

        int expected = 0;
        int actual = app.checkzipcode("66666");
        assertEquals(expected, actual);
    }

    @Test
    void testemployeeID(){
        Solution27 app = new Solution27();

        int expected = 0;
        int actual = app.checkemployeeID("XY-3567");
        assertEquals(expected, actual);
    }
}