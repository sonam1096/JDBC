package com.neebalgurukul.service;

import com.neebalgurukul.dao.LoginDAO;
import com.neebalgurukul.model.Login;

public class LoginService {
   
    public boolean isValidUser(String username,String password) throws Exception
    {
	Login obj = new Login();
	LoginDAO dao = new LoginDAO();
	obj = dao.getLoginPassword(username);
	System.out.println(obj.getUname());
	if(obj.getPswd().equals(password))
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }
}
