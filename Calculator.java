package week2day1;

public class Calculator {
	public int add(int a, int b){
	return a+b;
	}
	public int sub(int e, int f) {
		return e-f;
	}
	public double multi(double i, double j) {
		return i*j;
	}
	public float div(float x, float y) {
		return x/y;
	}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int add = calc.add(30,10);
		System.out.println(add);
		int sub = calc.sub(45,12);
		System.out.println(sub);
		double multi = calc.multi(15,19);
		System.out.println(multi);
		float div = calc.div(22,5);
		System.out.println(div);
	}
}
