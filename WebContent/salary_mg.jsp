<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030" import="java.sql.*"%>
<%@page import="java.util.List"%>
<%@page import="bao.Salary_mg"%>
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
  <table width="830" height="487" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td valign="top" style="padding-left:15px; padding-top:15px;" background="image/right.jpg"><table width="494" border="1" cellspacing="0" cellpadding="0">
        <tr>
          <td width="69" height="33" align="center">姓名</td>
          <td width="69" align="center">迁出金额</td>
          <td width="165" align="center">缴费方式</td>
          <td width="72" align="center">收费人员</td>
          <td width="75" align="center">迁出时间</td>
          <td width="44" align="center">删除</td>
        </tr>
                 <%
		List<Salary_mg> list = (List<Salary_mg>)request.getAttribute("list");
		if(list==null||list.size()<1){
			out.print("没有数据！");
		}else{
		for(Salary_mg p : list){
	%>
        <tr>
          <td height="35" align="center"><%=p.getUsername()%></td>
          <td align="center"><%=p.getSalary_all()%></td>
          <td align="center"><%=p.getSalary_type()%></td>
          <td align="center"><%=p.getSalary_per()%></td>
          <td align="center"><%=p.getSalary_time()%></td>
          <td align="center"><a href="delete.jsp?id=<%=p.getId() %>&m=3">删除</a></td>
        </tr>
        <%	
		}
	}
	%>
	<tr>
		<td align="center" colspan="10" bgcolor="white">
			<%=request.getAttribute("bar")%>
		</td>
	</tr>
      </table></td>
    </tr>
  </table>
</body>
</html>