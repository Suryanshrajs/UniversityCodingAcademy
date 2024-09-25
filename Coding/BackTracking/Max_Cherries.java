package Backtracking;

2 directions (right and down)
import java.util.*;

public class MaxCherries {
    public static int maxCherriesFound(char arr[][], int i,int j,int m, int n,int cherries)
    {
        if(i >= m || j >= n)
            return 0;

        if(i == m-1 && j == n-1)
        {
            return (arr[i][j] == '1'? cherries+1 : cherries);
        }

        if(arr[i][j] == '1')
        {
            cherries += 1;
        }
        int right = maxCherriesFound(arr,i,j+1,m,n,cherries);
        int down = maxCherriesFound(arr,i+1,j,m,n,cherries);

        return Math.max(right,down);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,n,ans = 0;
        m = in.nextInt();
        n = in.nextInt();

        char arr[][] = new char[m][n];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = in.next().charAt(0);
            }
        }

        ans = maxCherriesFound(arr,0,0,m,n,0);
        System.out.println(ans);
    }
}




//4 directions(up,down,left,right)

//import java.util.*;
//
//public class MaxCherries {
//    public static int maxCherriesFound(char arr[][], int i,int j,int m, int n,int cherries,boolean visited[][])
//    {
//        if(i >= m || j >= n || i < 0 || j < 0 || visited[i][j] == true)
//            return 0;
//
//        if(i == m-1 && j == n-1)
//        {
//            return (arr[i][j] == '1'? cherries+1 : cherries);
//        }
//
//        visited[i][j] = true;
//        if(arr[i][j] == '1')
//        {
//            cherries += 1;
//        }
//        int right = maxCherriesFound(arr,i,j+1,m,n,cherries,visited);
//        int down = maxCherriesFound(arr,i+1,j,m,n,cherries,visited);
//        int left = maxCherriesFound(arr,i,j-1,m,n,cherries,visited);
//        int up = maxCherriesFound(arr,i-1,j,m,n,cherries,visited);
//
//        visited[i][j] = false;
//        return Math.max(up,Math.max(left,Math.max(right,down)));
//
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int m,n,ans = 0;
//        m = in.nextInt();
//        n = in.nextInt();
//
//        char arr[][] = new char[m][n];
//        boolean visited[][] = new boolean[m][n];
//
//        for(int i = 0; i < m; i++)
//        {
//            for(int j = 0; j < n; j++)
//            {
//                arr[i][j] = in.next().charAt(0);
//            }
//        }
//
//        ans = maxCherriesFound(arr,0,0,m,n,0,visited);
//        System.out.println(ans);
//    }
//}
