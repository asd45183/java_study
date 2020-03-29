package com.javastudy.numberstudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Study_1 {

	private static int number_1;
	private static int number_3;
	private static int number_2;
	private static int number_4;

	protected Study_1(int number_1, int number_2, int number_3, int number_4){

		this.number_1 = number_1;
		this.number_2 = number_2;
		this.number_3 = number_3;
		this.number_4 = number_4;
	}

	public int Result_Multi() {

		try {
			if (number_1 < 0 || number_2 <0 || number_3 <0 || number_4 < 0){
                throw new Exception("不能小于0");
            }

		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		return (number_1 * number_2 * number_3 * number_4);
	}
	protected int Result_Max(){
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(number_1);
        list1.add(number_2);
        list1.add(number_3);
        list1.add(number_4);
        // 排序
        Collections.sort(list1);
        return( Collections.max(list1));
	}
// 需要default
	protected int Result_Min(){
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(number_1);
        list2.add(number_2);
        list2.add(number_3);
        list2.add(number_4);
        // 排序
        Collections.sort(list2);
        return( Collections.min(list2));
	}
	private int Result_Sum(){
        return (number_1 + number_2 + number_3 + number_4);
	}

}
