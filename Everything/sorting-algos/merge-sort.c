#include <stdio.h>
#include <assert.h>
#include <time.h>
#include <sys/time.h>
#include <stdlib.h>


void merge(int arr[], int aux[], int start, int mid, int end){

    for(int i = start; i <= end ; i++) aux[i] = arr[i];

    int left = start;
    int right = mid + 1;

    for(int k = start; k <= end ; k++){


        if(left > mid) arr[k] = aux[right++];
        else if(right > end) arr[k] = aux[left++];
        else if(aux[left] <= aux[right]) arr[k] = aux[left++];
        else arr[k] = aux[right++]; 

    }
}

void mergeSort(int arr[], int aux[], int start, int end){

    if(start >= end){
        return;
    }

    int mid = start + (end - start) / 2;
    mergeSort(arr, aux, start, mid);
    mergeSort(arr, aux, mid + 1, end);
    merge(arr, aux, start, mid, end);    

}

void sortArr(int arr[], int n){

    int* aux = (int *) malloc(n * sizeof(int));
    mergeSort(arr, aux, 0, n - 1);
    free(aux);

}


long long calc_runtime(int arr[], int n){

    struct timeval before;  // <time.h>
    gettimeofday(&before, NULL);
    long long before_millis = before.tv_sec*1000LL + before.tv_usec/1000;

    // tv_sec stores seconds
    // tv_usec stores microseconds

    sortArr(arr, n);

    struct timeval after;  // <time.h>
    gettimeofday(&after, NULL);
    long long after_millis = after.tv_sec*1000LL + after.tv_usec/1000;
    
    return after_millis - before_millis;
    
}

void test_simple_output(){

    int arr [] = {3, 1, 5, 7, 0, 10};
    int expected_output [] = {0, 1, 3, 5, 7, 10};
    int n = 6;
    
    sortArr(arr, n);

    for(int i = 0 ; i < n ; i++){

        assert(arr[i] == expected_output[i]);
    
    }

}

int main(){

    // checking if the sort work correclty simply
    test_simple_output();

    // now calc runtime

    srand(time(NULL));  // <stdlib.h> and <sys/time.h>
    
    int k = 32000;
    int *arr1 = (int*) malloc(sizeof(int) * k);
    for(int i = 0 ; i < k; i++){

        arr1[i] = rand();

    }

    long long t1 = calc_runtime(arr1, k);

    k = 64000;
    int *arr2 = (int*) malloc(sizeof(int) * k);
    for(int i = 0 ; i < k; i++){

        arr2[i] = rand();

    }

    long long t2 = calc_runtime(arr2, k);

    printf("%lf\n", t2*1.0 / t1);

    free(arr1);
    free(arr2);


    return 0;

}