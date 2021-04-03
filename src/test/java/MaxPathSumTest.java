import nodes.TreeNode;
import org.junit.Test;
import questions.tree.MaxPathSum;
import util.Tree;

public class MaxPathSumTest {

    @Test
    public void maxPathSumTest(){
        MaxPathSum maxPathSum = new MaxPathSum();
        TreeNode node = Tree.buildTree("[-10,9,20,null,null,15,7]");
        int result = maxPathSum.maxPathSum(node);
        assert(result == 42);
    }
}
