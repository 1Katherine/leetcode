//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
//
// 给你一个可能存在 重复 元素值的数组 numbers ，它原来是一个升序排列的数组，并按上述情形进行了一次旋转。请返回旋转数组的最小元素。例如，数组 [3
//,4,5,1,2] 为 [1,2,3,4,5] 的一次旋转，该数组的最小值为1。 
//
// 示例 1： 
//
// 
//输入：[3,4,5,1,2]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：[2,2,2,0,1]
//输出：0
// 
//
// 注意：本题与主站 154 题相同：https://leetcode-cn.com/problems/find-minimum-in-rotated-
//sorted-array-ii/ 
// Related Topics 数组 二分查找 👍 538 👎 0

package leetcode.editor.cn;
//Java：旋转数组的最小数字
public class XuanZhuanShuZuDeZuiXiaoShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new XuanZhuanShuZuDeZuiXiaoShuZiLcof().new Solution();
        // TO TEST
        int[] numbers = new int[]{3,1,1};
        System.out.println(solution.minArray(numbers));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//        1. 顺序查找
//    public int minArray(int[] numbers) {
//        int last = numbers[0];      // 当前数字的上一个元素
//        for (int i = 1; i < numbers.length; i++) {
//            if (last > numbers[i]) {{
//                return numbers[i];
//            }}
//            last = numbers[i];
//        }
//        return numbers[0];
//    }
    public int minArray(int[] numbers) {
        int len = numbers.length;
        int index1 = 0;
        int index2 = len - 1;

        if (numbers[index1] < numbers[index2]) {
            return numbers[index1];
        }

        while (index2 - index1 > 1) {
            int indexMid = (index1 + index2) / 2;
            if (numbers[index1] == numbers[indexMid] && numbers[index2] == numbers[indexMid]) {
                return shunxu(numbers);
            }
            if (numbers[indexMid] >= numbers[index1]) {
                index1 = indexMid;
            } else if (numbers[indexMid] <= numbers[index2]) {
                index2 = indexMid;
            }
        }
        return numbers[index2];
    }

//    如果index1 == index2 == indexMid
//    无法判断 indexMid 属于前一个升序数组还是后一个升序数组，此时只能使用顺序查找
    public int shunxu(int[] numbers) {
        int last = numbers[0];      // 当前数字的上一个元素
        for (int i = 1; i < numbers.length; i++) {
            if (last > numbers[i]) {{
                return numbers[i];
            }}
            last = numbers[i];
        }
        return numbers[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}