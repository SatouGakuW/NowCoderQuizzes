package a1_linkedlist;

public class JZ22 {
    public static void main(String[] args) {
        int[] nums = {2};
        int k = 8;
        ListNode head = Tools.initialList(nums);
        JZ22Solution solution = new JZ22Solution();
        Tools.printList(solution.FindKthToTail(head, k));
    }
}

class JZ22Solution {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        ListNode fast = pHead, slow = pHead;
        while (k > 0 && fast != null) {
            fast = fast.next;
            k--;
        }
        if (k > 0) {
            return null;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}