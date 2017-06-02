
// To slow for huge problems in dynamic connectivity


public class QuickFind
{

    private int [] id;

    public QuickFind(int n)
    {
      id  = new int[n];

      for( int i = 0; i < n ; ++i)
      {
          id[i] = i ;
      }


    }


    public boolean isConnected (int p , int q)
    {

        return id[p] == id[q];
    }


    void union (int p , int q)
    {

        int pid = id[p];

        int qid = id[q];

        for(int i =0 ; i < id.length ; i++)  //Traverse the entire array and change every element with value pid to qid
        {
            if (id[i] == pid)
            {
                id[i] =  qid;
            }
        }

    }

}
