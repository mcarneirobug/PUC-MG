#include <stdio.h>
#include <omp.h>

int main() {
    int i;
    #pragma omp parallel num_threads(2) // seta o numero de threads em 2
    {
       int tid = omp_get_thread_num(); // ler o identificador da threads
       #pragma omp for ordered schedule(dynamic, 2)
       for(i = 1; i <= 3; i++) {
        #pragma omp ordered 
        {
          printf("[PRINT1] T%d = %d \n",tid,i);
          printf("[PRINT2] T%d = %d \n",tid,i);
        } //end ordered
       } //end for
    } //end pragma
} //end main
