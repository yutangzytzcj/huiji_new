package bao;

import bao.DB;
import java.sql.*;
public class Login_chuli {
	public int check(String name,String inpwd) {
	    int flag = 0;
	    DB conn = new DB();
	    String sql = "SELECT * FROM login where username='" +
	                 name + "'";
	    ResultSet rs = conn.executeQuery(sql);
	    try {
	        if (rs.next()) {
	            String pwd = inpwd;
	            if (pwd.equals(rs.getString(3)))
	            {
	                flag = 1;
	                rs.last();
	                int rowSum = rs.getRow();
	                rs.first();
	                if (rowSum != 1) {
	                    flag = 0;
	                    System.out.print("获取的row的值：" + sql + rowSum);
	                }
	            }
	            else 
	            {
	                flag = 0;
	            }
	        }else{
	            flag = 0;
	        }
	    } catch (SQLException ex) {
	        flag = 0;
	    }
	    conn.close();
	    return flag;
	}
	
	public int check1(String name,String inpwd) {
	    int flag = 0;
	    DB conn=new DB();
	    String sql = "SELECT * FROM yonghu where username='" +
	                 name + "'";
	    ResultSet rs = conn.executeQuery(sql);
	   
	    try {
	        if (rs.next()) {
	            String pwd = inpwd;
	            if (pwd.equals(rs.getString(3))) {
	                flag = 1;
	                rs.last();
	                int rowSum = rs.getRow();
	                rs.first();
	                if (rowSum != 1) {
	                    flag = 0;
	                    System.out.print("获取的row的值：" + sql + rowSum);
	                }
	            } else {
	                flag = 0;
	            }
	        }else{
	            flag = 0;
	        }
	    } catch (SQLException ex) {
	        flag = 0;
	    }
	    conn.close();
	    return flag;
	}
}

