package com.neebalgurukul.model;

import java.util.Date;

public class Login {
    
    private int id;
    private String uname;
    private String pswd;
    private Date lastModified;
    private boolean active;
    
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getPswd() {
        return pswd;
    }
    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
    public Date getLastModified() {
        return lastModified;
    }
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
	return "Login [id=" + id + ", uname=" + uname + ", pswd=" + pswd + ", lastModified=" + lastModified
		+ ", active=" + active + "]";
    }
    
    
    
}
