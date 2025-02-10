package com.testingtestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun1 {
	
	
    @Test
	private void tc1() {
	System.out.println("tc1");
	Assert.assertTrue(true);
	System.out.println("tc11");
	}
	
    
    @Test
	private void tc2() {
	System.out.println("tc2");
	Assert.assertTrue(false);
	System.out.println("tc22");
	}
    
    
    @Test
	private void tc3() {
	System.out.println("tc3");
	Assert.assertTrue(false);
	System.out.println("tc33");
	}
	

}
