import java.util.*;
public class Sum_of_even_fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int a = 1,b = 1;
        for(int i = 3; i <= n; i ++)
        {
            int c = a+b;
            if(i%3 == 0)
            {
                System.out.print(c + " ");
            }
            a = b;
            b = c;
        }
    }
}
