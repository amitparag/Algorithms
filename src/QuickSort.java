//Insertion and Merge Sort are stable sort
/*

Basic Plan:
        Shuffle the array. This is important at the beginning
        Partition so that for some entry j,
         - entry[j] is in its final place
         - no larger element to the left of j
         - no smaller element to the right of j
         Recursively sort the remaining left and right pieces

Phase 1:

Repeat until pointers i and j cross each other:

 Scan i from the left as long as a[i] < a[partition]
 Scan j from the right as long as a[j] > a[partition]
 exchange a[i] and a[j

 Phase 2:

When the pointers cross, exchange a[partition] with a[j]
Return j, which is the new partition element.








 */


import java.util.Arrays;
import java.util.Random;


public class QuickSort
{


    // A wrapper function for sort
    public static void sort(int[]a)
    {
        //Write/Call a Shuffle method to sort the array

        sort(a, 0, a.length-1);

    }

    private static void sort(int[]a, int low, int high)
    {
        if(high < low) return;

        int j = partition(a, low,  high);   // Partitioning element is j.

        sort( a, low, j-1);  //Divide and Sort
        sort(a, j+1, high);

    }

    private static int partition(int[]a ,int low, int high)
    {
        int i = low,  j= high +1;

        while( true ) // while the two pointers do not cross each other
        {
            while( a[++i] < a[low])    // Left side pointer
                if( i == high)
                    break;

            while( a[--j] > a[low])     // Right side pointer
                if( j == low)
                    break;

            if( i >= j)break;            // Pointers have crossed

            exchange(a, i, j);           //Pointers haven't crossed. So exchange i and j elements
        }

        exchange(a, low, j);       //Pointers have crossed. So exchange low and j elements
        return j;
    }


    //A utility function to swap two elements

    private static void exchange(int[]a, int i, int j)
    {
        int temp = a[i] ;
        a[i] = a[j] ;
        a[j] = temp ;
    }


    static void show(int[]a)
    {
        for(int i =0 ; i< a.length; ++i)
        {
            System.out.print(a[i]+ " ");
        }
    }


    public static void main(String[] args)
    {

        int[] a = {5,4,1,3,7,8,9,61,45,0};
        sort(a);
        show(a);



    }















































}