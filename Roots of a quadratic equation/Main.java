#include<stdio.h>
#include<math.h>
int main()
{
  double a,b,c,realPart,ima;
  double dis,root1,root2;
  scanf("%lf %lf %lf",&a,&b,&c);
dis = (b*b)-4*a*c;
 if(dis>0)
 {
   root1= (-b+sqrt(dis))/(2*a);
      root2= (-b-sqrt(dis))/(2*a);
  printf("root1 = %.2lf  ",root1);
  printf("root2 = %.2lf",root2);
}
 else if(dis==0)
  {
    root1=root2=(-b/(2*a));
     printf("root1 = %.2lf  ",root1);
  printf("root2 = %.2lf",root2);
 }
else
{
    realPart = -b/(2*a);
     ima= sqrt(-dis)/(2*a);
  printf("root1 = %.2lf + %.2lfi  ",realPart,ima);
  printf("root2 = %.2lf - %.2lfi",realPart,ima);
}
}
  
