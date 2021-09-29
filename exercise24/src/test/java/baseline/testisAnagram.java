package baseline;

import baseline.Solution24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testisAnagram {

    @Test
    void stringTestTrue(){
        Solution24 app = new Solution24();

        char[] a = {'e', 'a', 't', 'e', 'r',};
        char[] b = {'a', 'r', 'e', 't', 'e',};

        String expected = "true";
        boolean actual = Solution24.isAnagram(a,b);

    }

    @Test
    void stringTestFalse(){
        Solution24 app = new Solution24();

        char[] a = {'e', 'a', 't', 'e', 'r',};
        char[] b = {'a', 'r', 'e', 't', 'e', 'q'};

        String expected = "false";
        boolean actual = Solution24.isAnagram(a,b);

    }

   








}
