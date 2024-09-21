package Backtracking;
import java.util.*;

public class Print_All_Paths {
    public static void printAllPaths(int sr,int sc,int er, int ec)
    {
        if(sr >= er || sc >= ec)
            return;

        if(sr == er-1 && sc == ec-1)
        {
            System.out.println(sr + " " + sc);
            return;
        }

        System.out.print(sr + " " + sc);

        printAllPaths(sr+1,sc,er,ec);
        printAllPaths(sr,sc+1,er,ec);
        return;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int m,n;
        m = in.nextInt();
        n = in.nextInt();

        printAllPaths(0,0,m,n);
    }
}
