package util;

import nodes.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Tree {
    private static String nullValue = "null";

    public static TreeNode buildTree(String data){
        Integer[] integers = parseData(data);
        if(integers.length == 0) return null;

        Queue<Integer> nodes =  new LinkedList<>();
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();

        nodes.addAll(Arrays.asList(integers));

        TreeNode treeNode = new TreeNode(Integer.valueOf(integers[0]));
        treeNodeQueue.offer(treeNode);

        while(!nodes.isEmpty()){
            Integer leftVal = nodes.isEmpty() ? null : nodes.poll();
            Integer rightVal = nodes.isEmpty() ? null : nodes.poll();
            TreeNode current = treeNodeQueue.poll();

            if(leftVal != null) {
                TreeNode left = new TreeNode(leftVal);
                current.left = left;
                treeNodeQueue.offer(left);
            }

            if(rightVal != null) {
                TreeNode right = new TreeNode(rightVal);
                current.right = right;
                treeNodeQueue.offer(right);
            }
        }
        return treeNode;
    }

    private static Integer[] parseData(String data){
        data = data.replace("[", "");
        data = data.replace("]", "");

        String[] dataSplit = data.split(",");
        Integer[] result = new Integer[dataSplit.length];

        for(int i = 0; i < dataSplit.length; i++){
            if(dataSplit[i].equals(nullValue)){
                result[i] = null;
            } else {
                result[i] = Integer.valueOf(dataSplit[i]);
            }
        }
        return result;
    }
}
