package com.neebalgurukul.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

    private static Connection conn = null;
    private String username = "root";
    private String password = "Ishan@1723";

    DataSource() {
	try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
	    e.getMessage();
	    e.printStackTrace();
	} finally {
	    System.out.println("Registered the driver");
	}
    }

    public Connection getConnection() {
	try {
	    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/class?", this.username, this.password);

	    // Do something with the Connection
	} catch (SQLException ex) {
	    // handle any errors
	    System.out.println("SQLException: " + ex.getMessage());
	    System.out.println("SQLState: " + ex.getSQLState());
	    System.out.println("VendorError: " + ex.getErrorCode());
	}
	return conn;

    }
}
