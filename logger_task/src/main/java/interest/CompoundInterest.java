package interest;

public class CompoundInterest extends InterestCalculation {

	CompoundInterest(double principalAmount, double rateOfInterest, double noOfYears) {
		super(principalAmount, rateOfInterest, noOfYears);
	}
	public double computeCompoundInterest()
	{
		double Amount=(principalAmount)*(Math.pow((1+((rateOfInterest)/100)), noOfYears));
		return Amount-principalAmount;
	}
}
