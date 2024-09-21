import java.util.*;
public class SwapTwoNum {
    public static void main(String[] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        System.out.println("Numbers before being swapped: " + a + " " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Numbers after being swapped: " + a + " " + b);
    }
}
