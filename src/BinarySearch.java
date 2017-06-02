public class BinarySearch{


    public static int binary(int []a , int key)
    {
        if (a.length < 1) return -1;

        int low = 0;
        int high =a.length-1;

        while(low <= high)
        {
            int middle = low + (high - low)/2;

            if( a[middle] < key)low = middle +1;
            else if (a[middle] > key)high = middle-1;
            else return middle;
        }
        return -1;
    }


    public static void main(String[] args0)
    {
        int []a = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.print(binary(a,5));
    }

}
