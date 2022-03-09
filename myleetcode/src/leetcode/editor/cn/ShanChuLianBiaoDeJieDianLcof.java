//给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。 
//
// 返回删除后的链表的头节点。 
//
// 注意：此题对比原题有改动 
//
// 示例 1: 
//
// 输入: head = [4,5,1,9], val = 5
//输出: [4,1,9]
//解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
// 
//
// 示例 2: 
//
// 输入: head = [4,5,1,9], val = 1
//输出: [4,5,9]
//解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
// 
//
// 
//
// 说明： 
//
// 
// 题目保证链表中节点的值互不相同 
// 若使用 C 或 C++ 语言，你不需要 free 或 delete 被删除的节点 
// 
// Related Topics 链表 👍 197 👎 0

package leetcode.editor.cn;
//Java：删除链表的节点
public class ShanChuLianBiaoDeJieDianLcof{
    public static void main(String[] args) {
        Solution solution = new ShanChuLianBiaoDeJieDianLcof().new Solution();
        // TO TEST
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
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
    public ListNode deleteNode(ListNode head, int val) {
        ListNode p1 = head;
//        情形一：删除的时头节点
        if (p1.val == val) {
            return head.next;
        }
        ListNode p2 = head.next;
//        p1始终指向p2的前驱节点
        while (p2 != null && p2.val != val){
            p2 = p2.next;
            p1 = p1.next;
        }
//        情形二：删除的节点是尾节点
        if (p2 == null) {
            p1.next = null;
        } else {
//            情形三：正常情况，删除中间节点
            p1.next = p2.next;
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}