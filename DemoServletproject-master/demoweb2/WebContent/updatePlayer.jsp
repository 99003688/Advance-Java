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
int d =Integer.parseInt(request.getParameter("id"));
PlayerDao pd=new PlayerDao();
Player p1=pd.getAllPlayerById(d);
%>
<form action="./UpdatePlayerServlet" method="post">
Player Id:<input type="hidden" name="playerId" value= <%=p1.getPlayerId() %>> <br><br>
Player Name: <input type="text" value="<%=p1.getPlayerName() %>" name="playerName"><br></br>
Player Country: <input type="text" value="<%=p1.getCountry() %>" name="country"><br></br>
<input type="submit" value="Update Player">

</form>
</body>
</html>