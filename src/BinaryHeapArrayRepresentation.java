/*

Binary Trees :  Empty or nodes with links to left and rught binary trees

Complete Trees : Perfectly balanced except for the last level

Property: Height of a complete tree is the biggest integer less than Log N , where N is the total number of nodes

Heap Ordered Binary trees :  Keys are in the nodes and parents keys are no smaller than children keys


Priority Queue are used in a number of ways:
 Customers in a line
 Huffman Codes
 Dijkstra , Prim' algorithm on graphs
 Stream of Data
 Scheduling, Interrupt Handling

 Here Priority Queue is implemented with binary heap which is in turn implemented in an array


Binary Heap in Array:

Largest key is a[1], at position 1. This is the root of the tree
Parent of an element at index k is at index k/2
Children of an element at index k are at indexes 2k and 2k+1


 */

public class BinaryHeapArrayRepresentation {

    // Max Heap using an array

    private int [] a;
    private int n;       // Number of items in the array

    public BinaryHeapArrayRepresentation(int capacity)
    {
        a = new int [capacity+1];      // Since position 0 is not used
        n = 0 ;               //Number of items in the heap
    }

    //Insert at the last position and let it swim to its proper position

    public void insert(int item)       // Happens in LogN
    {
        a[++n] = item;                 // The array index 0 is left empty.
                                       // Insertion results in at most 1+ logN compares
        swim(n);
    }


    //Swim up function. The child node has value more than its parent , so it must swim up

    private void swim(int k)
    {

        while (k > 1 && less(k/2, k))        //While k is not the root index and item at k/2 is less than item at k
        {
            exchange(k, k/2);               // Exchange elements at k and k/2

            k = k/2;                        // Keep exchanging until heap order is restored
        }

    }

    // Helper Function to compare
    private boolean less(int i, int m)
    {
        return (a[i] < a[m])?true:false;
    }

    // Helper function to swap
    private void exchange(int i, int m)
    {
        int temp = a[i];
        a[i] = a[m];
        a[m] = temp;
    }


    //In a maxHeap, the max heap is at the top/ index 1

    public int deleteMax()                        //Happens in LogN
    {

        int deletedItem = a[1]; // To return it to the user

        exchange(1,n--);  //Exchange the last item with the first

        sink(1);         //Sink down the item at index 1 to its proper position

        // a[n+1] = null ;  To prevent loitering

        return deletedItem;


    }


    //Sink down function           Key of the parent is less than its children. So it must sink down

    private void sink(int k)
    {
        while ( 2*k <= n)            //n == number of items in the heap. So children of a node must be less than or equal to n.
        {
            int j =2*k;         //To sink item at kth index , it children at 2k and 2k +1 need to be checked

            if( j < n && less(j, j+1))j++;  // Suppose k has 2 kids, 2k and 2k+1 and both of them are bigger than k.
                                                // Then k is exchanged with its biggest kid

            if(!less(k, j))break;
            exchange(k,j);
            k = j;
        }
    }


    public int getMax()        // Constant time
    {
        return a[1];
    }

    public int getItems() {
        return n;
    }

    public void showHeap()
    {
        for(int i = 1; i < n; ++i)
        {
            System.out.println( a[i] + " index " + i );
        }
    }




public static void main(String[] args)
{
    BinaryHeapArrayRepresentation b = new BinaryHeapArrayRepresentation(20);
    b.insert(12);
    b.insert(14);
    b.insert(1);
    b.insert(13);
    b.insert(17);
    b.insert(2);
    b.insert(3);
    b.insert(5);
    b.insert(114);
    b.insert(41);
    b.insert(40);
    b.insert(4);



    //System.out.print(b.getMax() +" "+ b.getItems());
    b.deleteMax();
    b.showHeap();
}




































}
