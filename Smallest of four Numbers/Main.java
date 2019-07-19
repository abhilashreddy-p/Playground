#include<stdio.h>

int main()
{
  int a,b,c,d,small,sma,sm;
 scanf("%d%d%d%d",&a,&b,&c,&d);
  small= a<b?a:b;
  sma= small<c?small:c;
  sm= sma<d?sma:d;
  printf("%d",sm);
}