#include<stdio.h>
int main()
{
int i=365,y=4,z,a;
  z=i%y;
  a=i/y;
  printf("Quotient: %d\n",a);
  printf("Remainder: %d",z);
  
  return 0;
}