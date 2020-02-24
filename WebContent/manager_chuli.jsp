<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030" import="java.sql.*"%>
    <%@page import="bao.Conn"%>
    <jsp:useBean id="ShowTime" class="bao.Checkshijian"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head> 
<body>  
<%
String username=new String(request.getParameter("username").getBytes("ISO-8859-1"),"GB18030");
String password=new String(request.getParameter("password").getBytes("ISO-8859-1"),"GB18030");


try {
	Conn tt = new Conn();
	Connection conn = tt.getConnection();
	// 删除信息的SQL语句
	String sql = "insert into login(username,password)values('"+username+"','"+password+"')";
	// 获取PreparedStatement
	PreparedStatement ps = conn.prepareStatement(sql);
	// 对SQL语句中的第一个占位符赋值
	//ps.setInt(1, id);
	// 执行更新操作
	ps.executeUpdate();
	// 关闭PreparedStatement
	ps.close();
	// 关闭Connection
	conn.close();
	out.println("<script>alert('管理员添加成功！');window.location.href='manager_add.jsp';</script>");
} catch (Exception e) {
	e.printStackTrace();
} 
%>
</body>
</html>