#include<stdio.h>
int main()
{
  	int arr[100];
  int n,i,large;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  large=arr[0];
  for(i=1;i<n-1;i++)
  {
    if(arr[i]>large)
      large=arr[i];
  
  }
  printf("%d",large);
    
}