package mandatoryHomeWork.week5.day4;


  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int size = 1;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode last = head;

        while (last.next != null) {
            last = last.next;
            size++;
        }

        k = k % size;
        if (k == 0) {
            return head;
        }

        ListNode current = dummy;
        for (int i = 0; i < size - k; i++) {
            current = current.next;
        }

        last.next = head;
        head = current.next;
        current.next = null;

        return head;
    }
}