#include<stdio.h>
main()
{
	int arr[100];
	int n,i,j;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	int a,b,c=-1;
	scanf("%d%d",&a,&b);
	for(i=0;i<=n;i++)
	{
		if(arr[i]==a)
		break;
	}
	if(arr[i]==a)
	printf("Element 1 index = %d\n",i);
	else
	printf("Element 1 index = %d\n",c);
    for(j=0;j<=n;j++)
	{
		if(arr[j]==b)
		break;
	}
	if(arr[j]==b)
	printf("Element 2 index = %d\n",j);
	else
	printf("Element 2 index = %d\n",c);
}