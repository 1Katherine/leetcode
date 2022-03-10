//给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。 
//
// 叶子节点 是指没有子节点的节点。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
//输出：[[5,4,11,2],[5,8,4,5]]
// 
//
// 示例 2： 
//
// 
//
// 
//输入：root = [1,2,3], targetSum = 5
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1,2], targetSum = 0
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点总数在范围 [0, 5000] 内 
// -1000 <= Node.val <= 1000 
// -1000 <= targetSum <= 1000 
// 
//
// 注意：本题与主站 113 题相同：https://leetcode-cn.com/problems/path-sum-ii/ 
// Related Topics 树 深度优先搜索 回溯 二叉树 👍 302 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Java：二叉树中和为某一值的路径
public class ErChaShuZhongHeWeiMouYiZhiDeLuJingLcof{
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
        }
    }
    public static void main(String[] args) {
        Solution solution = new ErChaShuZhongHeWeiMouYiZhiDeLuJingLcof().new Solution();
        // TO TEST
//        root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node9 = new TreeNode(5);
        TreeNode node10 = new TreeNode(1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node4.left = node7;
        node4.right = node8;
        node3.left = node5;
        node3.right = node6;
        node6.left = node9;
        node6.right = node10;
        List<List<Integer>> res = solution.pathSum(node1, 22);
        System.out.println(res);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        allPath(root, target, res, temp);
        return res;
    }

    public void allPath(TreeNode root, int target, List<List<Integer>> res, List<Integer> temp) {
        temp.add(root.val);
//        递归左子树
        if (root.left != null) {
            allPath(root.left, target - root.val, res, temp);
        }
        if (root.right != null) {
            allPath(root.right, target - root.val, res, temp);
        }
        if (target == 0) {
            res.add(temp);
            return;
        }
        temp.remove(temp.size() - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}