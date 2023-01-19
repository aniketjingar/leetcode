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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<>();
        helper(answer, "", root);
        return answer;
    }
    
    private static void helper(List<String> answer, String currentPath, TreeNode root) {
        if (root != null) {
            currentPath += String.valueOf(root.val);
            if (root.left == null && root.right == null) {
                answer.add(currentPath);
            } else {
                currentPath += "->";
                helper(answer, currentPath, root.left);
                helper(answer, currentPath, root.right);
            }
        }
    }
}