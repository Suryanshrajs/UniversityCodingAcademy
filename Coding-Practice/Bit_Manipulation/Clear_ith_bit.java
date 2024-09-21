import java.util.*;

public class clear_ith_bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i;
        n = in.nextInt();
        i = in.nextInt();
        int ans = (~(1 << i)) & n;
        System.out.println(ans);
    }
}
