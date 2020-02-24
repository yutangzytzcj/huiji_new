<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<link href="css/css.css" rel="stylesheet" type="text/css">
</head>
<body>  
<%  
String user_name=(String)session.getAttribute("user_name");
if(user_name==null) {
	out.println("<script>alert('请先登录系统！');window.history.back();</script>");
}
%>
<form id="form1" name="form1" method="post" action="manager_chuli.jsp">
  <table width="830" height="487" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" style="padding-left:15px; padding-top:15px;" background="image/right.jpg"><table width="500" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="35">&nbsp;账户：
            <input name="username" type="text" id="username" /></td>
        </tr>
        <tr>
          <td height="35">&nbsp;密码：
            <input name="password" type="password" id="password" /></td>
        </tr>
		
        <tr>
          <td height="40">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" name="Submit" value="添加" />
            &nbsp; <input type="reset" name="Submit2" value="重置" /></td>
        </tr>
      </table></td>
    </tr>
  </table>
</form>
</body>
</html>