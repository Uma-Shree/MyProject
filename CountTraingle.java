import java.io.*;
import java.util.*;
public class CountTraingle
{
public static void main(String ar[])throws Exception
{
Scanner sin=new Scanner(System.in);
int tot=0;
int t=sin.nextInt();
int l=sin.nextInt();
int k=sin.nextInt();
for(int i=l;i>1;i--)
{

tot+=i*i;

}
//tot=l+tot;
System.out.println("total no of Equivalent traingle=:" +tot);
//System.out.println(tot);

}
}