import org.junit.Test;
import questions.arrays.LongestConsecutive;
import util.DataFormatter;

public class LongestConsecutiveTest {
    @Test
    public void test(){
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        int result = longestConsecutive.longestConsecutive(DataFormatter.parseData("[100,4,200,1,3,2]"));
        assert(result == 4);
    }
}
