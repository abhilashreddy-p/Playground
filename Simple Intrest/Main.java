#include<stdio.h>
int main()
{
  float a;
  int b;
  float c;
  scanf("%f%d",&a,&b);
  scanf("%f",&c);
  float d=(a*b*c)/100;
  printf("%f",d);
  return 0;
}