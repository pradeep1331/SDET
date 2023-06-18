package mandatoryHomeWork.week4.day4;



  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)return head;
        ListNode ans=null;
        ListNode first=head;
        ListNode sec=head.next;
        head.next=null;
        while(sec!=null){
            ListNode temp=sec.next;
            sec.next=first;
            first=sec;
            sec=temp;
        }

        return first;

    }
}