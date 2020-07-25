package epam.Loggertask1;

public class SimpleInterest extends CalculateInterest{
	SimpleInterest(Double principleAmount,Integer timeInterval,Double rateOfInterest){
		super(principleAmount,timeInterval,rateOfInterest);
	}
         Float calculateInterest() {
        	 return (float) ((principleAmount*timeInterval*rateOfInterest)/100);
         }
}