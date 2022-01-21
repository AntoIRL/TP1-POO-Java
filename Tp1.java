package tp_algo_base_java;

public class Tp1 {

	public static double f(double x) {
		return x+1;
	}
	
	public static double g(double x) {
		return 2*x+3;
	}
	
	public static double h(double x) {
		return x*x+1;
	}
	
	public static double i(double x) {
		return 5*x*x+3*x+1;
	}

	public static double j(double x) {
		return 3*Math.pow(x, 3) + 5*x*x + 3*x + 4;
	}
	
	public static double k(double x) {
		return Math.pow(x, 10) - x*x*x + 3;
	}
	
	public static double l(double x) {
		return 3*Math.pow(x, 10) + 4*x*x + 5;
	}
	
	public static double m(double x) {
		return 10*Math.pow(x, 100) + 3*x + 1;
	}

	public static double a(double x) {
		return x+3;
	}	
	public static double b(double x) {
		return x*x-2;
	}	
	public static double n(double x) {
		return a(x) + b(x);
	}
	
	public static double c(double x) {
		return x+1;
	}	
	public static double d(double x) {
		return x*x*x;
	}	
	public static double o(double x) {
		return c(d(x));
	}		

	public static double p(double x) {
		return (3*x*x*x+2)/(20*x*x+1);
	}	
	
	public static void main(String[] args) {
		System.out.println("f(1)="+f(1));
		System.out.println("g(1)="+g(1));
		System.out.println("h(1)="+h(1));
		System.out.println("i(1)="+i(1));
		System.out.println("j(2)="+j(2));
		System.out.println("k(1)="+k(1));
		System.out.println("l(1)="+l(1));
		System.out.println("m(1)="+m(1));
		System.out.println("n(1)="+n(1));
		System.out.println("o(1)="+o(1));
		System.out.println("p(1)="+p(1));
	}

}
