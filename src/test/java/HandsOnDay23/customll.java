package HandsOnDay23;

public class customll {

    public static void main(String[] args) {

        linkedlist ll = new linkedlist();

        ll.insertfirst(3);
        ll.insertfirst(2);
        ll.insertfirst(1);

        ll.insertLast(10);
        ll.display();
    }
}

class linkedlist{

    Node head;
    Node tail;

    int size ;
    linkedlist(){
        this.size =0;
    }

    class Node{
            int value ;
            Node next;
            public Node(int value){
                this.value = value;
            }
            public Node(Node node,int value){
                this.value = value;
                this.next = node;
            }
    }

     void insertfirst(int value){
        Node node = new Node(value);
         if(head == null){
             head = node;
             tail = node;
         }else{
             node.next = head;
             head = node;
         }
        size ++;
    }

    void insertLast(int value){

        Node newnode = new Node(value);

        if(tail==null){
            head = newnode;
            tail = newnode;
        }else{

            tail.next = newnode;
            tail = newnode;
        }

        size++;

    }

    void insert(int value,int index){

        if(index==0){
            insertfirst(value);
        }else if(index==size){

            insertLast(value);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {

            temp = temp.next;
        }
        Node node = new Node(temp.next,value);
        temp.next = node;
        size++;
    }


    void display(){

        Node node = head;
        while(!(node == null)){
            System.out.println(node.value);
            node = node.next;
        }
    }


}
