package a1_linkedlist;

public class JZ52 {
}

class JZ52Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int length1 = listLength(pHead1), length2 = listLength(pHead2);
        ListNode curr1 = pHead1, curr2 = pHead2;
        int diff = 0;
        if (length1 >= length2) {
            diff = length1 - length2;
            for (int i = 0; i < diff; i++) {
                curr1 = curr1.next;
            }
        } else {
            diff = length2 - length1;
            for (int i = 0; i < diff; i++) {
                curr2 = curr2.next;
            }
        }
        while (curr1 != curr2) {
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return curr1;
    }

    public int listLength(ListNode head) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        return length;
    }
}