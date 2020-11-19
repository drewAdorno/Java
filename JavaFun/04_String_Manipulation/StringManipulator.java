import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringManipulator {
    public String trimAndConcat(String stringA, String stringB){
        return stringA.trim() + stringB.trim();
    }

    public Integer getIndexOrNull(String str, String substring ){
        if(str.indexOf(substring) == -1){
            return null;
        }
        return str.indexOf(substring);
    }
    public String concatSubstring(String stringA, int start, int end, String stringB){
        return stringA.substring(start, end)+stringB;
    }

    @Test
    public void testTrimAndConcat() {
        assertEquals("TestingTesting", trimAndConcat("      Testing      ", "      Testing      "));
    }

}