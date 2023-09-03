// import java.lang.*;
import java.util.*;

class money
{

private double amt,dollar,pound;
Scanner sc=new Scanner(System.in);


public void dollar()
{
System.out.println("Enter Indian rupee ");
amt=sc.nextDouble();
dollar=amt*0.012268;
System.out.println(amt+"Indian Rupee = "+dollar+" Dollars");
}

public void pounds()
{
System.out.println("Enter Indian rupee");
amt=sc.nextDouble();
pound=amt*0.0099;
System.out.println(amt+"Indian Rupee = "+pound+" Pounds");
}

public void show()
{
System.out.println("Enter Indian rupee");
amt=sc.nextDouble();
dollar=amt*0.012268;
pound=amt*0.0099;
System.out.println(amt+"Indian Rupee = "+dollar+" Dollars");
System.out.println(amt+"Indian Rupee = "+pound+" Pounds");
}
}

public class currency 
{
public static void main(String args[])
{
money m1=new money();
Scanner sc=new Scanner(System.in);
int ch;
do
{
System.out.println("1 indian Rupee to Dollars ");
System.out.println("2 indian Rupee to Pounds ");
System.out.println("3 indian Rupee Currency converter into dollars and pounds ");
System.out.println("4 exit");
System.out.println("enter your choice");
ch=sc.nextInt();
switch (ch)
{
case 1:m1.dollar ();
       break;
case 2:m1.pounds();
       break;
case 3:m1.show();
       break;
case 4:System.out.println("invalid choice");
       break;
}
}
while(ch!=5);
sc.close();
}
}