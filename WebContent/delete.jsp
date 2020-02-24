<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="db" class="bao.Conn"></jsp:useBean>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body> 
<% 
Connection conn = db.getConnection();
String m=request.getParameter("m");
int ttt=Integer.parseInt(m);
if (ttt==1) {
String id=request.getParameter("id");
String sqlo="delete from yonghu where id='"+id+"' ";
PreparedStatement ps = conn.prepareStatement(sqlo);
ps.executeUpdate();
out.println("<script lanage='javascript'>alert('删除成功！！');window.location.href='YezhuServlet';</script>");
}
if (ttt==2) {
	String id=request.getParameter("id");
	String sqlo="delete from qianru where id='"+id+"'";
	PreparedStatement ps = conn.prepareStatement(sqlo);
	ps.executeUpdate();
	out.println("<script lanage='javascript'>alert('删除成功！！');window.location.href='CheweiServlet';</script>");
	}
if (ttt==3) {
	String id=request.getParameter("id");
	String sqlo="delete from salary where id='"+id+"'";
	PreparedStatement ps = conn.prepareStatement(sqlo);
	ps.executeUpdate();
	out.println("<script lanage='javascript'>alert('删除成功！！');window.location.href='SalaryServlet';</script>");
	}
if (ttt==4) {
	String id=request.getParameter("id");
	String sqlo="delete from tousu where id='"+id+"'";
	PreparedStatement ps = conn.prepareStatement(sqlo);
	ps.executeUpdate();
	out.println("<script lanage='javascript'>alert('删除成功！！');window.location.href='TousuServlet';</script>");
	}
if (ttt==5) {
	String id=request.getParameter("id");
	String sqlo="delete from baoxiu where id='"+id+"' ";
	PreparedStatement ps = conn.prepareStatement(sqlo);
	ps.executeUpdate();
	out.println("<script lanage='javascript'>alert('删除成功！！');window.location.href='BaoxiuServlet';</script>");
	}
%>
</body>
</html>