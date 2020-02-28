package lab2;

public class MaxOxygen {
	
	private int age;
	private static final double CONSTANT_1 = 206.9;
	private static final double CONSTANT_2 = 0.67;
	private static final double CONSTANT_3 = 15.0;
	
	
	public MaxOxygen(int age) {
		this.age=age;
	}
	
	public double calculateHrMax() {
		return (CONSTANT_1 - (CONSTANT_2 * this.age));
		
	}
	
	public double calculateHrRest() {
		
		double HrRest;
		if (this.age >= 18 && this.age <= 35) {
			HrRest= 71.0;
		}
		else if (this.age >= 36 && this.age <= 55) {
			HrRest= 73.0;
		}
		else  {
			HrRest= 76.0;
		}
		return HrRest;
		
	}
	
	public double calculateVo2() {
		double HrMax = calculateHrMax();
		double HrRest = calculateHrRest();
		
		return(CONSTANT_3 * (HrMax/HrRest));
		
		
		
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
