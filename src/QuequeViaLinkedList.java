public class QuequeViaLinkedList {

    protected class Node
    {
        int data;
        Node next;

        Node(int item)
        {
            this.data =item;
            this.next =null;
        }
    }


    private Node first, last;

    QuequeViaLinkedList()
    {
        first =last = null;
    }

    void enqueque(int item)
    {
        Node oldLast = last;
        Node n = new Node(item);

        if(isEmpty())
        {
            first = last = n;
        }
        else
            {
                last = n;
                oldLast.next = last;
            }
    }

    boolean isEmpty()
    {
        return first == null;
    }

    int pop()
    {
        int i = first.data;
        first = first.next;
        if(isEmpty())last = null;
        return i;
    }


    void display()
    {
        Node current = first;
        while(current != null)
        {
            System.out.print(current.data + "->");
            current =current.next;
        }

    }

    public static void main(String[] args)
    {
        QuequeViaLinkedList q = new QuequeViaLinkedList();
        q.enqueque(10);
        q.enqueque(1);
        q.enqueque(100);
        q.enqueque(103);
        q.enqueque(108);
        q.enqueque(180);
        q.enqueque(106);
        q.enqueque(160);
        q.enqueque(101);

        q.pop();
        q.display();

    }






















































}
