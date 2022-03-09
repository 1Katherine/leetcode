////编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为 汉明重量).）。 
////
//// 
////
//// 提示： 
////
//// 
//// 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符
//号的
////还是无符号的，其内部的二进制表示形式都是相同的。 
//// 在 Java 中，编译器使用 二进制补码 记法来表示有符号整数。因此，在上面的 示例 3 中，输入表示有符号整数 -3。 
//// 
////
//// 
////
//// 示例 1： 
////
//// 
////输入：n = 11 (控制台输入 00000000000000000000000000001011)
////输出：3
////解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
//// 
////
//// 示例 2： 
////
//// 
////输入：n = 128 (控制台输入 00000000000000000000000010000000)
////输出：1
////解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
//// 
////
//// 示例 3： 
////
//// 
////输入：n = 4294967293 (控制台输入 11111111111111111111111111111101，部分语言中 n = -3）
////输出：31
////解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。 
////
//// 
////
//// 提示： 
////
//// 
//// 输入必须是长度为 32 的 二进制串 。 
//// 
////
//// 
////
//// 注意：本题与主站 191 题相同：https://leetcode-cn.com/problems/number-of-1-bits/ 
//// Related Topics 位运算 👍 222 👎 0
//

package leetcode.editor.cn;
//Java：二进制中1的个数
public class ErJinZhiZhong1deGeShuLcof{
    public static void main(String[] args) {
        Solution solution = new ErJinZhiZhong1deGeShuLcof().new Solution();
        // TO TEST
        System.out.println(solution.hammingWeight(11));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    // you need to treat n as an unsigned value
//    public int hammingWeight(int n) {
//        int count = 0;
//        while (n != 0) {
//            if ((n & 1) == 1) {
//                count++;
//            }
//            n >>= 1;
//        }
//        return count;
//    }
//    public int hammingWeight(int n) {
//        int count = 0;
//        int flag = 1;
//        while (flag != 0) {
//            if ((n & flag) != 0) {
//                count++;
//            }
//            flag = flag << 1;
//        }
//        return count;
//    }
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}