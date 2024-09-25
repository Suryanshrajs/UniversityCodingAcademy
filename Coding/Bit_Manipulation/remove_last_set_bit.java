import java.util.*;

public class Remove_last_set_bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        System.out.println(n & (n-1));
    }
}
