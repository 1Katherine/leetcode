//输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构) 
//
// B是A的子结构， 即 A中有出现和B相同的结构和节点值。 
//
// 例如: 
//给定的树 A: 
//
// 3 
// / \ 
// 4 5 
// / \ 
// 1 2 
//给定的树 B： 
//
// 4 
// / 
// 1 
//返回 true，因为 B 与 A 的一个子树拥有相同的结构和节点值。 
//
// 示例 1： 
//
// 输入：A = [1,2,3], B = [3,1]
//输出：false
// 
//
// 示例 2： 
//
// 输入：A = [3,4,5,1,2], B = [4,1]
//输出：true 
//
// 限制： 
//
// 0 <= 节点个数 <= 10000 
// Related Topics 树 深度优先搜索 二叉树 👍 484 👎 0

package leetcode.editor.cn;
//Java：树的子结构
public class ShuDeZiJieGouLcof{
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        Solution solution = new ShuDeZiJieGouLcof().new Solution();
        // TO TEST
        TreeNode Anode1 = new TreeNode(3);
        TreeNode Anode2 = new TreeNode(4);
        TreeNode Anode3 = new TreeNode(5);
        TreeNode Anode4 = new TreeNode(1);
        TreeNode Anode5 = new TreeNode(2);
        Anode1.left = Anode2;
        Anode1.right = Anode3;
        Anode2.left = Anode4;
        Anode2.right = Anode5;

        TreeNode Bnode1 = new TreeNode(4);
        TreeNode Bnode2 = new TreeNode(1);
        Bnode1.left = Bnode2;
        System.out.println(solution.isSubStructure(Anode1, Bnode1));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return hasSubTree(A, B);
    }

    public boolean hasSubTree(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        boolean res = false;
        if (A.val == B.val) {
            res = DoseTree1haveTree2(A, B);
        }
        if (res == false) {
            res = hasSubTree(A.left, B);
        }
        if (res == false) {
            res = hasSubTree(A.right, B);
        }
        return res;
    }

    boolean DoseTree1haveTree2(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (A.val != B.val) {
            return false;
        }
        return DoseTree1haveTree2(A.left, B.left) && DoseTree1haveTree2(A.right, B.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}