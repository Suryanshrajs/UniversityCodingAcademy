#include <stdio.h>
#include <assert.h>
#include <sys/time.h>
#include <stdlib.h>
#include <time.h>

void insertion_sort(int arr[], int n)
{
        int j, key;
        for(int i = 0; i < n; i++)
        {
                key = arr[i];
                j = i-1;

                while( j >= 0 && arr[j] > key)
                {
                        arr[j+1] = arr[j];
                        j--;
                }
                arr[j+1] = key;
        }
}
long long time_elapsed(int n)
{
  int *arr = (int *) malloc(n * sizeof(int));

  srand(time(NULL));
  for(int i = 0; i < n; i++) arr[i] = rand();

  struct timeval before;
  gettimeofday(&before, NULL);
  long long before_millis = before.tv_sec*1000LL + before.tv_usec/1000;

  insertion_sort(arr, n);

  struct timeval after;
  gettimeofday(&after, NULL);
  long long after_millis = after.tv_sec*1000LL + after.tv_usec/1000;

  return after_millis-before_millis;
}

void test_simple_input()
{
  int input[] = {5, 3, 1, 9, 7};
  int expected_output[] = {1, 3, 5, 7, 9};

  insertion_sort(input, 5);

  for(int i = 0; i < 5; i++) assert(input[i] == expected_output[i]);
}

int main()
{
        test_simple_input();

        long long t1 = time_elapsed(32000);
        long long t2 = time_elapsed(64000);

        printf("%lf", t2*1.0/t1);
}