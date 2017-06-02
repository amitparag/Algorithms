






public class HeapSort {




    public static void sort(int[] pq) {
        int n = pq.length;
        for (int k = n / 2; k >= 1; k--)
            sink(pq, k, n);
        while (n > 1) {
            exchange(pq, 1, n--);
            sink(pq, 1, n);
        }

    }







    private static void sink(int[]a, int k, int n)
    {
        while ( 2*k <= n)            //n == number of items in the heap. So children of a node must be less than or equal to n.
        {
            int j =2*k;         //To sink item at kth index , it children at 2k and 2k +1 need to be checked

            if( j < n && less(a, j, j+1))j++;  // Suppose k has 2 kids, 2k and 2k+1 and both of them are bigger than k.
            // Then k is exchanged with its biggest kid

            if(!less(a, k, j))break;
            exchange(a, k, j);
            k = j;
        }
    }

    // Helper Function to compare
    private static boolean less(int[]a,int i, int m)
    {
        return (a[i-1] < a[m-1])?true:false;
    }

    // Helper function to swap
    private static void exchange(int[]a, int i, int m)
    {
        int temp = a[i-1];
        a[i-1] = a[m-1];
        a[m-1] = temp;
    }

    public static void show(int[]a )
    {
        for(int i = 0; i < a.length-1; ++i)
        {
            System.out.println( a[i] + " index " + i );
        }
    }



public static void main(String[] args)
       {
    int[] a = {12,12,13,14,15,7,5,6,1,8};
    sort(a);
    show(a);



        }




}













