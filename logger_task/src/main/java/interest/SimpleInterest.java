package interest;
public class SimpleInterest extends InterestCalculation {
	SimpleInterest(double principalAmount, double rateOfInterest, double noOfYears) {
		super(principalAmount, rateOfInterest, noOfYears);
	}

	public double computeSimpleInterest()
	{
	  return (principalAmount*noOfYears*rateOfInterest)/100;
	}

}
