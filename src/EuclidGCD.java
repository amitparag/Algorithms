




public class EuclidGCD {


    public static int gcd(int p, int q)
    {

        return (q == 0) ? p : gcd(q, p % q);

    }




    public static void main(String[] args)
    {
        System.out.print(gcd(77,22));


    }


}
