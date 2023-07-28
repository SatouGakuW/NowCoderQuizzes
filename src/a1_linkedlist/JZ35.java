package a1_linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JZ35 {
    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        RandomListNode node5 = new RandomListNode(5);

        node1.next = node2;
        node1.random = node3;
        node2.next = node3;
        node2.random = node5;
        node3.next = node4;
        node3.random = null;
        node4.next = node5;
        node4.random = node2;
        node5.next = null;
        node5.random = null;

        JZ35Solution solution = new JZ35Solution();
        solution.Clone(node1);
    }
}

class JZ35Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        RandomListNode dummy = new RandomListNode(-1), tail = dummy;
        RandomListNode curr = pHead;
        // 第一次遍历 把链表连起来
        while (curr != null) {
            tail.next = new RandomListNode(curr.label);
            tail = tail.next;
            curr = curr.next;
        }
        curr = pHead;
        RandomListNode currNew = dummy.next, currRand;
        while (curr != null) {
            currRand = dummy.next;
            if (curr.random != null) {
                while (currRand.label != curr.random.label) {
                    currRand = currRand.next;
                }
            } else {
                currRand = null;
            }
            currNew.random = currRand;
            curr = curr.next;
            currNew = currNew.next;
        }
        return dummy.next;
    }
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
