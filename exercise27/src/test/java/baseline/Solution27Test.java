package baseline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void testfirstname(){
        Solution27 app = new Solution27();

        int expected = 0;
        int actual = app.checkfirstname("John");

    }

    @Test
    void testlastname(){
        Solution27 app = new Solution27();

        int expected = 0;
        int actual = app.checklastname("Gomez");

    }

    @Test
    void testlastnamelessthan2(){
        Solution27 app = new Solution27();

        int expected = 1;
        int actual = app.checklastname("G");

    }

    @Test
    void testlastnameempty(){
        Solution27 app = new Solution27();

        int expected = 2;
        int actual = app.checklastname(" ");

    }

    @Test
    void testzipcode(){
        Solution27 app = new Solution27();

        int expected = 0;
        int actual = app.checkzipcode("66666");
    }

    @Test
    void testemployeeID(){
        Solution27 app = new Solution27();

        int expected = 0;
        int actual = app.checkemployeeID("XY-3567");
    }
}