package com.neebalgurukul.utilities;

public class AreaUtilities {

    public int getAreaRectangle(int l, int b) {
	return l*b;
    }
    
    public int getPerimeterRectangle(int l, int b) {
	return 2 * (l + b);
    }
    
    public String getShape(int side, int side1) {
	if(side == side1) {
	    return "Square";
	} else {
	    return "Rectangle";
	}
    }
    
    public boolean isRectangleShape(int side, int side1) {
    	
    	if(side == side1) {
    	    return false;
    	} else {
    	    return true;
    	}
    }
    
    
}
