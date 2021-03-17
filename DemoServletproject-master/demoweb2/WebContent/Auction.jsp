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
auctionDao pd=new auctionDao();
List<Auction> li=pd.getAllAuction();
%>
<table>
<tr>
<th>Auction Number</th>
<th>Team Id</th>
<th>Player Id</th>
<th>Amount</th>
<th></th>
</tr>
<%
for(Auction p1:li){
%>
<tr>
<td><%=p1.getAuc_id() %></td>
<td><%=p1.getTeam_id() %></td>
<td><%=p1.getPlayer_id() %></td>
<td><%=p1.getAmount() %>

</tr>
<%} %>
</table>

</body>
</html>