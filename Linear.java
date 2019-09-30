import java.util.Scanner;

public class Linear {

		public static void main(String[] args) 
{
		Scanner s=new Scanner(System.in);
   System.out.println("1. (1×1) Matrix\t 2.   (2×2) Matrix\t3. (3×3) Matrix");
                                   System.out.println(" ");
		System.out.print("Select your choice: ");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			if (n==1)
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter a value: ");
				double a=sc.nextDouble();
				System.out.print("Enter b value: ");
				double b=sc.nextDouble();
				System.out.print("Enter c value: ");
				double c=sc.nextDouble();
				System.out.println("Equation is:"+a+"x"+"+"+b+"y"+"="+c);
				System.out.println("1.Find x value\t2.Find y value\t3.Default");
				System.out.print("Select your choice: ");
				int v=sc.nextInt();

                                                     switch(v)
				{
				case 1:
                                                              if(v==1)
					{
					if(b>=0)
				    {
						System.out.print(" y value: ");	
						double y=sc.nextDouble();
					double x=(c-(b*y))/a;
	                        System.out.println("Equation is:"+a+"x"+"+"+b+"*"+y+"="+c);
					System.out.print("x= "+x);
				    }
					}
					break;
					
					case 2:
					if(v==2)
					{
				   if(a>=0)
				{
						System.out.print(" x value: ");	   
						double x=sc.nextDouble();
					double y=(c-(a*x))/b;
	                     	System.out.println("Equation is:"+a+"*"+x+"+"+b+"y" +"="+c);
					System.out.print("y= "+y);
				    }
					}
					break;
					
					case 3:
						System.out.println("Default");
						break;
					}	}
			break;

			case 2: 	
				if(n==2)
			      {
			System.out.println(" ");
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the a value: ");
			double a=sc.nextInt();
			
			System.out.print("Enter the b value: ");
			double b=sc.nextInt();
			
			System.out.print("Enter the c value: ");
			double c=sc.nextInt();

			System.out.println(" ");
			System.out.print("Enter the d value: ");
			double d=sc.nextInt();
			
			System.out.print("Enter the e value: ");
			double e=sc.nextInt();
			
			System.out.print("Enter the f value: ");
			double f=sc.nextInt();
			System.out.println();
			System.out.println("The first Equation   "+a +"x+" +b +"y" +"="+c);
			System.out.println();
			System.out.println("The second Equation    "+d +"x+" +e +"y" +”="+f);
                                                          if((a*d-(b*c)!=0))
					{
				double x=(e*c)-(b*f)/(a*e-b*d);
				double y=(a*f)-(d*c)/(a*e)-(b*d);
			System.out.println();
			System.out.println("x value: "+x);
			System.out.println();
			System.out.println("y value: "+y);
			      }
			      }
			      else
			      {
			    	  System.out.println("No Solution");
			      }
			      break;
			      
			case 3: 
				if(n==3)
			      {
			System.out.println(" ");
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the a1 value: ");
			double a1=sc.nextInt();
			
			System.out.print("Enter the b1 value: ");
			double b1=sc.nextInt();
			
			System.out.print("Enter the c1 value: ");
			double c1=sc.nextInt();

			System.out.print("Enter the d1 value: ");
			double d1=sc.nextInt();
			
			System.out.println(" ");
			System.out.print("Enter the a2 value: ");
			double a2=sc.nextInt();
			
			System.out.print("Enter the b2 value: ");
			double b2=sc.nextInt();
			System.out.print("Enter the c2 value: ");
			double c2=sc.nextInt();
			
			System.out.print("Enter the d2 value: ");
			double d2=sc.nextInt();
			
			System.out.println(" ");
			System.out.print("Enter the a3 value: ");
			double a3=sc.nextInt();
			
			System.out.print("Enter the b3 value: ");
			double b3=sc.nextInt();
			
			System.out.print("Enter the c3 value: ");
			double c3=sc.nextInt();
			
			System.out.print("Enter the d3 value: ");
			double d3=sc.nextInt();
			
System.out.println("The first Equation   "+a1 +"x+" +b1 +"y+"+c2 +"z" +"="+d1);
System.out.println("The Second Equation   "+a2 +"x+" +b2 +"y+"+c3 +"z" +"="+d2);
System.out.println("The Third Equation   "+a3 +"x+" +b3 +"y+"+c3 +"z" +"="+d3);
			
double n1=( ((d1*b2)-(b1*d2)) + ((b1*c2)-(c1*b2))+ ((d2*b3)-(b2*d3)+ ((b2*c3)-(c2*b3))));
double n2=( ((a1*b2)-(b1*d2)) + ((b1*c2)-(c1*b2))+ ((a2*b3)-(b2*a3)+ ((b2*c3)-(c2*b3))));
double x=(n1/n2);
double m1=( ((a1*d2)-(d1*a2)) + ((d1*c2)-(c1*d2))+ ((a2*d3)-(d2*a3)+ ((d2*c3)-(c2*d3))));
double m2=( ((a1*b2)-(b1*d2)) + ((b1*c2)-(c1*b2))+ ((a2*b3)-(b2*a3)+ ((b2*c3)-(c2*b3))));
double y=(m1/m2);
double l1=( ((a1*b2)-(b1*d2)) + ((b1*d2)-(d1*b2))+ ((a2*b3)-(b2*a3)+ ((b2*d3)-(d2*b3))));
double l2=( ((a1*b2)-(b1*d2)) + ((b1*c2)-(c1*b2))+ ((a2*b3)-(b2*a3)+ ((b2*c3)-(c2*b3))));
double z=(l1/l2);
System.out.println("x: "+x);
System.out.println("y: “+y);
System.out.println("z: "+z);
break;
 }
      }
          }
	  }
