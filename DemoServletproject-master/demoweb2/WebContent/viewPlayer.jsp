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
PlayerDao pd=new PlayerDao();
List<Player> li=pd.getAllPlayers();
%>
<table>
<tr>
<th>Player Number</th>
<th>Player Name</th>
<th>Country</th>
<th>Date of birth</th>
<th></th>
</tr>
<%
for(Player p1:li){
%>
<tr>
<td><%=p1.getPlayerId() %></td>
<td><%=p1.getPlayerName() %></td>
<td><%=p1.getCountry() %></td>
<td><%=p1.getsDate1() %>

	<td><a href="updatePlayer.jsp?id=<%=p1.getPlayerId()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>