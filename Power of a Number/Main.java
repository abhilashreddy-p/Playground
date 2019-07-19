#include <stdio.h>
#include <math.h>
int main()
{
long int b,e,ans;
  scanf("%ld%ld",&b,&e);
  if(e<0)
    printf("Wrong input");
  else
  {
    ans=pow(b,e);
  printf("%ld",ans);
  }
    return 0;
}