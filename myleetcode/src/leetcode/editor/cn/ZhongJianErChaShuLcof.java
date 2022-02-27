
////输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。 
////
//// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 
////
//// 
////
//// 示例 1: 
////
//// 
////Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
////Output: [3,9,20,null,null,15,7]
//// 
////
//// 示例 2: 
////
//// 
////Input: preorder = [-1], inorder = [-1]
////Output: [-1]
//// 
////
//// 
////
//// 限制： 
////
//// 0 <= 节点个数 <= 5000 
////
//// 
////
//// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-
//from-
////preorder-and-inorder-traversal/ 
//// Related Topics 树 数组 哈希表 分治 二叉树 👍 676 👎 0
//

package leetcode.editor.cn;

import java.util.HashMap;

//Java：重建二叉树
public class ZhongJianErChaShuLcof{
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
 }

    public static void main(String[] args) {
        Solution solution = new ZhongJianErChaShuLcof().new Solution();
        // TO TEST

        int[] preorder = new int[]{1,2,3};
        int[] inorder = new int[]{3,2,1};
        solution.buildTree(preorder, inorder);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
//        第一维：节点值，第二维：节点在中序遍历中的位置下标
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeRecursive(preorder, inorder, 0, n-1 , 0, n-1);
    }


    public TreeNode buildTreeRecursive(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right){
        if (preorder_left > preorder_right){
            return null;
        }
        int preorder_root = preorder[preorder_left];
        TreeNode root = new TreeNode(preorder_root);
        int inorder_root = map.get(preorder_root);
        int size_leftTree = inorder_root - inorder_left;
        root.left = buildTreeRecursive(preorder, inorder, preorder_left + 1, preorder_left + size_leftTree, inorder_left, inorder_root - 1);
        root.right = buildTreeRecursive(preorder, inorder, preorder_left + size_leftTree + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}