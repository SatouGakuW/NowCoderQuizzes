package a1_linkedlist;

public class JZ24 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        ListNode head = Tools.initialList(nums);
        JZ24Solution solution = new JZ24Solution();
        Tools.printList(solution.ReverseList(head));
    }
}

class JZ24Solution {
    public ListNode ReverseList (ListNode head) {
        ListNode pre = null, curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
}