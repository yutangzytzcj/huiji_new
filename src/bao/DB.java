package bao;

import java.sql.*;

public class DB {
	public Connection conn=null;
    public Statement stmt=null;
    public ResultSet rs=null;
    public  DB(){
            try{ 
                    Class.forName("com.mysql.jdbc.Driver");
            }catch(java.lang.ClassNotFoundException e){
                    System.err.println("mysql驱动未注册");
            } 
    }
/***************************************************
     *method name:	executeQuery()
     *功能:执行查询操作
     *return value: ResultSet
****************************************************/
    public ResultSet executeQuery(String sql){
        try{
        	
                conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wuye?user=root&password=123456&useUnicode=true");
                stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                rs=stmt.executeQuery(sql);
        }
        catch(SQLException ex)
        {
                System.err.println(ex.getMessage());
                System.out.println("conn空了##########");
                
        }
        return rs;
}
    public ResultSet GetRs(String SQL){
		try
		{
			 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wuye?user=root&password=123456&useUnicode=true");
			Statement Smt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet Rs = Smt.executeQuery(SQL);
			return Rs;	
		}
		catch(SQLException e)
		{
			System.out.println("失败！");
			return null;
		}
	}
/***************************************************
     *method name:	close()
     *功能:关闭数据库链接
     *return value: 	void
****************************************************/
     public void close(){
        try {
          if (rs != null) rs.close();
        }
        catch (Exception e) {
          e.printStackTrace(System.err);
        }finally{}
        try {
          if (stmt != null) stmt.close();
        }
        catch (Exception e) {
          e.printStackTrace(System.err);
        }finally{}
        try {
          if (conn != null) {
            conn.close();
          }
        }
        catch (Exception e) {
          e.printStackTrace(System.err);
        }finally{}
      }
}

