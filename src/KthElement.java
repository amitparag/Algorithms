/*

Given an array of elements , find the kth smallest or Kth largest. or the median which is k = n/2

The Quick Select algorithm:

Shuffle the array.

Partition the array. Return the partitioning element

Check whether k is greater than or smaller than or equal to the partitioning element

Partition that part



Quick Select takes Linear time on an average and N^2 in worst case.
Blum,Flyod, Pratt, Trajan method solves the worst case scenario in linear time
but is not used in practice since constants are too high.


  */




public class KthElement {



    public static int quickSelect(int[]a, int k)
    {
        // call a Helper function to shuffle the array elements

        int low = 0, high = a.length - 1;

        while(low < high)
        {
            int j = partition(a, low, high);

            if ( j > k )high =j-1 ;
            else if (j < k) low = j+1 ;
            else return a[k];
        }
        return a[k];
    }

    private static int partition(int[] a, int low, int high)
    {
        int i = low;
        int j = high + 1 ;

        while(true)
        {
            while(a[++i] < a[low])
                if (i == high)
                    break;


            while( a[--j] > a[low])
                if( j== low)
                    break;

            if( i >= j)break;

            exchange(a, i, j);

        }

        exchange(a, low, j);

        return j;

    }


    private static void exchange(int[]a, int i, int j)
    {
        int temp = a[i] ;
        a[i] = a[j] ;
        a[j] = temp ;
    }



    public static void main(String[] args)
    {
        int[] a = {5,4,1,3,7,8,9,61,45,0};

        System.out.println(quickSelect(a, a.length/2));
    }
































































}
