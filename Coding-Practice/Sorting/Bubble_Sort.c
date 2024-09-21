#include <stdio.h>
#include <assert.h>
#include <stdlib.h>
#include <time.h>
#include <sys/time.h>

void exch(int arr[], int i, int j)
{
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

void bubble_Sort(int arr[], int n)
{
  int i , j;
  bool swapped;
  for(int i = 0; i < n-1 ; i++)
  {
    swapped = false;
    for(j = 0; j < n-i-1; j++)
    {
      if(arr[j] > arr[j+1])
      {
        swap(arr[j], arr[j+1]);
        swapped = true;
      }
    }
    if(swapped == false)
    break;
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

  bubble_Sort(arr, n);

  struct timeval after;
  gettimeofday(&after, NULL);
  long long after_millis = after.tv_sec*1000LL + after.tv_usec/1000;

  return after_millis-before_millis;
}

void test_simple_input()
{
  int input[] = {5, 3, 1, 9, 7};
  int expected_output[] = {1, 3, 5, 7, 9};

  bubble_Sort(input, 5);

  for(int i = 0; i < 5; i++) assert(input[i] == expected_output[i]);
}

int main()
{
  test_simple_input();

  long long t1 = time_elapsed(32000);
  long long t2 = time_elapsed(64000);

  printf("%lf", t2*1.0/t1);
  return 0;
}
