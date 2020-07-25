package epam.Loggertask1;

public class CompoundInterest extends CalculateInterest{
	CompoundInterest(Double principleAmount,Integer timeInterval,Double rateOfInterest){
		super(principleAmount,timeInterval,rateOfInterest);
	}
         Float calculateInterest()
         {
        	 return (float) (principleAmount * Math.pow(( 1 + rateOfInterest/100 ), timeInterval ));
         }

}
