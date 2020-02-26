package interest;
public class InterestCalculation{
	double principalAmount;
	double rateOfInterest;
	double noOfYears;
	InterestCalculation(){}
	InterestCalculation(double principalAmount,double rateOfInterest,double noOfYears)
	{
		this.principalAmount=principalAmount;
		this.rateOfInterest=rateOfInterest;
		this.noOfYears=noOfYears;
	}
	public String getSimpleInterest(double principalAmount, double rateOfInterest, double noOfYears)
	{
	  SimpleInterest simpleInterest=new SimpleInterest(principalAmount, rateOfInterest, noOfYears);
	  return String.valueOf(simpleInterest.computeSimpleInterest())+"Rs/-";
	}
	public String getCompoundInterest(double principalAmount, double rateOfInterest, double noOfYears)
	{
	  CompoundInterest compoundInterest=new CompoundInterest(principalAmount, rateOfInterest, noOfYears);
	  return String.valueOf(compoundInterest.computeCompoundInterest())+"Rs/-";
	}
	
}

