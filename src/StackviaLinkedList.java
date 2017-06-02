// Create a linked list and insert and delete through the first





public class StackviaLinkedList {


    protected class Node
    {
        int data;
        Node next;

        Node(int element)
        {
            this.data = element;
            next = null;
        }
    }

    private Node first;

    StackviaLinkedList()
    {
        first = null ;
    }

    boolean isEmpty()
    {
        return first == null;
    }

    void push(int item)
    {
        //New Items are inserted at the beginning and shifted down the linked list as it grows
        Node n = new Node(item);
        Node oldFirst = first;
        first = n;
        first.next =oldFirst;
    }

    int pop()
    {
        int item = first.data;
        first = first.next;
        return item;
    }

    int peek()
    {
        return first.data;
    }

    void display()
    {
        Node current = first;
        while(current != null)
        {
            System.out.println(current.data + " ");
            current =current.next;
        }
    }

    public  static void  main(String[] args)
    {
        StackviaLinkedList a =new StackviaLinkedList();

        a.push(10);
        a.push(0);
        a.push(110);
        a.push(120);
        a.push(103);
        a.push(108);
        a.push(101);
        a.push(1089);
        a.push(150);
        a.push(510);
        a.push(210);
        a.display();
        System.out.println(" =============");
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.display();



    }





















}
