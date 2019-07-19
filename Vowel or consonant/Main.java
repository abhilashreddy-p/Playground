#include<stdio.h>
int main()
{
char ch;
  scanf("%c",&ch);
  if(ch>94)
    ch=ch-32;
  
  if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    printf("Vowel");
  else
    printf("Consonant");
  return 0;
}