
//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// Related Topics 字符串 👍 218 👎 0

package leetcode.editor.cn;
//Java：替换空格
public class TiHuanKongGeLcof{
    public static void main(String[] args) {
        Solution solution = new TiHuanKongGeLcof().new Solution();
        // TO TEST
        String s = "We are happy.";
        System.out.println(solution.replaceSpace(s));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        int len = s.length();
        int n = 0; // 空格个数
//      统统计空格个数
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                n++;
            }
        }
        int p1 = len - 1;
        int p2 = len + 2 * n - 1;
        char[] arr = new char[p2+1];
        while (p2 >= 0) {
            if (s.charAt(p1) != ' ') {
                arr[p2] = s.charAt(p1);
                p2--;
            } else {
                arr[p2] = '0';
                arr[p2-1] = '2';
                arr[p2-2] = '%';
                p2 -= 3;
            }
            p1--;
        }
        return new String(arr);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}