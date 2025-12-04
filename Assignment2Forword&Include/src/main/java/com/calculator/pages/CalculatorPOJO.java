package com.calculator.pages;

public class CalculatorPOJO {
	
	double n1;
	double n2;
	String op;
	double result;
	
	
	public CalculatorPOJO(double n1, double n2, String op, double result) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.op = op;
		this.result = result;
	}


	public double getN1() {
		return n1;
	}


	public void setN1(double n1) {
		this.n1 = n1;
	}


	public double getN2() {
		return n2;
	}


	public void setN2(double n2) {
		this.n2 = n2;
	}


	public String getOp() {
		return op;
	}


	public void setOp(String op) {
		this.op = op;
	}


	public double getResult() {
		return result;
	}


	public void setResult(double result) {
		this.result = result;
	}


	@Override
	public String toString() {
		return "CalculatorPOJO [n1=" + n1 + ", n2=" + n2 + ", op=" + op + ", result=" + result + "]";
	} 
	
	
	

}
