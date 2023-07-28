package a1_linkedlist;

public class JZ23 {
}

class JZ23Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode fast = pHead, slow = pHead;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = pHead;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}