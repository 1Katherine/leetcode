
//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 栈 递归 链表 双指针 👍 243 👎 0

package leetcode.editor.cn;

import javax.management.ListenerNotFoundException;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


//Java：从尾到头打印链表
public class CongWeiDaoTouDaYinLianBiaoLcof{
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        ListNode(){}
    }
    public static void main(String[] args) {
        Solution solution = new CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
        // TO TEST
//        ListNode head = null ;
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
//        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        int[] res = solution.reversePrint(node1);
//        System.out.println(res);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
////        方法一：借用栈
//        Stack<Integer> stack = new Stack<>();
//        ListNode p = head;
//        while (p != null) {
//            stack.push(p.val);
//            p = p.next;
//        }
//        int len = stack.size();
//        int[] res = new int[len];
//        for (int i = 0; i < len; i++) {
//            res[i] = stack.pop();
//        }
//        return res;

//        方法二：递归
        List<Integer> res = new ArrayList<Integer>();
        recursive(head, res);
        int[] arr = new int[res.size()];
//        ArrayList转成int[]
        for (int i = 0;i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

//    方法二：递归
    public void recursive(ListNode p, List<Integer> res) {
        if (p != null) {
            if (p.next != null) {
                recursive(p.next, res);
            }
            res.add(p.val);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}