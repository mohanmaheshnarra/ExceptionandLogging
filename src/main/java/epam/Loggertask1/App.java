package epam.Loggertask1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App 
{
  public static void main( String[] args )
  {
  	CalculateInterest simpleinterest = new SimpleInterest((double)10000, 5, 8.5);
      CalculateInterest compoundinterest = new CompoundInterest((double)10000, 5, 8.5);
  	Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
  	logger.log(Level.INFO,"simple interest:"+simpleinterest.calculateInterest());
  	logger.log(Level.INFO,"compound interest:"+compoundinterest.calculateInterest());
  
  }
}