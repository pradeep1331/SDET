package ClassFiles.Day8;

public class Queues {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        System.out.println(queue);

        int removedElement = queue.dequeue();
        System.out.println("Removed element: " + removedElement);
        System.out.println(queue);
    }

    static class Queue {
        class Node {
            int number;
            Node next;
        }

        private Node start;
        private Node end;
        private int size = 0;

        void enqueue(int no) {
            // Create a new Node
            Node node = new Node();
            node.number = no;

            // Handling the insertion of the first element
            if (start == null) {
                start = node;
                end = node;
            }
            // Handling the case of regular insertion at the end
            else {
                end.next = node;
                end = node;
            }
            size++;
        }

        @Override
        public String toString() {
            StringBuffer sb = new StringBuffer();
            sb.append("[");
            Node current = start;
            while (current != null) {
                sb.append(current.number + ", ");
                current = current.next;
            }
            sb.append("] --> " + "size: " + size);
            return sb.toString();
        }

        int dequeue() {
            // Handling if the queue is empty
            if (start == null) {
                throw new IllegalStateException("Cannot dequeue from an empty queue.");
            }  // Handling the case where we have only one element in the queue
            else if ( size==1) {
                int num = start.number;
                start = end = null;
                size--;
                return num;
            } else        // Handle the case of a regular removal
             {
                int num = start.number;
                start = start.next;
                size--;
                return num;
            }
        }
    }
}
