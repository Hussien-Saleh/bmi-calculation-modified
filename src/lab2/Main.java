package lab2;

import de.tuhh.diss.io.SimpleIO;

public class Main {
	
	private static final int NUM_PERSONS = 3;
	
	
	public static void main (String[] args)
	{
		//displayInputs();
		
		//calculateFrobenius();
		
		// obtainVo2();
		
		 //System.out.println(calculateNewton());
     }
	
	
	
	
	
	public static void displayInputs() {
		
		double userWeight;       // the weight of a single user
		double userHeight;       // the height of a single user
        double arrBmi []= new double[NUM_PERSONS];
 	  
	   for(int i=0; i< arrBmi.length; i++){
		 	
	            SimpleIO.println("please enter your weight in kilograms");  //query the weight from the user
	            userWeight = SimpleIO.readDouble();  
			
	        while(userWeight < 0.0){
			
	            SimpleIO.println("please enter your correct weight in kilograms");  // query the correct weight from the user
	        	userWeight = SimpleIO.readDouble(); 
		    }

	            SimpleIO.println("please enter your height in meters."); // query the height from the user
	            userHeight = SimpleIO.readDouble();  
			
        	while(userHeight>2.72 || userHeight<0.0){
				
	            SimpleIO.println("please enter your correct height in meters."); // query the correct height from the user
	        	userHeight = SimpleIO.readDouble();  
	         } 
		     
	        	 BmiCalculation user = new BmiCalculation(userWeight,userHeight);  
	        	arrBmi[i] = user.calculateBmi();
	        	
	        	 // SimpleIO.println("the BMI of user number " + (i+1) + " is " + user.calculateBmi());
	          //   bmiSum += user.calculateBmi();

	     }
	   
	      SimpleIO.println("please enter the number of user you wish to display his BMI");
	      SimpleIO.println(arrBmi[(int) (SimpleIO.readDouble() - 1)]);  
	   
	 
      // SimpleIO.println("the average BMI of all users is " + bmiSum);
	        	
		
	}
	
	
   public static void calculateFrobenius() {
		
		EigenvalueUpperBound a1 = new EigenvalueUpperBound();
        double[][] newMatrix= a1.defineMatrix();	
        System.out.println(a1.obtainFrobeniusNorm(newMatrix));
			
	}
   
   
   public static void obtainVo2()
   {
	   System.out.println("please enter your age");
	   MaxOxygen newUser = new MaxOxygen(SimpleIO.readInt());
	   System.out.println(newUser.calculateVo2());
   }
   
	
   public static double f(double x)
   {
	   return Math.pow(x, 4) - 2*Math.pow(x, 3)- Math.pow(x, 2) - 2*x + 2;
	   
	   
   }
   
   public static double df(double x)
   {
	   return 4*Math.pow(x, 3) - 6*Math.pow(x, 2) - 2*x -2;
   }
	
   
   public static int calculateNewton() {
	   
	  // double xPrevious = 10.0;
	   double xPrevious = 10.0;

	   double xNext=0.0;
	   int count=0;
	 
	   while (f(xPrevious)> 1e-6 && df(xPrevious)> 1e-6 && count < 100) 
	   {
		  
        // System.out.println(xPrevious);
		 xNext = xPrevious - (f(xPrevious)/df(xPrevious));  
		 xPrevious = xNext;
		 
		 count++;
		 
		   
	   }
	 
	  
	   return count;
   }
   

}

	    
	           
	    
	    

