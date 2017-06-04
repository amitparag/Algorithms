public class ReverseLinkList {


    private Node head;

    protected static class Node
    {
        int data;
        Node next;

        Node(int item)
        {
            this.data = item;
            this.next = null;
        }
    }

    private void reverse()
    {
        Node current = head;
        Node previous = null;
        Node next = null;

        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    private void recursionReverse(Node current)
    {

        if(current == null)return;
        if(current.next == null)
        {
            head = current;
            return;

        }

        recursionReverse(current.next);
        current.next.next =current;
        current.next =null;


    }

    private void showList()
    {
        if (head == null)System.out.print("null");
        Node current = head ;
        while(current != null)
        {
            System.out.print(current.data + "->");
            current = current.next;
        }

    }


    public static void main(String[] args)
    {
        ReverseLinkList r =new ReverseLinkList();
        r.head =new Node(10);
        r.head.next =new Node(25);
        // r.showList();
        //r.reverse();
        //r.showList();
        r.recursionReverse(r.head);
        r.showList();


    }










}
