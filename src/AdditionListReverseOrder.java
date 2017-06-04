public class AdditionListReverseOrder {

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


    public Node addReverse(Node h1, Node h2)
    {
        int carry = 0 ;
        Node result = null;
        Node current_node_in_result = null ;

        while(h1 != null && h2 !=null)
        {
            int total = h1.data + h2.data + carry ;
            if(total > 10)
            {
                 carry =1;
                total = total -10;
            }

            if( result == null)
            {
                result = new Node(total);
                current_node_in_result = result;
            }
            else
                {
                    Node n = new Node(total);
                    current_node_in_result.next = n;
                    current_node_in_result = current_node_in_result.next;
                }

            h1 = h1.next;
            h2 = h2.next;
        }

        while(h1!=null){
            int x= h1.data + carry;
            Node n = new Node(x);
            current_node_in_result.next = n;
            current_node_in_result = current_node_in_result.next;
            h1=h1.next;
            carry=0;
        }
        while(h2!=null){
            int x= h2.data + carry;
            Node n = new Node(x);
            current_node_in_result.next = n;
            current_node_in_result = current_node_in_result.next;
            h2=h2.next;
            carry=0;
        }

        if(carry>0){
            Node n = new Node(1);
            current_node_in_result.next = n;
            current_node_in_result = current_node_in_result.next;
    }

    return result;
}
}
