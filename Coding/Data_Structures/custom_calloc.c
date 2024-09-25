#include <stdio.h>
#include <stdlib.h>

void* calloc_function(int number_of_bytes) {
    void* ptr = malloc(number_of_bytes);
    if (ptr == NULL) {
        return NULL; // Return NULL if malloc fails
    }

    for (int i = 0; i < number_of_bytes; i++) {
        char* curr_byte = (char*)(ptr) + i;
        *curr_byte = '\0';
    }
    return ptr;
}

int main() {
    char* array = (char*) calloc_function(10);
    if (array == NULL) {
        printf("Memory allocation failed\n");
        return 1; // Exit if memory allocation fails
    }

    int success = 1;
    for (int i = 0; i < 10; i++) {
        if (array[i] != 0) {
            printf("Wrong!!!\n");
            success = 0;
            break;
        }
    }

    if (success == 0) {
        printf("wrong implementation!!!\n");
    } else {
        printf("correct implementation...\n");
    }

    free(array); // Don't forget to free the allocated memory
    return 0;
}
