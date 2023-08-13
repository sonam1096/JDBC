package com.neebalgurukul.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class TestLoginValidationService {

    @Test
    public void testisValid() throws Exception {
	LoginService service = new LoginService();
	 boolean actualOutput = service.isValidUser("Ram","Ram123");
	assertTrue(actualOutput);
    }
}
