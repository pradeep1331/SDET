package ClassFiles.Day6;

public class    DoublyLInked {

    public static void main(String[] args) {

        DoublyLinkedLst ll = new DoublyLinkedLst();
             ll.add("10");
        ll.add("20");
        ll.add("30");
        ll.add("40");
        System.out.println(ll.toString());


    }

}

class DoublyLinkedLst {



    class Node{
        public Node previous;
        String data = null;
        Node next = null;

        Node Previous = null;
    }
    Node start = null;
    int size;
    void add(String data){
        Node node = new Node();
        node.data = data;
        if (start==null){
            start = node;
        } else {
            Node current = start;
            while(current.next!=null){
                current = current.next;
            }
            current.next = node;
            node.previous = current;
        }
      size++;
    }

    String get(int index){
        if(!(index<size)){
            System.out.println("index is greater than size");
            return "Not a valid index";
        }
        Node current = start;
        int n=0;
        while(n<index){
            current = current.next;
            n++;
        }
        return current.data;
    }
    int indexof(String ele){
        Node current = start;
        int n=0;
        while(n<size-1){
            if(current.data.equals(ele)){
                return n;
            }
            current = current.next;
            n++;
        }
        return -1;
    }

    int lastIndexOf(String element) {
        Node current = start;
        int n = 0;
        int position = -1;

        while (current != null) {
            if (current.data.equals(element)) {
                position = n;
            }
            current = current.next;
            n++;
        }

        return position;
    }

      @Override
    public String toString(){
         StringBuilder sb = new StringBuilder(0);
         sb.append("[");
         Node current = start;
         while(current!=null){
            sb.append(current.data).append(",");
            current = current.next;
          }
         sb.append("]" + "-->").append(size);
         return sb.toString();
      }
}


// Singly Linked list - Each node will have data and next pointer only
// start will be mainted outside so it will not be influenced by node directly
