import java.util.*;
import java.time.*;

public class Project
{
	Scanner sc1=new Scanner(System.in);
	static
	{
		System.out.println("\n\n\t\t\t\t\t\t\t#################### LEAVE APPROVAL SYSTEM ####################");
	}
	public void homepage()
	{
		int a;
		System.out.println("\n\n\t\t\t\t\t\t\t\t***************** HOME PAGE *****************");
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t------------");
		System.out.println("\t\t\t\t\t\t\t\t\t\t| 1. LOGIN |");
		System.out.println("\n\t\t\t\t\t\t\t\t\t\t| 2. EXIT  |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t------------");
		System.out.print("\n\t\t\t\t\t\t\t\tEnter Choice : ");
		a=sc1.nextInt();
		switch(a)
		{
			case 1 : loginpage();
				break;
			case 2 : System.exit(0);
				break;
			default : System.out.println("\t\t\t\t\t\t\t\t\t\tWrong Choice! Program Terminated.");
				System.exit(0);
		}
	}
	Scanner sc2=new Scanner(System.in);
	public void loginpage()
	{
		int b;
		String username,password;
		System.out.println("\n\n\t\t\t\t\t\t\t\t***************** LOGIN PAGE *****************");
		System.out.print("\n\n\t\t\t\t\t\t\t\tEnter Username : ");
		username=sc2.nextLine();
		System.out.print("\n\t\t\t\t\t\t\t\tEnter Password : ");
		password=sc2.nextLine();
		if(password.equals(username))
		{
			System.out.println("\n\n\t\t\t\t\t\t\t\t\t     Successfully Logged In");
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t------------------------");
		    System.out.println("\t\t\t\t\t\t\t\t\t\t| 1. Leave Application |");
		    System.out.println("\n\t\t\t\t\t\t\t\t\t\t| 2. Logout            |");
		    System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------");
		    System.out.print("\n\t\t\t\t\t\t\t\tEnter Choice : ");
			b=sc1.nextInt();
			switch(b)
			{
				case 1 : leaveapplication();
						 break;
				case 2 : homepage();
						 break;
				default : System.out.println("\n\t\t\t\t\t\t\t\t\tWrong Choice! Program Terminated.");
						  System.exit(0);
			}
			
		}
		else
		{
			System.out.println("\n\n\t\t\t\t\t\t\t\t\tLog In Failed due to wrong password");
			homepage();
		}
			
	}
	public void leaveapplication()
	{
		int day,month,todate,year;
		String reason;
		LocalDate date=LocalDate.now();
		int no_of_days;
		System.out.println("\n\n\t\t\t\t\t\t\t\t***************** LEAVE APPLICATION PAGE *****************");
		System.out.print("\n\n\t\t\t\t\t\t\t\tEnter starting date of leave in : ");
		day=sc1.nextInt();
		System.out.print("\n\n\t\t\t\t\t\t\t\tEnter year of leave : ");
		year=sc1.nextInt();
		System.out.print("\n\n\t\t\t\t\t\t\t\tEnter the month of leave in : ");
		month=sc1.nextInt();
		if(month > 12)
				{
					return;
				}
				else if (year % 4 == 0)
				{
					return;
				}
				else if (month == 1 || month == 3 || month == 5 || month ==  7 || month ==  8 || month ==  10 || month == 12)
					{
					if (day == 31)
					{
						return;
					}
					else if (day != 31)
					{
						System.out.println("False.");
					}
				else if (month == 4 || month == 6 || month == 9 || month == 11)
				{
					if (day == 30)
					{
						return;
					}
					else if (day != 30)
					{
						System.out.println("False.");
					}

				}
				else if (month == 2) 
				{
					if (year % 4 == 0) 
					{
						if (day == 29)
						{
							return;
						}
						else if (day != 29)
						{
							System.out.println("False.");
						}
					else if (year % 4 != 0)
					{
						if (day == 28)
						{
							return;
						}
						else if (day != 28)
						{
							System.out.println("False.");
						}
					}
					}
				}
				else // Everything checks out
				{
					System.out.println("True.");
				}

            }
		System.out.print("\n\n\t\t\t\t\t\t\t\tEnter total number of days for leave : ");
		no_of_days=sc1.nextInt();
		if(no_of_days>3)
		{
			System.out.println("\n\n\t\t\t\t\t\t\tLeave not approved as it exceeds maximum no of days for leave : ");
			System.exit(0);
		}
		System.out.print("\n\n\t\t\t\t\t\t\t\tEnter reason for leave : ");
		reason=sc2.nextLine();
		System.out.print("\n\n\t\t\t\t\t\t\t\tLeave Approved! Enjoy ");
	}
	public static void main(String args[])
	{
		Project ob=new Project();
		ob.homepage();
	}
}