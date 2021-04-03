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

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        Queue<Integer> integerQueue = new LinkedList<>();

        for (int i = 1; i < integers.length; i++) {
            integerQueue.offer(integers[i]);
        }

        TreeNode treeNode = new TreeNode(integers[0]);
        treeNodeQueue.offer(treeNode);

        while (!integerQueue.isEmpty()){
            Integer leftVal = integerQueue.isEmpty() ? null : integerQueue.poll();
            Integer rightVal = integerQueue.isEmpty() ? null : integerQueue.poll();
            TreeNode current = treeNodeQueue.poll();
            if (leftVal !=null) {
                TreeNode left = new TreeNode(leftVal);
                current.left = left;
                treeNodeQueue.offer(left);
            }
            if (rightVal !=null){
                TreeNode right = new TreeNode(rightVal);
                current.right = right;
                treeNodeQueue.offer(right);
            }
        }
        return treeNode;
    }

    public static Integer[] parseData(String data){
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
