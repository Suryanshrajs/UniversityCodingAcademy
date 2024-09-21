import java.util.*;

public class check_power_of_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int ans = n & (n-1);
        if( ans == 0)
            System.out.println("Power of 2");
        else
            System.out.println("Not a power of 2");
    }
}
