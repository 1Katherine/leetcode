//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。 
//
// 示例1： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4 
//
// 限制： 
//
// 0 <= 链表长度 <= 1000 
//
// 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/ 
// Related Topics 递归 链表 👍 218 👎 0

package leetcode.editor.cn;

import sun.security.pkcs11.wrapper.PKCS11Constants;

//Java：合并两个排序的链表
public class HeBingLiangGePaiXuDeLianBiaoLcof{
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        Solution solution = new HeBingLiangGePaiXuDeLianBiaoLcof().new Solution();
        // TO TEST
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        ListNode head = solution.mergeTwoLists(node1, node4);
        ListNode p = head;
        while (p != null){
            System.out.println(p.val);
            p = p.next;
        }

    }
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode head, p;
//        鲁棒性
        if (p1 == null) {
            return p2;
        }
        if (p2 == null) {
            return p1;
        }
//        初始化
        if(p1.val <= p2.val) {
            head = new ListNode(p1.val);
            p1 = p1.next;
        } else {
            head = new ListNode(p2.val);
            p2 = p2.next;
        }

        p = head;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if (p1 == null) {
            p.next = p2;
        }
        if (p2 == null) {
            p.next = p1;
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}