
//定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。 
//
// 
//
// 示例: 
//
// MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.min();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.min();   --> 返回 -2.
// 
//
// 
//
// 提示： 
//
// 
// 各函数的调用总次数不超过 20000 次 
// 
//
// 
//
// 注意：本题与主站 155 题相同：https://leetcode-cn.com/problems/min-stack/ 
// Related Topics 栈 设计 👍 298 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Java：包含min函数的栈
public class BaoHanMinhanShuDeZhanLcof{
    public static void main(String[] args) {
        MinStack solution = new BaoHanMinhanShuDeZhanLcof().new MinStack();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class MinStack {
    Stack<Integer> stack_min, stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack_min = new Stack<>();
        stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
        if (stack_min.size() == 0 || x <= stack_min.peek()) {
            stack_min.push(x);
        } else {
            stack_min.push(stack_min.peek());
        }

    }
    
    public void pop() {
        if (stack.size() > 0 && stack_min.size() > 0) {
            stack_min.pop();
            stack.pop();
        }
    }
    
    public int top() {
        if (stack.size() > 0) {
            return stack.peek();
        }
        return stack.peek();
    }
    
    public int min() {
        if (stack_min.size() > 0) {
            return stack_min.peek();
        }
        return stack_min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
//leetcode submit region end(Prohibit modification and deletion)

}