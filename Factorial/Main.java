#include<stdio.h>
int main()
{
  long int n,fact=1;
  scanf("%ld",&n);
  for(int i=n;i>=1;i--)
  {
   fact=fact*i;
  }
  printf("%ld",fact);
  return 0;
}