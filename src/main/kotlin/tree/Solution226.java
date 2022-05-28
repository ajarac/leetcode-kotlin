package tree;

import java.util.ArrayList;

public class Solution226 {
  public TreeNode invertTree(TreeNode root) {
    if (root.left == null || root.right == null) {
      return root;
    }
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
    invertTree(root.left);
    invertTree(root.right);
    return root;
  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    public ArrayList<Integer> toIntList() {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(val);
      list.addAll(left.toIntList());
      list.addAll(right.toIntList());
      return list;
    }
  }
}
