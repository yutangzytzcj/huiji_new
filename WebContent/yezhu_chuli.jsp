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
String tel=new String(request.getParameter("tel").getBytes("ISO-8859-1"),"GB18030");
String l_name=new String(request.getParameter("l_name").getBytes("ISO-8859-1"),"GB18030");
String l_ceng=new String(request.getParameter("l_ceng").getBytes("ISO-8859-1"),"GB18030");
String l_wu=new String(request.getParameter("l_wu").getBytes("ISO-8859-1"),"GB18030");
String l_danyuan=new String(request.getParameter("l_danyuan").getBytes("ISO-8859-1"),"GB18030"); 
String ru_time=new String(request.getParameter("ru_time").getBytes("ISO-8859-1"),"GB18030");
String l_fangxing=new String(request.getParameter("l_fangxing").getBytes("ISO-8859-1"),"GB18030");
String beizhu=new String(request.getParameter("beizhu").getBytes("ISO-8859-1"),"GB18030");
try {
	Conn tt = new Conn();
	Connection conn = tt.getConnection();
	// ɾ����Ϣ��SQL���
	String sql = "insert into yonghu(username,password,tel,l_name,l_ceng,l_wu,l_danyuan,ru_time,l_fangxing,beizhu,shijian)values('"+username+"','"+password+"','"+tel+"','"+l_name+"','"+l_ceng+"','"+l_wu+"','"+l_danyuan+"','"+ru_time+"','"+l_fangxing+"','"+beizhu+"','"+ShowTime.showTodayTime()+"')";
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
	out.println("<script>alert('������Ϣ��ӳɹ���');window.location.href='yezhu_add.jsp';</script>");
} catch (Exception e) {
	e.printStackTrace();
} 
%>
</body>
</html>