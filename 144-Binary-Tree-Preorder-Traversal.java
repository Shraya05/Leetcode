/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> num = new ArrayList<>();
        preOrder(root,num);
        return num;
    }
    public static void preOrder(TreeNode root,List<Integer> num)
    {
        if(root==null)
        return;
        num.add(root.val);
        preOrder(root.left,num);
        preOrder(root.right,num);
    }
}