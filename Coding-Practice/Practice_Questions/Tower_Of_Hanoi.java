import java.util.*;
public class Tower_Of_Hanoi {
    public static int t_o_h(int n, char from, char aux, char to)
    {
        int ans = 0;
        if(n == 1)
        {
            System.out.println("Move 1 disc from "+ from+ " to "+ to);
            return 1;
        }

        ans += t_o_h(n-1, from,to, aux);   //first move n-1 from A to B
        System.out.println("Move "+n+" discs from "+ from+ " to "+ to);
        ans += 1;
        ans += t_o_h(n-1 ,aux,from,to);   // move n-1 from B to C
        return ans;
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n;  // number of disks
        n = in.nextInt();
        int ans = t_o_h(n,'A','B','C');
        System.out.println(ans);
    }
}
