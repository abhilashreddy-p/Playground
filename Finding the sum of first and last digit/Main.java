#include <stdio.h>
int main() {
	//Type your code
  int n,temp,b,c,a;
  scanf("%d",&n);
  temp=n;
  while(temp>0)
  {
    if(temp/100==0)
    {
     // temp=temp/10;
      a=temp/10;
      break;
 
    //  printf("%d",a);
    }
    temp=temp/10;
  }
   b=n%10;
       
  c=a+b;
 printf("%d",c);
  //  printf("%d",n);
	return 0;
}






