package mandatoryHomeWork.week5.day1;


  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class middleNode {
    public ListNode middleNode1(ListNode head) {
        int size = 0;
        ListNode current = head;

        while (current != null) {
            current = current.next;
            size++;
        }

        int mid;
        if (size % 2 == 0) {
            mid = size / 2 + 1;
        } else {
            mid = (size + 1) / 2;
        }

        current = head;
        for (int i = 0; i < mid-1; i++) {
            current = current.next;
        }

        return current;
    }
}