import java.util.Scanner;
public class VotingAge {
	//Voting age If loop
	public static void main(String[] args)
	{
	Scanner scc = new Scanner(System.in);

	System.out.println("Enter you Age :");
	int age = scc.nextInt();
	
	if(age>=18)
	{
		System.out.println("You are Eligible to Vote ");		
	}
	else
		System.out.println("You are Not Eligible to Vote");
		
	
	}
}

