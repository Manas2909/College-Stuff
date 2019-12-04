#include<stdio.h>
#include<omp.h>
int main()
{	
	int id,steps;
	
	printf("enter number of steps");
	scanf("%d",&steps);
	float width=(double)1/steps;
	float pi=0.0;
	int i;
	float x;


	#pragma omp parallel for
		for(i=1;i<=steps;i++)
		{
			x=(double)i*width;
			pi +=width * (4/(1+(0.25*x*x)));	
			
		}
		

	
	
	printf("value of pi is:%f\n",pi);
	return 0;
}