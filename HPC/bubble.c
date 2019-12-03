#include <stdio.h>
#include <omp.h>

void serial_bubble(long long int size)
{
long long int i,j;
long long int arr[size];	
long long int temp;
#pragma omp for
for( i=0; i<size; i++){
arr[i] = size-i;
}
double start_Serial = omp_get_wtime();
for( i=0; i<size; i++){


for( j=0; j<size-1; j+=1){	
if(arr[j]>arr[j+1]){
// swap
temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
}

}
      /*for(i=0;i<size;i++)
      {
      printf("%lld",arr[i]);
      }*/	
      
       printf("\nSerial Time = %f\n", (omp_get_wtime() - start_Serial));


}
void parallel_bubble(long long int size)
{
long long int i,j;
long long int arr2[size];	

#pragma omp for
for( i=0; i<size; i++){
arr2[i] = size-i;
}
long long int temp;
double start_Parallel = omp_get_wtime();
// use bubble sort
for( i=0; i<size/2+1; i++){

#pragma omp for
for( j=0; j<size-1; j+=2){	// compare even positioned elements
if(arr2[j]>arr2[j+1]){
// swap
temp = arr2[j];
arr2[j] = arr2[j+1];
arr2[j+1] = temp;
}
//printf("%lld",arr2[j]);
}

#pragma omp for
       for( j=1; j<size-1; j+=2){        // compare odd positioned elements
               if(arr2[j]>arr2[j+1]){
// swap
                       temp = arr2[j];
                       arr2[j] = arr2[j+1];
                       arr2[j+1] = temp;
               }
               //("%lld",arr2[j]);
       }

}
/*
for(i=0;i<size;i++)
{
printf("%lld\t",arr2[i]);
}*/

       printf("\nParallel Time = %f\n", (omp_get_wtime() - start_Parallel));



}
int main(){

long long int size;	// size of array to be sorted
//float temp;	// for swapping purpose
//	printf("Enter size : ");
//	scanf("%lld", &size);
//	long long int i;

//	float arr2[size];
// generate the array

printf("Enter size : ");
scanf("%lld", &size);
int choice;
printf("Enter choice : ");
scanf("%d", &choice);
if(choice==1)
{
parallel_bubble(size);
}
if(choice==2)
{
serial_bubble(size);
}
}