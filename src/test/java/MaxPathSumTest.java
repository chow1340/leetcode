import nodes.TreeNode;
import org.junit.Test;

public class MaxPathSumTest {

    @Test
    public void maxPathSumTest(){
        MaxPathSum maxPathSum = new MaxPathSum();
        TreeNode node = Codec.deserialize("[-10,9,20,null,null,15,7]");
        int result = maxPathSum.maxPathSum(node);
        System.out.println(result);
    }
}
