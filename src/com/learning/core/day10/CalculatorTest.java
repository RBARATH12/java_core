package com.learning.core.day10;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

@Test
public void testAdd() {
D10P07 sample1 = new D10P07();
int ans1=sample1.add(6,8);
assertEquals(14,ans1);

D10P07 sample2 = new D10P07();
int ans2=sample2.add(2,3);
assertNotEquals(7,ans2);

}

@Test
public void testSub() {
D10P07 sample1 = new D10P07();
int ans1=sample1.sub(9,3);
assertEquals(6,ans1);

D10P07 sample2 = new D10P07();
int ans2=sample2.sub(3,2);
assertNotEquals(7,ans2);

}

@Test
public void testDiv() {
D10P08 sample1 = new D10P08();
int ans1=sample1.div(9,3);
assertEquals(3,ans1);

D10P08 sample3 = new D10P08();
int ans3=sample3.div(9,0);
assertEquals(-0,ans3);

D10P08 sample2 = new D10P08();
int ans2=sample2.div(3,2);
assertNotEquals(7,ans2);

}

@Test
public void testMul() {
D10P08 sample1 = new D10P08();
int ans1=sample1.mul(9,3);
assertEquals(27,ans1);

D10P08 sample2 = new D10P08();
int ans2=sample2.mul(3,2);
assertNotEquals(8,ans2);

}

@Test
public void testMax() {
D10P09 sample1 = new D10P09();
int[] arr1= {1,2,3,4,5,6};
int max1=sample1.findMax(arr1);
assertEquals(6,max1);

D10P09 sample2 = new D10P09();
int[] arr2= {-1,-2,-3,-4,-5,-6};
int max2=sample2.findMax(arr2);
assertEquals(-1,max2);
}
}