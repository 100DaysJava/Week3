
package Prgs4;
import java.util.*;
public class Cuboid 
{
	public static void main(String[] args) 
	{
	 Scanner obj = new Scanner(System.in);
	 System.out.println("enter Length :");
	 int l=obj.nextInt(); 
                   System.out.println("enter Breadth :");
                   int b=obj.nextInt();  
                   System.out.println("enter Height :");
                   int h=obj.nextInt();  
	 double v = l*b*h;
System.out.println("Volume of Cuboid = "+v);
	} }
