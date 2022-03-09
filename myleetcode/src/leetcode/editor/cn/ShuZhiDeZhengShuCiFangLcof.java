//实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xⁿ）。不得使用库函数，同时不需要考虑大数问题。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 2.00000, n = 10
//输出：1024.00000
// 
//
// 示例 2： 
//
// 
//输入：x = 2.10000, n = 3
//输出：9.26100 
//
// 示例 3： 
//
// 
//输入：x = 2.00000, n = -2
//输出：0.25000
//解释：2⁻² = 1/2² = 1/4 = 0.25 
//
// 
//
// 提示： 
//
// 
// -100.0 < x < 100.0 
// -2³¹ <= n <= 2³¹-1 
// -10⁴ <= xⁿ <= 10⁴ 
// 
//
// 
//
// 注意：本题与主站 50 题相同：https://leetcode-cn.com/problems/powx-n/ 
// Related Topics 递归 数学 👍 262 👎 0

package leetcode.editor.cn;
//Java：数值的整数次方
public class ShuZhiDeZhengShuCiFangLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZhiDeZhengShuCiFangLcof().new Solution();
        // TO TEST
//        int a = -2147483648;
//        long x = (long) a;
//        long absx = Math.abs(x);
//        System.out.println(absx);
        System.out.println(solution.myPow(2,10));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public double myPow(double x, int n) {
            if(x == 0.0 && n < 0) {
                return 0.0;
            }

            long absn = n;
            if (n < 0) {
                long a = (long) n;
                absn = Math.abs(a);
            }
            double res = PowerWithAbsN(x, absn);
//        n为负整数时，先计算正整数次方结果，再对结果求导
            if (n < 0) {
                res = 1.0 / res;
            }
            return res;
        }

        //    n为正整数
        public double PowerWithAbsN(double x, long n){
            if (n == 0) {
                return 1;
            }
            if (n == 1) {
                return x;
            }
            double res = PowerWithAbsN(x, n >> 1) ;
            res *= res;
            if ((n & 0x1) == 1) {
                res *= x;
            }
            return res;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}