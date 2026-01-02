/*
	7. Implement Voting Eligibility
	Create a with a method isEligible that checks if a person (age provided) is eligible to vote.
	Explanation: Introduces basic logical validation.
*/

public class ClassQ7
{
	public static void main(String x[])
	{
		System.out.println(" Implement Voting Eligibility ");
		Voter vt = new Voter();
		String result = vt.isEligible(18);
		System.out.println("Result is  : " + result);
	}
} 
class Voter
{
	String isEligible(int age)
	{
		//System.out.println(age);
		return age>=18? "Eigible to vote":"Not Eligible to vote";
	}
}