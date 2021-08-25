package practice.java;


public class Test {
	public static void main(String[] args) {
		int a = 20;
		P p = new P();
		System.out.println(p.getA());
		assignA(p, a);
		System.out.println(p.getA());
		a=30;
		againAssignA(p, a);
		System.out.println(p.getA());
	}

	private static void assignA(P p, int a){
		p.setA(a);
	}

	private static void againAssignA(P p, int a){
		p = new P();
		p.setA(a);
	}
}

class P{
	int a = 10;

	public P(){
	}

	public void setA(int a){
		this.a=a;
	}

	public int getA(){
		return this.a;
	}
}