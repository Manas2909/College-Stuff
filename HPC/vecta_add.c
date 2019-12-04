#include<stdio.h>
#include<omp.h>
int main()
{
    FILE* file1=fopen("num1.txt","r");
    FILE* file2=fopen("num2.txt","r");
    long long int n1,n2;
    #pragma omp parallel sections
    {
        #pragma omp section
        {
            fscanf(file1,"%lld",&n1);
        }
        #pragma omp section
        {
            fscanf(file2,"%lld",&n2);
        }
    }
    FILE* file3=fopen("num3.txt","w");
    fprintf(file3,"%lld",(n1+n2));
}