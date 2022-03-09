//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。 
//
// 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/ 
// Related Topics 递归 链表 👍 388 👎 0

package leetcode.editor.cn;

import java.util.Stack;

//Java：反转链表
public class FanZhuanLianBiaoLcof{
public static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
    public static void main(String[] args) {
        Solution solution = new FanZhuanLianBiaoLcof().new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        // TO TEST
        ListNode h = solution.reverseList(node1);
        ListNode p = h;
        while(p != null) {
            System.out.println(p.val);
            p = p.next;
        }
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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode i = head, j = head.next;
        if (j == null) {
            return head;
        }
        i.next = null;
        if (j.next == null) {
            j.next = i;
            return j;
        }
        ListNode k = j.next;
        while (k != null) {
            j.next = i;
            i = j;
            j = k;
            k = k.next;
        }
        j.next = i;
        return j;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}