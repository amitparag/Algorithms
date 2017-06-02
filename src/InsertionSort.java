//In the ith iteration , swap a[i] with each larger entry to its left
// N^2 exchanges and comparisons
// In Selection sort, it does not matter the initial configuration of the array. Every item has to looked.
// However in Insertion sort, inversions can be counted. For partially sorted array,Insertion Sort runs in Linear time.
// In that case , the number of exchanges is equal to the number of inversions



public class InsertionSort {


    // helper function to show elements

    static void show(int[]a)
    {
        for(int i =0 ; i< a.length; ++i)
        {
            System.out.print(a[i]+ " ");
        }
    }

    // helper function to exchange elements

    static void exchange(int[] a , int i ,int j)
    {
        int temp = a[i] ;
        a[i] = a[j] ;
        a[j] = temp ;
    }

    static void insertionSort(int[] a)
    {
        int n = a.length-1;

        //To get Inversions, uncheck the comments within this code snippet

        //int count = 0;

        for(int i = 0; i <= n ; i++)
        {
            for(int j =i; j > 0; j--)
            {
                if (a[j] < a[j-1])
                {

                    //++count;

                    exchange(a, j, j - 1);


                }
                else break;

            }
        }show(a);

        // System.out.println(count);
    }


    public static void main(String[] args)
    {
        int [] a = {1,11,9,8,0,4,3,2};
        insertionSort(a);

    }










}
