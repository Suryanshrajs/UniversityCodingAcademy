import java.util.*;
public class min_bits_to_flip_num {
    public static int countbits(int n)
    {
        int count = 0;
        while(n > 0)
        {
            count += n&1;
            n = n>>1;
        }
        return count;
    };
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int goal = in.nextInt();

        int ans = target ^ goal;
        ans = countbits(ans);
        System.out.println(ans);
    }
}
