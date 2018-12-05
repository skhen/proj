package fr.uga.projet1.defaultItf;

public interface Interface2 {
	default void m2() {
		System.out.println(" Coucouc itf1::m1");
	}
	
	void m1();
	
}
