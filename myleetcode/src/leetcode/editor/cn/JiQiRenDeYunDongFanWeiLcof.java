//地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一
//格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但
//它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？ 
//
// 
//
// 示例 1： 
//
// 输入：m = 2, n = 3, k = 1
//输出：3
// 
//
// 示例 2： 
//
// 输入：m = 3, n = 1, k = 0
//输出：1
// 
//
// 提示： 
//
// 
// 1 <= n,m <= 100 
// 0 <= k <= 20 
// 
// Related Topics 深度优先搜索 广度优先搜索 动态规划 👍 450 👎 0

package leetcode.editor.cn;
//Java：机器人的运动范围
public class JiQiRenDeYunDongFanWeiLcof{
    public static void main(String[] args) {
        Solution solution = new JiQiRenDeYunDongFanWeiLcof().new Solution();
        // TO TEST
        System.out.println(solution.movingCount(1,2,1));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int count = 0;
    private boolean[][] visited;
    public int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        return dfs(m, n, k, 0, 0);
    }

    public int dfs(int m, int n, int k, int r, int c) {
        if (r < 0 || r >= m || c < 0 || c >= n || visited[r][c] || !check(r,c,k)) {
            return 0;
        }
        visited[r][c] = true;
        int res = 1 + dfs(m, n, k ,r + 1, c) + dfs(m, n, k ,r - 1, c) + dfs(m, n, k ,r, c - 1) + dfs(m, n, k ,r, c + 1) ;
        return res;
    }

    public boolean check(int r, int c, int k) {
        if (digitalSum(r) + digitalSum(c) <= k) {
            return true;
        }
        return false;
    }
//    计算数字num的每一位之和
    public int digitalSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}