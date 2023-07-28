package a1_linkedlist;

import java.util.ArrayList;
import java.util.Stack;

public class JZ6 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ListNode head = Tools.initialList(nums);
        JZ6Solution solution = new JZ6Solution();
        System.out.println(solution.printListFromTailToHead(head));
    }
}

class JZ6Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        ListNode curr = listNode;
        while (curr != null) {
            st.push(curr.val);
            curr = curr.next;
        }
        while (!st.isEmpty()) {
            ans.add(st.pop());
        }
        return ans;
    }
}