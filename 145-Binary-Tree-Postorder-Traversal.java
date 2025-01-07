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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> num=new ArrayList<>();
        postOrder(root,num);
        return num;
    }
    public static void postOrder(TreeNode root,List<Integer> num)
    {
        if(root==null)
        return;
        postOrder(root.left,num);
        postOrder(root.right,num);
        num.add(root.val);
    }
}