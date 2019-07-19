#include<stdio.h>

int main()
{
char ch[1000];
  int i=0,count=0;
  scanf("%[^\n]s",ch);
  while(ch[i]!='\0')
  {
   if(ch[i]==' ')
     count++;
    i++;
 }
  printf("%d",count+1);
  return 0;
}