<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<link href="css/css.css" rel="stylesheet" type="text/css">
</head>
<frameset rows="110s,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame src="top2.jsp" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />
  <frameset rows="*" cols="174,*" framespacing="0" frameborder="no" border="0">
    <frame src="left2.jsp" name="leftFrame" scrolling="No" noresize="noresize" id="leftFrame" title="leftFrame" />
    <frame src="right2.jsp" name="mainFrame" id="mainFrame" title="mainFrame" />
  </frameset>
</frameset>  
<body>
<%
String users=(String)session.getAttribute("users");
if(users==null) {
	response.sendRedirect("index.jsp");
}

%>
</body>
</html>