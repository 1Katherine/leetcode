//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。 
//
// 
//
// 参考以下这颗二叉搜索树： 
//
//      5
//    / \
//   2   6
//  / \
// 1   3 
//
// 示例 1： 
//
// 输入: [1,6,3,2,5]
//输出: false 
//
// 示例 2： 
//
// 输入: [1,3,2,6,5]
//输出: true 
//
// 
//
// 提示： 
//
// 
// 数组长度 <= 1000 
// 
// Related Topics 栈 树 二叉搜索树 递归 二叉树 单调栈 👍 452 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//Java：二叉搜索树的后序遍历序列
public class ErChaSouSuoShuDeHouXuBianLiXuLieLcof{
    public static void main(String[] args) {
        Solution solution = new ErChaSouSuoShuDeHouXuBianLiXuLieLcof().new Solution();
        // TO TEST
        int[] postorder = new int[]{1,2,5,10,6,9,4,3};
        System.out.println(solution.verifyPostorder(postorder));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean verifyPostorder(int[] postorder) {
        int length = postorder.length;
        if (length == 0) {
            return true;
         }
        return dfs(postorder, 0, length - 1);
    }

    public boolean dfs(int[] postorder, int start, int end) {
        if (end - start <= 0) {
            return true;
        }
        int root = postorder[end];
//       二叉搜索树中左子树节点的值小于根节点值
        int i = start;
        for (; i < end; i++) {
            if (postorder[i] > root) {
                break;
            }
        }
//       二叉搜索树中右子树节点的值大于根节点值
        int j = i;
        for (; j < end; j++) {
            if (postorder[j] < root) {
                return false;
            }
        }
//        判断左子树是不是二叉搜索树
        boolean left = true;
        if (end > 0) {
            left = dfs(postorder, start, i - 1) ;
        }
//        判断右子树是不是二叉搜索树
        boolean right = true;
        if (start < postorder.length) {
            right = dfs(postorder, i, j - 1) ;
        }
        return left && right;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}