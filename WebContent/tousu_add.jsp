<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="manager_mg" class="bao.DB" scope="page"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<link href="css/css.css" rel="stylesheet" type="text/css">
</head> 
<body>
<%String users=(String)session.getAttribute("users"); %>

<form id="form1" name="form1" method="post" action="tousu_chuli.jsp">
  <table width="830" height="487" border="0" cellpadding="0" cellspacing="0">
    <tr> 
      <td valign="top" style="padding-left:15px; padding-top:15px;" background="image/right.jpg"><table width="500" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="35">&nbsp; 姓名：
            <input name="username" type="text" id="username" value="<%=users %>" readonly /></td>
        </tr>
        <tr> 
          <td height="35">&nbsp; 电话：
            <input name="tel" type="text" id="tel" /></td>
        </tr>
        <tr>
          <td height="35">&nbsp; 标题：
            <input name="title" type="text" id="title" /></td>
        </tr>
        <tr>
          <td height="35">&nbsp; 内容：
            <textarea name="content" cols="50" rows="5" id="content"></textarea></td>
        </tr>
		
        <tr>
          <td height="40">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" name="Submit" value="投诉" />
            &nbsp; <input type="reset" name="Submit2" value="重置" /></td>
        </tr>
      </table>
	  
        <table width="500" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="93" height="29" align="center" bgcolor="#CCCCCC">用户名</td>
            <td width="300" align="center" bgcolor="#CCCCCC">答复内容</td>
            <td width="107" align="center" bgcolor="#CCCCCC">答复时间</td>
          </tr>
<%	
int CountPage = 0;
int CurrPage = 1;
int PageSize = 15;
int CountRow = 0; 
String StrPage = request.getParameter("Page");
if (StrPage == null)
{
	CurrPage = 1;
}
else
{
	CurrPage = Integer.parseInt(StrPage);
}

	try
	{
		
		String sqlyy = "Select * from tousu where username='"+users+"'";
		ResultSet rs=manager_mg.GetRs(sqlyy);
		 if(!rs.next())
		 {
		  out.println("对不起，暂时没有管理员信息");
		 }
		 else{
		rs.last();
		int i = 0;
		CountRow = rs.getRow();
		CountPage = (CountRow/PageSize);
		if (CountRow%PageSize>0)
			CountPage++;
		Integer n = (CurrPage-1)*5+1;
		rs.first();
			rs.absolute(CurrPage*PageSize-PageSize+1);
			while (i<PageSize && !rs.isAfterLast())
			{
		%>
          <tr>
            <td height="23" align="center"><%=rs.getString("username")%></td>
            <td align="center"><%=rs.getString("answer")%></td>
            <td align="center"><%=rs.getString("da_time")%></td>
          </tr>
           <%
	            				rs.next();
	            				i++;
	            			}
            			}
	}

            		catch (SQLException e)
            		{
            			out.println(e.getMessage());
            		}    	
 %>
        </table>  
		
	<p>&nbsp;</p></td>
    </tr>
  </table>
</form>
</body>
</html>