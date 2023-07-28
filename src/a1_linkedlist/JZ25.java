package a1_linkedlist;

public class JZ25 {
    public static void main(String[] args) {
        int[] num1 = {1, 3, 5};
        int[] num2 = {2, 4, 6};
        ListNode pHead1 = Tools.initialList(num1);
        ListNode pHead2 = Tools.initialList(num2);
        JZ25Solution solution = new JZ25Solution();
        Tools.printList(solution.Merge(pHead1, pHead2));
    }
}

class JZ25Solution {
    public ListNode Merge (ListNode pHead1, ListNode pHead2) {
        ListNode curr1 = pHead1, curr2 = pHead2;
        ListNode dummy = new ListNode(-1), curr = dummy;
        while (curr1 != null && curr2 != null) {
            if (curr1.val <= curr2.val) {
                curr.next = curr1;
                curr1 = curr1.next;
            } else {
                curr.next = curr2;
                curr2 = curr2.next;
            }
            curr = curr.next;
        }
        if (curr1 != null) {
            curr.next = curr1;
        }
        if (curr2 != null) {
            curr.next = curr2;
        }
        return dummy.next;
    }
}