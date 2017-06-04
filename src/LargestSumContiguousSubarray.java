public class LargestSumContiguousSubarray {


    public static int lcs(int[]a ) {

        int n = a.length - 1;

        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i <= n; ++i) {
            max_ending_here += a[i];

            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_ending_here > 0 && max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }

        }
        return max_so_far;


    }


    public static void main(String[] args)
    {
        int[] a ={1,-2,-3,4,5,-6,-7,-8};

        System.out.println(lcs(a));
    }
}
