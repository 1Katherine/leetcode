
////在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和
//一个
////整数，判断数组中是否含有该整数。 
////
//// 
////
//// 示例: 
////
//// 现有矩阵 matrix 如下： 
////
//// 
////[
//// [1, 4, 7, 11, 15],
//// [2, 5, 8, 12, 19],
//// [3, 6, 9, 16, 22],
//// [10, 13, 14, 17, 24],
//// [18, 21, 23, 26, 30]
////]
//// 
////
//// 给定 target = 5，返回 true。 
////
//// 给定 target = 20，返回 false。 
////
//// 
////
//// 限制： 
////
//// 0 <= n <= 1000 
////
//// 0 <= m <= 1000 
////
//// 
////
//// 注意：本题与主站 240 题相同：https://leetcode-cn.com/problems/search-a-2d-matrix-ii/ 
//// Related Topics 数组 二分查找 分治 矩阵 👍 576 👎 0
//

package leetcode.editor.cn;
//Java：二维数组中的查找
public class ErWeiShuZuZhongDeChaZhaoLcof{
    public static void main(String[] args) {
        Solution solution = new ErWeiShuZuZhongDeChaZhaoLcof().new Solution();
        // TO TEST
        int[][] matrix = new int[][]{{-5}};
//        int[][] matrix = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(solution.findNumberIn2DArray(matrix, -5));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 通过特定初始点位置逐步缩小搜索范围
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        int i = 0, j = colNum - 1;
        while (i < rowNum && j >= 0) {
            int curNum = matrix[i][j];
            if (curNum == target) {
                return true;
            } else if (curNum > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}