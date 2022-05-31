public class WageCalculator
{
 
 //Fields
 
   private double baseRate;
   private double overtimeMultiplier;
   private int hours;
   private double overtimeWage;
   private double baseWage;
   private double totalWage;
   
   //Constructors
   
    
    //getting negative number for overtime
          
   public WageCalculator(double baseRate, double overtimeMultiplier, int hours)
     {
       if(baseRate >= 7.25)
               {
                  this.baseRate = baseRate;
               }
            else{throw new IllegalArgumentException();}
         
         
          if(overtimeMultiplier >= 1.5)
               {this.overtimeMultiplier = overtimeMultiplier;}
          else{throw new IllegalArgumentException();}
        
         
          if(hours > 0)
            {
               this.hours = hours;
            }
          else{throw new IllegalArgumentException();} 
     }
     
     public WageCalculator(double baseRate, int hours)
      {
        new WageCalculator(baseRate, 1.5, hours);
      }
   
   //Methods
   
    public double getbaseWage()
       {
           baseWage = (baseRate*hours);
           return baseWage;       
       } 
       
    public double getovertimeWage()
       {
            overtimeWage = ((baseRate)*(hours-40)*(overtimeMultiplier));
            
            return overtimeWage;
       }
       
    public double gettotalWage()
       {
           totalWage = (overtimeWage + baseWage);   
           return totalWage;  
       }   
    
    
}