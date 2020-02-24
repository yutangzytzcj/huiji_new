<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030" import="java.sql.*"%>
<%@page import="java.util.List"%>
<%@page import="bao.Tousu_mg"%>
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
      <td valign="top" style="padding-left:15px; padding-top:15px;" background="image/right.jpg"><table width="802" border="1" cellspacing="0" cellpadding="0">
        <tr>
          <td width="69" height="33" align="center">投诉人</td>
          <td width="67" align="center">电话</td>
          <td width="104" align="center">标题</td>
          <td width="183" align="center">内容</td>
          <td width="76" align="center">投诉时间</td>
          <td width="147" align="center">回答内容</td>
          <td width="81" align="center">回答时间</td>
          <td width="36" align="center">答复</td>
          <td width="39" align="center">删除</td>
        </tr>
                        <%
		List<Tousu_mg> list = (List<Tousu_mg>)request.getAttribute("list");
		if(list==null||list.size()<1){
			out.print("没有数据！");
		}else{
		for(Tousu_mg p : list){
	%>
        <tr>
          <td height="35" align="center"><%=p.getUsername()%></td>
          <td align="center"><%=p.getTel()%></td>
          <td align="center"><%=p.getTitle()%></td>
          <td align="center"><%=p.getContent()%></td>
          <td align="center"><%=p.getTou_time()%></td>
          <td align="center"><%=p.getAnswer()%></td>
          <td align="center"><%=p.getDa_time()%></td>
          <td align="center"><a href="answer.jsp?id=<%=p.getId() %>">答复</a></td>
          <td align="center"><a href="delete.jsp?id=<%=p.getId() %>&m=4">删除</a></td>
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