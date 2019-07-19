#include<stdio.h>
#include<string.h>
int main()
{
 char ch[100];
  char c[100];
  char b[100];
  int i;
  scanf("%s",ch);
   scanf("%s",c);
    scanf("%s",b);
  for(i=0;i<strlen(ch);i++)
  {
  if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
  {
    ch[i] = '$' ;
  }
    printf("%c",ch[i]);
  }
   for(int i=0;i<strlen(c);i++)
  {
  	 if(!(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'))
  //if(c[i]!='a'||c[i]!='e'||c[i]!='i'||c[i]!='o'||c[i]!='u'||c[i]!='A'||c[i]!='E'||c[i]!='I'||c[i]!='O'||c[i]!='U')
    {
    c[i] = '#';
        printf("%c",c[i]);
     }
     else
      printf("%c",c[i]);
   }
    for(int i=0;i<strlen(b);i++)
    {
      if(b[i]>96)
    	b[i]=b[i]-32;
    	printf("%c",b[i]);
	}
   
     return 0;
  }
  