package orderedStructures;

import java.security.InvalidParameterException;

import interfaces.Combinable;
import interfaces.OrderedNumberStructure; 

public abstract class Progression implements OrderedNumberStructure {
	private double first;       // the first value
	protected double current;   
    // current is the current value of the object � it changes
	// to �the value of the next term� whenever method 
	// �nextValue� is applied to the object.
boolean flag=false;
	
	public Progression(double first) { 
		this.first = first; 
		current = first; 
	}

	public double firstValue() { 
		flag=true;
		current = first; 
		return current; 
	}
		public boolean getFlag(){return flag;}
		
	public void printAllTerms(int n) throws InvalidParameterException {
		if (n <= 0) 
			throw new InvalidParameterException("printAllTerms: Invalid argument value = " + n);  

		System.out.println("Index --- Term Value"); 
		for (int i=1; i<=n; i++) { 
			System.out.println((i) +  "---" + this.getTerm(i));  
		}
	}

	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = this.firstValue(); 
		for (int i=1; i<n; i++) 
			value = this.nextValue(); 
		return value; 
	}
	public boolean Equals(Object o) {
		if(this.toString().equals(o.toString())) {return true;}
		return false;
	}
	
	public abstract double nextValue(); 
}
