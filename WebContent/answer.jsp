<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030" import="java.sql.*"%>
    <jsp:useBean id="db" class="bao.DB"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<link href="css/css.css" rel="stylesheet" type="text/css">
</head>
<body>  
 <%
 String id=new String(request.getParameter("id").getBytes("ISO-8859-1"),"GB18030"); 
 String sqlo="select * from tousu where id='"+id+"' ";
 ResultSet rs=db.executeQuery(sqlo);
 if(!rs.next())
 {
 	out.println("暂时没有信息");
 }
 else{
 %>  
<form id="form1" name="form1" method="post" action="answer_chuli.jsp">
  <table width="830" height="487" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" style="padding-left:15px; padding-top:15px;" background="image/right.jpg"><table width="500" border="0" cellspacing="0" cellpadding="0">

        <tr>
          <td height="35">&nbsp;&nbsp;&nbsp; ID：
            <input name="id" type="text" id="id" readonly value="<%=id %>"/></td>
        </tr>
        <tr>
          <td height="35">&nbsp; 内容：
            <textarea name="answer" cols="50" rows="5" id="answer"></textarea></td>
        </tr>
		
        <tr>
          <td height="40">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" name="Submit" value="答复" />
            &nbsp; <input type="reset" name="Submit2" value="重置" /></td>
        </tr>
      </table></td>
    </tr>
  </table>
</form>
<%} %>
</body>
</html>