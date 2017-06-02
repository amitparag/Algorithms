// Read Algorithm in Analysis of Algorithms


import java.util.Stack;

public class Dijkstra2StackInfixEvaluate {

    static Double dijkstra(String s)
    {
        Stack<Double> value = new Stack<>();
        Stack<String> operator = new Stack<>();


        for(int i = 0; i < s.length(); ++i)
        {
            String  ch = s.charAt(i) + "";

           switch (ch)
           {
               case "+": operator.push(ch);

               case "-": operator.push(ch);

               case "/": operator.push(ch);

               case "*":  operator.push(ch);

               case "(":

               case ")":
                   {
                       String op = operator.pop();

                       if (op.equals("+"))
                       {
                           value.push(value.pop() + value.pop());

                       }

                       if (op.equals("-"))
                       {
                           value.push(value.pop() - value.pop());

                       }

                       if (op.equals("*"))
                       {
                           value.push(value.pop() * value.pop());

                       }

                       if (op.equals("/")) {
                           value.push(value.pop() / value.pop());

                       }
                   }

                  default: value.push(Double.parseDouble(ch));
           }

        }
        return value.pop();
    }



public static void main(String[] args)
{

    System.out.println(dijkstra("1+2"));
}


















}
