import nodes.TreeNode;
import org.junit.Test;

public class CodecTest {
    @Test
    public void CodecTest(){
        Codec codec = new Codec();
        TreeNode node = codec.deserialize("[1,2,3,null,null,4,5]");
        String string = codec.serialize(node);
    }
}
