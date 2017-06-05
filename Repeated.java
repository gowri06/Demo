import java.io.*;
import java.util.Scanner;
class Repeated
{
public static void main(String args[])
{int ss=0;
Scanner s=new Scanner(System.in);

int a=s.nextInt();
int aa[]=new int[a];
for(int i=0;i<a;i++)
{
aa[i]=s.nextInt();
}
for(int j=0;j<a-1;j++)
{

if(aa[j]==aa[j+1])
{
System.out.println(aa[j]);
ss=1;
}}
if(ss==0)
{
System.out.println("non repeating");
}
}
}

