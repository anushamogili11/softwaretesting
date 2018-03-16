package calc;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class CalculatorMain {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int p, int q) {
		return p * q;
	}

	public int div(int j, int k) throw Exception {
		try {
		int rem= j / k;
		return rem;
		}
		catch(Exception e){
			throw e;
		}
	}


	public double sqr(double number) {
		double squareRoot = Math.sqrt(number);
		return Math.round(squareRoot);
	}

}