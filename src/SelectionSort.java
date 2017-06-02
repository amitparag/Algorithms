// In the ith iteration , find the index_min of the smallest remaining entry. Swap a[i], a[min]
// It uses (N^2)/2  comparisons and N exchanges
// For a production ready code, use compareto to chack if data types are the same



public class SelectionSort {


    // Helper Function to display array

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

    static void selecSort(int [] a)
    {
        int n = a.length -1;



        for (int i = 0; i < n; i++)
        {
            int min = i;

            for (int j =i+1 ; j< n ; ++j)
            {
                if( a[j] < a[min])

                {
                    min = j ;
                    exchange(a, i, min);
                }
            }
        }
        show(a);

    }



    public static void main(String[] args)
    {
        int [] a = {1,2,3,4,2,21,18,9,66,177};
        selecSort(a);
    }


























}
