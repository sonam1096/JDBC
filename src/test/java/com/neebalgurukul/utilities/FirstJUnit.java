package com.neebalgurukul.utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FirstJUnit {

    @Test
    public void testGetAreaRectangle() {
	// TODO Auto-generated method stub
	AreaUtilities aUtil = new AreaUtilities();
	int l = 4;
	int b = 3;
	
	int expectedOutput = 12;
	int actualOutput = aUtil.getAreaRectangle(l, b);
	assertEquals(expectedOutput, actualOutput);
    }
	
    @Test
    public void testPerimeterAreaRectangle() {
	AreaUtilities aUtil = new AreaUtilities();
	int l = 4;
	int b = 3;
		
	int expectedOutput = 14;
	int actualOutput = aUtil.getPerimeterRectangle(l, b);
	assertEquals(expectedOutput, actualOutput);	
	
    }
    
    @Test
    public void testGetShape() {
	AreaUtilities aUtil = new AreaUtilities();
	int l = 4;
	int b = 3;
	
	String expectedOutput = "Rectangle";
	String actualOutput = aUtil.getShape(l, b);
	assertEquals(expectedOutput ,actualOutput);	
	
    }
    
    
    @Test
    public void testisRectangle() {
	AreaUtilities aUtil = new AreaUtilities();
	int l = 4;
	int b = 3;
	
//	boolean expectedOutput = false;
	boolean actualOutput = aUtil.isRectangleShape(l, b);
	assertTrue(actualOutput);	
	
    }

}

