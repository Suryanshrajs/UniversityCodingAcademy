//26 November 2024

import java.util.*;
import java.lang.*;
import java.io.*;

public class threadExecution {
    static int count = 0;
    public static void main(String[] args) throws java.lang.Exception {
        Thread t = new Thread(()->{
                for(int i=0; i<1000; i++){
                    count++;
                }
            }
        );

        t.start();
        t.join();


        System.out.println(count);
    }
}
