import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
class Product1
{
	
int id;
String name;
int Qty;
double Rate;
double Total;

Product1 (int id,String name,int Qty,double Rate,double Total )
{
	this.id = id;
	this.name = name;
	this.Qty = Qty;
	this.Rate = Rate;
	this.Total = Total;
}
public static void display_head () 
{
	
	System.out.println("-----------------------------------------------------------------------------------");
	System.out.println("ID\t\t NAME\t\t QTY\t\t RATE\t\t TotalAmount");
	System.out.println("-----------------------------------------------------------------------------------");
}
public void display_product()
{
	System.out.println(id+"\t\t"+name+"\t\t"+Qty+"\t\t"+Rate+"\t\t"+Total);
}
}
class Shoppingbill
{
	
	public static void main(String args[]) 
	{
		int id1;
		String name1;
		int Qty1;
		double Rate1;
		double Total1;
		double GTotal =0.0;
		int choice ;
		ArrayList<Product1>p=new ArrayList<Product1>();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("----------------------------A1 SHOPPING MART-------------------------------------");
		System.out.println("---------------------------------------------------------------------------------");

		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy HH:MM:SS");
		Date date = new Date();
		System.out.println("Date: "+formatter.format(date));
		do 
		{   
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID");
			 id1= sc.nextInt();
			System.out.println("Enter NAME");
		    name1= sc.next();
			System.out.println("Enter QTY");
		     Qty1= sc.nextInt();
		    System.out.println("Enter RATE");
			 Rate1= sc.nextDouble();
		 Total1 = Qty1*Rate1;
		 GTotal =  GTotal+Total1;
		 p.add(new Product1(id1,name1,Qty1,Rate1,Total1));
		 System.out.println("Enter choice");
		 System.out.println("1 . To proceed");
		 System.out.println("0 . To exit");
		 choice = sc.nextInt();
		}
		while(choice==1);
		Product1.display_head();
		for(Product1 pr : p)
		{
            pr.display_product();
         }
		GTotal =  (0.12*GTotal)+GTotal;
		System.out.println("\nThe amount with tax is \n"+GTotal);
		
 }
}
 
