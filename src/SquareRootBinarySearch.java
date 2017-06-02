
// the square root of a number will lie between 0 and half of that number



// Optimised the for loop to run till mid, since square root of a number cannot be greater than half of the number


public class SquareRootBinarySearch {


    private static int squareRoot(int x)
    {

        if (x == 0 || x ==1)return x;

        int start = 1;

        int end = (x+1)/2;

        int answer = 0;

        while ( start <= end)
        {
            int mid = start + (end - start)/2 ;

            if (mid * mid == x)
            {
                answer = mid ;
                return answer;
            }

            if( mid * mid < x)
            {
                start = mid +1;
                answer =mid;
            }
            else
                {
                    end = mid -1;
                }
        }
    return answer;
    }

    public static void main(String[] args0)
    {

        System.out.print(squareRoot(48));




    }

}
