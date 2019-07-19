#include<stdio.h>
int main()
{
  int n,a=0,b=1,sum=0;
  scanf("%d",&n);
  printf("%d %d ",a,b);
  for(int i=0;i<n-2;i++)
  {
   sum=a+b;
    a=b;
    b=sum;
    printf("%d ",sum);
  }
  
    
    
    
}