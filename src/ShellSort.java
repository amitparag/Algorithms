// Insertion Sort is inefficient because elements move one element at a time. Shell Sort moves elements several steps.
// Here, incrementing in steps of 3*h +1





public class ShellSort {

    //Helper function to display array

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


    static void shell(int[] a){
    int n = a.length;

    // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ...
    int h = 1;

    while (h < n/3) h = 3*h + 1;

        while (h >= 1) {
        // h-sort the array
        for (int i = h; i < n; i++) {
            for (int j = i; j >= h && (a[j] < a[j-h]); j -= h) {
                exchange(a, j, j-h);
            }
        }

        h /= 3;
    }

    }



    public static void main(String[] args)
    {
        int [] a = {1,11,9,8,0,4,3,2};
        shell(a);
        show(a);

    }

}
