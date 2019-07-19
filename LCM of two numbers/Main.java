#include<stdio.h>
main()
{
  int a,b,gcd,lcm,c,i;
  scanf("%d%d",&a,&b);
  if(a>b)
    c=b;
  else
    c=a;
  for(i=c;i>=1;i--)
  {
    if(a%i==0 && b%i==0)
    {
      gcd=i;
      break;
    }
  }
  lcm= (a*b)/gcd;
  printf("%d",lcm);
 
}