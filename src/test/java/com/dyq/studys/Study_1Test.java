package com.dyq.studys;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class Study_1Test  {
    Study_1 study1 = new Study_1(1, 2, 3, 4);

    @Test(description = "获取最大值")
	public void Test_Max () {
        Assert.assertEquals (study1.Result_Max() , 4);
	}
    @Test(description = "获取最小值")
    public void Test_Min () {
        Assert.assertEquals (study1.Result_Min() , 1);
    }
    @Test(description = "获取乘积")
    public void Test_Multi () {
        Assert.assertEquals (study1.Result_Multi() , 24);
    }
    @Test(description = "获取和")
    public void Test_Sum ()  {
  /*      study1.Result_Sum;*/

    }
}

