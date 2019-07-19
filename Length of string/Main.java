#include<stdio.h>
#include<string.h>
int main()
{
	char s[1000];
	int c=0,i;
	scanf("%[^\n]s",s);
	//gets(s);
	for(i=0;s[i]!='\0';i++)
	{   
           c++;
	}
	printf("%d",c);
	return 0;
           
}