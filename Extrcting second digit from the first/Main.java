#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  while(n>0)
  {
    if(n/100==0)
    {
      n=n%10;
      printf("%d",n);
    }
       n=n/10;
  }
  //  printf("%d",n);
	return 0;
}






