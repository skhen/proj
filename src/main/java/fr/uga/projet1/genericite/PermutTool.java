package fr.uga.projet1.genericite;

public class PermutTool<T>{
	T a;
	T  b; 

	public PermutTool() {
		// TODO Auto-generated constructor stub
	}
	
	public void permute() {
		T c = this.a;
		this.a = this.b;
		this.b = c;
	}
	
}
