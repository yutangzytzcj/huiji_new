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
String id=new String(request.getParameter("id").getBytes("ISO-8859-1"),"GB18030");
String answer=new String(request.getParameter("answer").getBytes("ISO-8859-1"),"GB18030");
try {
	Conn tt = new Conn();
	Connection conn = tt.getConnection();
	// ɾ����Ϣ��SQL���
	String sql = "update tousu set answer='"+answer+"',da_time='"+ShowTime.showTodayTime()+"' where id='"+id+"'";
	// ��ȡPreparedStatement
	PreparedStatement ps = conn.prepareStatement(sql);
	// ��SQL����еĵ�һ��ռλ����ֵ
	//ps.setInt(1, id);
	// ִ�и��²���
	ps.executeUpdate();
	// �ر�PreparedStatement
	ps.close();
	// �ر�Connection
	conn.close();
	out.println("<script>alert('�𸴳ɹ���');window.location.href='TousuServlet';</script>");
} catch (Exception e) {
	e.printStackTrace();
} 
%>
</body>
</html>