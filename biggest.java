import java.io.*;
import java.util.*;
class biggest
{
    public static void main(String args[])
    {
    int z,y,w;
    Scanner q=new Scanner(System.in);
    z=q.nextInt();
    y=q.nextInt();
    w=q.nextInt();
    if(z<y)
    {
        System.out.println("y is bigg");
    }
    else if(z>w)
    {
        System.out.println("z is bigg");
    }
    else
    {
        System.out.println("w is bigg");
    }
    }
}
