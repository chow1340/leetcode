import nodes.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    private static String splitter = ",";
    private static String nullValue = "null";
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    public static void buildString(TreeNode root, StringBuilder sb){
        if(root == null){
            sb.append(nullValue).append(splitter);
        } else {
            sb.append(root.val).append(splitter);
            buildString(root.left, sb);
            buildString(root.right,sb);
        }
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        data = data.replace("[", "");
        data = data.replace("]", "");
        Queue<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(splitter)));
        TreeNode result =  buildTree(nodes);
        return result;
    }

    public static TreeNode buildTree(Queue<String> nodes){
        String val = nodes.poll();

        if(val == null || val.equals(nullValue)){
            return null;
        } else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }
}


