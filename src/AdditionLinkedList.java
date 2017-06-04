public class AdditionLinkedList {




    protected static class Node
    {
        int data ;
        Node next;
        Node(int item)
        {
            this.data = item;
            this.next = null;
        }
    }


    private int carry;
    private Node result;


    public int getLength(Node node) {
        int length = 0;
        Node current = node;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void printList(Node node) {
        Node current = node;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    public void printResult() {
        Node current = result;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
    }


    public Node addForward(Node h1, Node h2) {
        //Get the length of the two lists

        int l1 = getLength(h1);
        int l2 = getLength(h2);


        //Add zeroes to the smaller of the two lists
        if (l1 > l2) {
            int difference = l1 - l2;
            while (difference > 0) {
                Node n = new Node(0);
                n.next = h2;
                h2 = n;
                difference--;

            }
        }

        if (l2 > l1) {
            int difference = l2 - l1;
            while (difference > 0) {
                Node n = new Node(0);
                n.next = h1;
                h1 = n;
                difference--;

            }
        }

        //Now the lists h1 and h2 are of equal size
        //The lists are stored in forward order 5->5->6 and 6->1 : 556 and 61
        //So have to call recursion

        result = addBackRecursion(h1, h2);  //Recursively add two lists of equal size

        if (carry != 0) {                    //Add a new node and append the result to it
            Node n = new Node(carry);
            n.next = result;
            result = n;
        }
        return result;

    }

    private Node addBackRecursion(Node h1, Node h2) {
        if (h1 == null && h2 == null) return null;  //h1 and h2 are supposed to be lists of equla length

        addBackRecursion(h1.next, h2.next);     // Call for recursion

        int a = h1.data + h2.data + carry;
        carry = 0;
        if (a > 10) {
            carry = 1;
            a = a % 10;
        }

        Node n = new Node(a);

        if (result == null) {
            result = n;
        } else {
            n.next = result;
            result = n;
        }
        return result;
    }


    public static void main(String args[]) {


        AdditionLinkedList add =new AdditionLinkedList();
        Node h1 = new Node(1);
        h1.next= new Node(1);
        h1.next.next = new Node(1);
        h1.next.next.next = new Node(7);

        Node h2 = new Node(9);
        h2.next= new Node(9);
        h2.next.next = new Node(9);
        h2.next.next.next = new Node(9);

        Node x = add.addForward(h1, h2);
        add.printList(x);
    }


}




