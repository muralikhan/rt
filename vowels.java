import java.io.*;
import java.util.*;
class vowels
{
    public static void main(String args[])
    {
    Scanner q=new Scanner(System.in);
    char z=q.next().charAt(0);
    if((z=='a')||(z=='e')||(z=='i')||(z=='o')||(z=='u'))
    {
        System.out.println("vowels");
    }
    else
    {
        System.out.println("consonant");
    }
    }
}
