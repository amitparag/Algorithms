
// Stack Operations : Push, Peek, Size, Pop


public class StackOfStrings {

    private String [] a;
    private int top;
    private int size ;


    // Constructor. Set the size of stack array to n and top of stack to -1
    StackOfStrings(int n)
    {
        a = new String[n];
        top = -1 ;
        size = n ;
    }


    //Insert Item

    void push(String s)
    {
        if( !ifFull())
        {
            top = top + 1;
            a[top] = s;
        }
    }

    boolean ifFull()
    {
        return top == size;
    }

    // Peek at the top element
    String peek()
    {

        return a[top];
    }

    int getSize()
    {
        return size;
    }

    // Delete the last inserted element
    void pop()
    {
        if (!isEmpty())
        {

        a[top] = null;       //Set it to null for garbage collection and Loitering. Garbage collectors can
                             //reclaim memory only if no outstanding references.
        top =top -1;
        }
    }

    void show()
    {
        for(int i = 0; i <= top ; ++i)
        {
            System.out.println(a[i]);
        }
    }

    boolean isEmpty()
    {
        return top == -1;
    }


    public static void main(String [] args)
    {
        StackOfStrings st = new StackOfStrings(10);
        st.push("amit");
        st.push("ami");
        st.push("amt");
        st.push("ait");
        st.push("mit");
        st.push("ami");
        st.push("am");
        st.push("a");
       // System.out.println(st.peek());
        st.pop();
        st.pop();
        st.pop();
        st.show();

    }

























}
