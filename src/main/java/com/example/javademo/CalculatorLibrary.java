package com.example.javademo;

public class CalculatorLibrary {
	
	public static Double Add(String num1, String num2) {
		Double ans = Double.parseDouble(num1) + Double.parseDouble(num2);
		return ans;
	}
	
	public static Double Sub(String num1, String num2) {
		Double ans = Double.parseDouble(num1) - Double.parseDouble(num2);
		return ans;
	}
	
	public static Double Mul(String num1, String num2) {
		Double ans = Double.parseDouble(num1) * Double.parseDouble(num2);
		return ans;
	}
	
	public static Double Div(String num1, String num2) {
		Double ans = Double.parseDouble(num1) / Double.parseDouble(num2);
		return ans;
	}
}
