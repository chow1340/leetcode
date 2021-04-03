import org.junit.Test;
import questions.string.ValidPalindrome;

public class ValidPalindromeTest {
    @Test
    public void test(){
        ValidPalindrome validPalindrome = new ValidPalindrome();
        assert(validPalindrome.isPalindrome("A man, a plan, a canal: Panama") == true);
    }
}
