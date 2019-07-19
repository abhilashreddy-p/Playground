#include<stdio.h>
int mul(int n)
{
  int term;
  term=0+(n-1)*2;
  return term;
}
int ser(int n)
{
  int term;
  term=0+(n-1)*1;
  return term;
 
}

int main()
{
	int n;
  scanf("%d",&n);
  if(n%2==0)
     printf("%d",ser(n/2));
 else
  printf("%d",mul((n/2)+1));
 
	
}