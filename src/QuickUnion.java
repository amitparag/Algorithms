// Lazy approach. The value stored at id[i] contains the index of the element to which it is connected, in the array



public class QuickUnion {


    private int [] id;

    public QuickUnion(int n)
    {
        id  = new int[n];

        for( int i = 0; i < n ; ++i)
        {
            id[i] = i ;
        }


    }


    int findRoot(int i)
    {
         while ( i != id[i]) i =id[i];

         return i;

    }


    boolean connected(int p , int q)
    {
        return findRoot(p) == findRoot(q);
    }


    void union(int p, int q)
    {
        int i = findRoot(p);
        int j = findRoot(q);
        id[i] = j;
    }


}
