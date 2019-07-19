#include<stdio.h>
#include<math.h>
int three(int n)
{
  int term;
  term= pow(3,n-1);
  return term;
}
int two(int n)
{
  int term;
  term= pow(2,n-1);
  return term;
}


  
int main()
{
 int n;
  scanf("%d",&n);
  if(n%2==0)
    printf("%d",three(n/2));
  else
    printf("%d",two((n/2)+1));
  return 0;
}