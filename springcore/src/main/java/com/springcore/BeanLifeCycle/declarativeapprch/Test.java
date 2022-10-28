package com.springcore.BeanLifeCycle.declarativeapprch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test{

    private String driver, url, username, password;
    private Connection con;
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void conCleanup() throws Exception {
        con.close();
        System.out.println("Connection close");
    }

    public void conInit() throws Exception {
       Class.forName(driver);
       con = DriverManager.getConnection(url, username, password); 
       System.out.println("Connection open");
    }

    public void save(int Emp_id, String Emp_name, String Mob_no, int salary) throws Exception{
        PreparedStatement ps = con.prepareStatement("insert into emp values (?,?,?,?)");
        ps.setInt(1, Emp_id);
        ps.setString(2, Emp_name);
        ps.setString(3, Mob_no);
        ps.setInt(4, salary);
        ps.executeUpdate();
        System.out.println("data Saved sucessfully");
    }
    
}
