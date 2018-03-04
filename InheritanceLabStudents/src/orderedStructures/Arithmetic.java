package orderedStructures;

import interfaces.Combinable;

public class Arithmetic extends Progression implements Combinable{
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		if(super.getFlag()==false) 
			throw new IllegalStateException("First Value has not been executed.") ;
	
		current = current + commonDifference; 
		return current;
	}
	public String toString(){
		
		return "Arith("+(int)this.firstValue()+","+(int)this.commonDifference+")";
	}
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
		return (current+commonDifference*(n-1)); 
		
		}

	public Progression add(Progression other) {
		Arithmetic temp= (Arithmetic)other;
		Progression pAdd= new Arithmetic(this.firstValue()+temp.firstValue(),this.commonDifference+temp.commonDifference);
		return pAdd;
	}

	
	public Progression subtract(Progression other) {
		Arithmetic temp= (Arithmetic)other;
		Progression newP= new Arithmetic(this.firstValue()-temp.firstValue(),this.commonDifference-temp.commonDifference);
		return newP;	// TODO Auto-generated method stub
	}
}
