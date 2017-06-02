package Back;/*

Find the number of ways in which a change can be made for a given amount.

Amount  = A
coins [c1, c2, c3 ]


Algorithm : The number of ways to make a change of A = 1 + number of ways to make a change of (A-1)





 */












public class CoinChange {

//Recursive Solution. This takes exponential time

    //There is a subtle difference in the use m and m-1. m is the number of coins whereas a to m-1 is the length of coin array


    public static int change(int[]c, int amount)  //A wrapper function to call change()
    {
       return change(c , amount, c.length);      //m is number of coins
    }

    private static int change(int[] c, int amount, int m)
    {

        // Base Case 1: amount = 0

        if(amount == 0)return 1;      //Only one way to make amount 0: don't include any coins

        //Base Case 2: amount < 0

        if(amount < 0)return 0;        // No solution exists

        //Base Case 3: There are no coins and amount >= 1

        if( m == 0 && amount >=1)return 0;     //No Solution exists


        return change(c , amount , m-1)   // ways to make amount using m-1 coins
                    + change(c , amount-c[m-1], m ); // ways to make amount - value of one coin using m coins


    }














    public static void main(String[] args)
    {
        int [] c = {1,3,5};
        System.out.print(change(c, 12));
    }






























}
