package lab2;

import de.tuhh.diss.io.SimpleIO;

public class EigenvalueUpperBound {

	private static final int MAX_MATRIXSIZE = 3; 
    private double[][] matrixA = new double[MAX_MATRIXSIZE][MAX_MATRIXSIZE];

	public EigenvalueUpperBound() {
		
		}
	
	public double[][] defineMatrix()
	{
		for(int i=0; i < MAX_MATRIXSIZE; i++) {
			
			for (int j=0;j < MAX_MATRIXSIZE; j++)
			{
				System.out.println("please enter the matrix entry no." + (i+1) + (j+1));
				matrixA [i][j] = SimpleIO.readDouble();
			}
			
		}
		return matrixA;
		
	}
	
	
	public double obtainFrobeniusNorm(double matrixA [][]) {
		
		double frobeniusNorm=0.0;
		 for(int i=0; i < MAX_MATRIXSIZE; i++) {
			
			for (int j=0;j < MAX_MATRIXSIZE; j++)
			{
				frobeniusNorm+= Math.pow(matrixA[i][j],2.0);
			}
			
		}
		 
		return Math.sqrt(frobeniusNorm);
	}

	
	
}
