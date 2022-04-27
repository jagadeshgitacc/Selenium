package org.banking;

public class HdfcBank implements Indianbank,RbiBank{
@Override
public void fixed() {
System.out.println("50%");	
}
@Override
	public void deposit() {
	System.out.println("19%");	
		
	}
@Override
	public void savings() {
	System.out.println("4%");	
		
	}
@Override
		public void current() {
	System.out.println("15%");	
			
		}
public static void main(String[] args) {
	HdfcBank h=new HdfcBank();
	h.current();
	h.deposit();
	h.savings();
	h.fixed();
}
}
