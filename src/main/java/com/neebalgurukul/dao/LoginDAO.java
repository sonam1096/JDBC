package com.neebalgurukul.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.neebalgurukul.model.Login;

public class LoginDAO {
    
    Connection conn=null;
    Statement stmt = null;
    ResultSet rs = null;
    DataSource ds = new DataSource();
    
    public List<Login> getLoginDetails() throws SQLException{
	String query = "select username, password from login";
	conn = ds.getConnection();
	List<Login> loginList = new ArrayList <Login>();
	try {
	    Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery(query);
	    if(rs!=null)
	    {
		while(rs.next()) {
		    Login obj = new Login();
		    obj.setUname(rs.getString("username"));
		    obj.setPswd(rs.getString("password"));
		    loginList.add(obj);
        		
        	}
	    }
	    return loginList;
	}catch(SQLException e) {
	    System.out.println("SQLException in LoginDAO: "+e.getMessage());
	    return null;
	}
	finally {
	    conn.close();
	}
    }
    
    public Login getLoginPassword(String username) throws Exception
    {
	String query1 = "select username, password from login where username = ? and active = ?";
	conn = ds.getConnection();
	//Login loginObj = new Login();
	try {
	    PreparedStatement pstmt = conn.prepareStatement(query1);
	    pstmt.setString(1,username);
	    pstmt.setBoolean(2,true);
	    ResultSet rs = pstmt.executeQuery();
	    Login obj=null;
	    if(rs.next())
	    {
		obj = new Login();
		    obj.setUname(rs.getString("username"));
		    obj.setPswd(rs.getString("password"));
	    }
	    else
	    {
		throw new Exception("No record found");
	    }
	    return obj;
	}catch(SQLException e) {
	    System.out.println("SQLException in LoginDAO: "+e.getMessage());
	    return null;
	}
	finally {
	    conn.close();
	}
    }
    
    public boolean getLoginInsert(String username,String password) throws Exception
    {
	String query2 = "insert into login (username, password, lastModifiedDate, active) values (?,?,?,?)";
	conn = ds.getConnection();
	//Login loginObj = new Login();
	try {
	    Date currentDate = new Date(System.currentTimeMillis());
	    //PreparedStatement pstmt = conn.prepareStatement(query2);
	    PreparedStatement pstmt = conn.prepareStatement(query2, Statement.RETURN_GENERATED_KEYS);
	    pstmt.setString(1,username);
	    pstmt.setString(2,password);
	    pstmt.setDate(3,currentDate);
	    pstmt.setBoolean(4, true);
	    int a = pstmt.executeUpdate();
	    
	    if(a!=0)
	    {
		ResultSet rs = pstmt.getGeneratedKeys();
		if(rs.next())
		{
		    int loginId = rs.getInt(a);
		    System.out.println("In login table record inserted successfuuly for Id = "+loginId);
		}
	    }
	    else
	    {
		throw new Exception("No record inserted");
	    }
	    return true;
	}catch(SQLException e) {
	    System.out.println("SQLException in LoginDAO: "+e.getMessage());
	}
	finally {
	    conn.close();
	}
	return true;
	
    }
    
    public boolean deleteLoginSoft(String username) throws Exception
    {
	
	String query3 = " update login set active = false where username = ?";
	conn = ds.getConnection();
	try {
	    PreparedStatement pstmt = conn.prepareStatement(query3);
	    pstmt.setString(1,username);
	    int a = pstmt.executeUpdate();
	   if(a==0)
	   {
	       return true;
	   }
	   else
	   {
	       throw new Exception("No record found");
	   }
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return true;
    }
    
    public boolean deleteLoginHard(String username) throws Exception
    {
	
	String query4 = " delete from login where username = ?";
	conn = ds.getConnection();
	try {
	    PreparedStatement pstmt = conn.prepareStatement(query4);
	    pstmt.setString(1,username);
	    int a = pstmt.executeUpdate();
	   if(a!=0)
	   {
	       return true;
	   }
	   else
	   {
	       throw new Exception("No record found");
	   }
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return true;
    }
    
}
