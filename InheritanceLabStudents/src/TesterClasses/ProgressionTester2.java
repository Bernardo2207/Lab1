package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Fibonacci;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester2 {

	public static void main(String[] args) { 
		Progression p = new Arithmetic(3, 2); 
		Progression p5 = new Arithmetic(3, 2); 
		System.out.println(p);
		Arithmetic h= (Arithmetic)p;
		p5=h.subtract(p);
		// outputs the sum of first 5 terms in p
		printSumOfTerms(p, 5); 
		printSumOfTerms(p5, 5); 
		
		
		Progression p2;
		p2 = new Geometric(3, 2); 
		printSumOfTerms(p2, 5); 
		System.out.println(p.Equals(p));
		
		Progression p3=new Fibonacci();
	
		System.out.println(p3.nextValue());
		System.out.println(p.Equals(p5));
		System.out.println(p3.Equals(p2));
		System.out.println(p3.Equals(p));
		
	} 

	/** Prints the sum of the first terms in a 
	    	      progression. 
			@param p the progression
			@param n the number of terms to consider
	 **/ 
	private static void printSumOfTerms(
			Progression p, int n) 
	{ 
		// pre: n is valid
		//... add code to compute, and assign to sum, the sum
		  //  of the first n terms in p
		double sum=0;
		
		for(int i=1;i<=n;i++){
			sum=sum+p.getTerm(i);
		}
		
		    
		System.out.println("Sum of first " + n + " terms in " 
				+ p+ " is: " + sum); 
		
	}


}
