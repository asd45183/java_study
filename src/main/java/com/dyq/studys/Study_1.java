package com.dyq.studys;

import java.util.ArrayList;
import java.util.Arrays;

public class Study_1 {

	private static double number_1;
	private static double number_3;
	private static double number_2;
	private static double number_4;


	protected Study_1(double number_1, double number_2, double number_3, double number_4){

		this.number_1 = number_1;
		this.number_2 = number_2;
		this.number_3 = number_3;
		this.number_4 = number_4;

	}


	public double result_multi() {

		try {
			assert (number_1 > 0 || number_2 >0 || number_3 >0 || number_4 > 0);
			throw new Exception("不能小于0");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		return number_1 * number_2 * number_3 * number_4;
	}
	protected double result_max(){
		ArrayList<Double> arrayList = new ArrayList<Double>();
		arrayList.add(number_1);
		arrayList.add(number_2);
		arrayList.add(number_3);
		arrayList.add(number_4);
		Arrays.sort(arrayList.toArray());
		for (int i: arrayList.toArray()){

		}
	}

	default double result_min(){
		return 2;
	}
	private double result_sum(){
		return 3;
	}
	public static void main(String arg[] ) throws Exception{
		Study_1 s = new Study_1(-1,2,3,4);
		s.result_multi();
	}
}
