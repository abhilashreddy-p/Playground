#include<stdio.h>
#include<string.h>
main()
{
	char a[1000];
	int i=0;
	scanf("%[^\n]s",a);
	while(a[i]!=0)
	{
		if(a[i]!='a'&&a[i]!='e'&&a[i]!='i'&&a[i]!='o'&&a[i]!='u'&&a[i]!='A'&&a[i]!='E'&&a[i]!='I'&&a[i]!='O'&&a[i]!='U')
		printf("%c",a[i]);
		i++;
	}
	
}