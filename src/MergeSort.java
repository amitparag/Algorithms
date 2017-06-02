/*
 See the use of assert

 Merge Sort uses NLogN compares and 6NLogN array accesses
 Needs N sized auxiliary array
 Merge Sort is optimal with respect to compares and not with respect to space usage
 Look at Merge Sort without recursion









  */




public class MergeSort {


    //Wrapper Function that takes in one argument

    public static void sort(int [] a)
    {
       int [] arrayAux = new int[a.length];  //Creating the  auxiliary array here,
                                             // since it might lead to huge overhead if created in merge( because merge has recursion)

       sort(a,arrayAux, 0, a.length-1);



    }

    private static void sort(int[]a, int[]arrayAux, int low, int high)
    {
        if(high <= low) return;

        int mid = low + (high - low)/2;  //Divide the array


        // Divide
        sort(a, arrayAux,low, mid);
        sort(a, arrayAux, mid+1, high);

        //Conquer
        merge(a, arrayAux, low, mid, high);


    }

    private static void merge(int[]a , int[] arrayAux, int low,int mid, int high)
    {
        // Precondition : Two halves must be sorted before merge takes place

        assert isSorted(a, low,mid);
        assert isSorted(a, mid+1, high);

        //Reaching this part means that the two halves are sorted

        //First copy the data from the actual array into the auxiliary array

        for(int k = low; k <= high; ++k)
        {
            arrayAux[k] = a[k];

        }

        int i =low, j = mid+1;
        for(int k = low; k <= high; ++k)
        {
            if ( i > mid)
            {
                a[k] =arrayAux[j++];         // The first array has been exhausted. So copy the entire second array
            }
            else if( j > high)
            {
                a[k] = arrayAux[i++];        // The Second array has been exhausted. So copy the first array
            }
            else if (arrayAux[j] < arrayAux[i] )
            {
                a[k] = arrayAux[j++];
            }
            else {
                    a[k] = arrayAux[i++];
            }
        }

    }



    private static boolean isSorted(int[] a, int low, int high)
    {
        for(int i =low ;i< high;++i)
        {
            if (a[i] > a[i+1])
                return false;
        }
        return true;
    }




public static void main(String[] args)
{
    int [] a = {2,4,1,0,7,6,4,5,3,8,81,9,5,21,17,15,14};

    sort(a);
    for( int i = 0; i <= a.length-1; i++)
    {
        System.out.print(a[i]+ " ");
    }

}



























}
