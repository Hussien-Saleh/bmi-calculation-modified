package lab2;


import java.lang.Math;
import de.tuhh.diss.io.SimpleIO; 

public class BmiCalculation {

	private double weight;
	private double height;
	private static final double BMI_UPPER = 25.0;
	private static final double BMI_LOWER = 18.5;

	public BmiCalculation (double weight, double height)
	{
		this.weight = weight;
		this.height = height;
		
		
	}
	
	// calculation of BMI
	public double calculateBmi (){
		return (this.weight/ (Math.pow(this.height, 2.0)));
		
	}
	
	
	// classification of the user according to BMI value
	public void classify() {
		double bmi = calculateBmi();
		
		if (bmi < BMI_LOWER) {
	    	SimpleIO.println("you are underweight");
		}
		if (bmi > BMI_UPPER) {
			SimpleIO.println("you are overweight");
		}
		if (bmi >= BMI_LOWER && bmi < BMI_UPPER)
		{
	        SimpleIO.println("you are normal weight");
		}
	}
	
    // return the weight of the user
	public double getWeight() {
		return weight;
	}

    // the weight of the user to set
	public void setWeight(double weight) {
		this.weight = weight;
	}


	
	// return the height of the user 
	public double getHeight() {
		return height;
	}


	// the height of the user to set 
	public void setHeight(double height) {
		this.height = height;
	}

}
