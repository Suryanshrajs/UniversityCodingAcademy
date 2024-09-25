#include <stdio.h>
#include <assert.h>
#include <time.h>
#include <sys/time.h>
#include <stdlib.h>


void merge(int arr[], int left, int mid, int right, int n)
{
        int ans[n];
        int k = 0;

        int i = left;
        int j = mid+1;

        while(i <= mid && j <= right)
        {
                if(arr[i] < arr[j])
                {
                        ans[k++] = arr[i];
                        i++;
                }
                else if(arr[j] < arr[i])
                {
                        ans[k++] = arr[j];
                        j++;
                }
        }

        while(i <= mid)
        {
                ans[k++] = arr[i];
                i++;
        }

        while(j <= right)
        {
                ans[k++] = arr[j];
                j++;
        }

        for(int i = left; i <= right; i++)
        {
                arr[i] = ans[i-left];
        }
        return;

}


void merge_sort(int arr[], int left, int right)
{
        if(left >= right)
                return;

        int mid = (left+right)/2;

        merge_sort(arr,left,mid);
        merge_sort(arr,mid+1,right);
        merge(arr, left, mid, right,right-left+1);
}


long long time_elapsed(int n)
{
  int *arr = (int *) malloc(n * sizeof(int));

  srand(time(NULL));
  for(int i = 0; i < n; i++) arr[i] = rand();

  struct timeval before;
  gettimeofday(&before, NULL);
  long long before_millis = before.tv_sec*1000LL + before.tv_usec/1000;

  merge_sort(arr, 0 , n-1);

  struct timeval after;
  gettimeofday(&after, NULL);
  long long after_millis = after.tv_sec*1000LL + after.tv_usec/1000;

  return after_millis-before_millis;
}

void test_simple_input()
{
  int input[] = {5, 3, 1, 9, 7};
  int expected_output[] = {1, 3, 5, 7, 9};

  merge_sort(input,0,4);

  for(int i = 0; i < 5; i++) assert(input[i] == expected_output[i]);
}

int main()
{
        test_simple_input();

        long long t1 = time_elapsed(32000);
        long long t2 = time_elapsed(64000);

        printf("%lf", t2*1.0/t1);
}
