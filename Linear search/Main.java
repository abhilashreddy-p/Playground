#include<stdio.h>
int main()
{
  int arr[100],n,a;
  int i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d ",&arr[i]);
  }
    scanf("%d",&a);
  
  for(i=0;i<=n;i++)
  {
  if(arr[i]==a)
  {
    break;
  }
   
  }
  if(arr[i]==a)
     printf("%d",i+1);
  else
    printf("%d isn't present in the array.",a);
  return 0;
}