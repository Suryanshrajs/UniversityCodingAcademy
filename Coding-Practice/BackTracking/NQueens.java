import java.util.*;
public class NQueens {
    public static boolean checkValid(char arr[][], int r, int c,int m, int n)
    {
        //check row
        for(int i = r-1; i >= 0; i--)
        {
            if(arr[i][c] == 'Q')
                return false;
        }

        //check right diagonal
        int i = r;
        int j = c;

        while(i >= 0 && j <= n-1)
        {
            if(arr[i][j] == 'Q')
                return false;
            i--;
            j++;
        }

        //check left diagonal
        i = r;
        j = c;

        while(i >= 0 && j >= 0)
        {
            if(arr[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        return true;
    }
    public static void placeQueens(int row, int m,int n, char arr[][])
    {
        if(row >= m)
        {
            print(arr,m,n);
            System.out.println();
            return;
        }

        for(int i = 0; i < n; i++)
        {
            if(checkValid(arr,row,i,m,n) == true) {
                arr[row][i] = 'Q';
                placeQueens(row + 1, m, n, arr);
                arr[row][i] = '.';
            }
        }
        return;
    }
    public static void print(char[][] arr, int m, int n)
    {
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m,n;
        m = in.nextInt();
        n = in.nextInt();

        char arr[][] = new char[m][n];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = '.';
            }
        }
        placeQueens(0,m,n,arr);
    }
}
