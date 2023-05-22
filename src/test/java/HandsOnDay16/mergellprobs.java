package HandsOnDay16;

public class mergellprobs {

//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode(0); // Dummy node to build the merged list
//        ListNode current = dummy; // Pointer to the current node in the merged list
//
//        // Traverse both lists until one of them becomes null
//        while (l1 != null && l2 != null) {
//            // Compare the values of the current nodes of both lists
//            // Add the smaller value to the merged list and move the corresponding list's pointer forward
//            if (l1.val <= l2.val) {
//                current.next = l1;
//                l1 = l1.next;
//            } else {
//                current.next = l2;
//                l2 = l2.next;
//            }
//            current = current.next; // Move the current pointer forward
//        }
//
//        // Append the remaining nodes of the non-null list to the merged list
//        if (l1 != null) {
//            current.next = l1;
//        }
//        if (l2 != null) {
//            current.next = l2;
//        }
//
//        return dummy.next; // Return the merged list (excluding the dummy node)
//    }
}
