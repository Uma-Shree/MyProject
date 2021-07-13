import java.net.*;
import java.util.*;
import java.io.*;
public class IPDemo 
{
public static void main(String ar[])throws Exception
{
InetAddress []ia=InetAddress.getAllByName("www.google.co.in");
for(int i=0;i<ia.length;i++)
{
System.out.println("Local IPAddress:"+ia[i].getHostAddress());
System.out.println("Local Host Name:"+ia[i].getHostName());
}}}
