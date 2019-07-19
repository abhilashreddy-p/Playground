#include <stdio.h>
#include <math.h>
int main() {
	int fact,sum=0,r,n,count=0;
  scanf("%d",&n);
  int temp=n;
  int x=n;
  while(n>0)
  {
    r=n%10;
    count=count+1;
    n=n/10;
    }
  while(x>0)
  {
      r=x%10;
      fact=pow(r,count);
    sum=sum+fact;
    x=x/10;
  }
  if(temp==sum)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");

	return 0;
}
