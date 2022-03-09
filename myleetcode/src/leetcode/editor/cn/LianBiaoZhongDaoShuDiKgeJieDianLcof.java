//输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。 
//
// 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。 
//
// 
//
// 示例： 
//
// 
//给定一个链表: 1->2->3->4->5, 和 k = 2.
//
//返回链表 4->5. 
// Related Topics 链表 双指针 👍 331 👎 0

package leetcode.editor.cn;
//Java：链表中倒数第k个节点
public class LianBiaoZhongDaoShuDiKgeJieDianLcof {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        Solution solution = new LianBiaoZhongDaoShuDiKgeJieDianLcof().new Solution();
        // TO TEST
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode res = solution.getKthFromEnd(node1, 2);
        System.out.println(res.val);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
//            鲁棒性一：链表为空
//            鲁棒性二：k=0
            if (head == null || k == 0) {
                return null;
            }
            ListNode p1 = head, p2 = head;
            for (int step = 0; step < k; step++) {
                if (p2 == null) {
                    return null;
                }
                p2 = p2.next;
//                鲁棒性三：链表的长度少于k
            }
            while (p2 != null) {
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}