package mandatoryHomeWork.week4.day3;


 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while(current!=null){
            if(current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }

        }
        return head;
    }
}