<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="Login_chuli" class="bao.Login_chuli" scope="page"/> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head> 
<body> 
<%
String username=new String(request.getParameter("username").getBytes("ISO-8859-1"),"GB18030");
String password=new String(request.getParameter("password").getBytes("ISO-8859-1"),"GB18030");
String types=new String(request.getParameter("types").getBytes("ISO-8859-1"),"GB18030");

if(types.equals("����")){
	
int rtn=Login_chuli.check(username,password);
if(rtn==0){
  out.println("<script>alert('����Ա��¼ʧ�ܣ�');window.history.back();</script>");
}else{
  session.setAttribute("user_name",""+username+"");
  out.println("<script>alert('����Ա��¼�ɹ���');window.location.href='right.jsp';</script>");
}
}

if(types.equals("�û�")){
	
	int rtn=Login_chuli.check1(username,password);
	if(rtn==0){
	  out.println("<script>alert('�û���¼ʧ�ܣ�');window.history.back();</script>");
	}else{
	  session.setAttribute("users",""+username+"");
	  out.println("<script>parent.location.href='index2.jsp';</script>");
	  
	  //out.println("<a href='index2.jsp' target='_parent'>�����½�û���ز�ѯ����</a>");
	  
	}
}

%>
</body>
</html>