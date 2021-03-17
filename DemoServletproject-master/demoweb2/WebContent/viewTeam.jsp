<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.demoweb2.model.*,com.ltts.demoweb2.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
TeamDao pd=new TeamDao();
List<Team> li=pd.getAllTeam();
%>
<table>
<tr>
<th>Team Number</th>
<th>Team Name</th>
<th>Owner Name</th>
<th>Coach Name</th>
<th>Player Id</th>
<th></th>
</tr>
<%
for(Team p1:li){
%>
<tr>
<td><%=p1.getTeamId() %></td>
<td><%=p1.getTeamname() %></td>
<td><%=p1.getOwnerName() %></td>
<td><%=p1.getCoachName() %></td>
<td><%=p1.getPlayerId() %></td>

</tr>
<%} %>
</table>

</body>
</html>