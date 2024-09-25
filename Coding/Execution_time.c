#include <stdio.h>
#include <time.h>

int main() {
    clock_t start_time, end_time;
    double cpu_time_used;

    // Record the start time
    start_time = clock();
  
    int sum = 0;
    for (int i = 1; i <= 1000000; ++i) {
        sum += i;
    }

    // Record the end time
    end_time = clock();

    // Calculate the CPU time used in seconds
    cpu_time_used = ((double) (end_time - start_time)) / CLOCKS_PER_SEC;

    printf("Sum: %d\n", sum);
    printf("CPU Time Used: %f seconds\n", cpu_time_used);

    return 0;
}


/* EXPLANATION OF THE CODE */

// clock_t is a data type present in time.h
// clock() function returns the number of clock ticks used by the program
// we can convert the clock ticks into seconds using CLOCKS_PER_SEC
