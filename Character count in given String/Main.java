#include<stdio.h>
#include<string.h>
int main()
{
  char ch[100];
  int i,j=0,len,count=1;
  scanf("%s",ch);
  len=strlen(ch);
  if(len>20)
    printf("Invalid Input");
  else
  for(i=0;i<len;i++)
  {
    if(ch[i]==ch[i+1])
    {
      count++;
    }
    else
    {
  printf("%c%d",ch[i],count);
      count=1;
    }

  }
}