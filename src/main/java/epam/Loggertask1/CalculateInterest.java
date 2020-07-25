package epam.Loggertask1;

abstract class CalculateInterest {
	protected Double principleAmount;
    protected Integer timeInterval;
    protected Double rateOfInterest;
 
    CalculateInterest(Double principleAmount,Integer timeInterval,Double rateOfInterest){
    	 this.principleAmount = principleAmount;
         this.timeInterval = timeInterval;
         this.rateOfInterest =rateOfInterest;
    }
	abstract Float calculateInterest();

}