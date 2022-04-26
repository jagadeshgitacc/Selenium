package org.indians;

public class Southindians extends India{

	@Override
	void breakfast() {
System.out.println("Idly and dosa");		
	}
	private void dressing() {
System.out.println("Saree and vesti");
	}
public static void main(String[] args) {
	Southindians s=new Southindians();
	s.aadharcard();
	s.liscence();
	s.voterID();
	s.breakfast();
	s.dressing();
}
}
