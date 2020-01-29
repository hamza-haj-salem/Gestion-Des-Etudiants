<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
    <%@ page import="model1.etudiant" import= "java.util.List" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <% List <etudiant> l1 = (List)request.getAttribute("l1"); %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
<center> <h1>Gestion Des Etudiant</h1></center>
<h1>Liste des Etudiants  ${sessionScope.user}</h1>
<p>bonjour Mr <h1> ${sessionScope.u1.login} </h1> </p>
<a href="servdec">DECONNEXION </a>
<table border=1>
<tr>
	<th>Num</th>
	<th>Nom</th>
	<th>Prenom</th>
	<th>NumTele</th>
	<th>Action 1</th>
	
</tr>

<%if(request.getAttribute("l1")!=null){ %>
<%!int i; %>
<%!//produits p; %>
<% for(i=0;i<l1.size();i++){ %>
<% //for (produits p:l1){ %>
<tr>
	<td> <%=l1.get(i).getNum()%></td>
	<td><%=l1.get(i).getNom() %></td>
	<td><%=l1.get(i).getPrenom() %></td>
	<td><%=l1.get(i).getNumTel() %></td>
		
	<%--<%! int num ; 
	<%= num= l1.get(i).getNum() %>
	--%>
 	<td><a href="supprimer?Num=${l1.get(i).getNum()}">Supprimer</td>
 		
 		<%-- 
	<form name="form3" method="POST" action="supprimer">
		<td>
			<input type="hidden" name="num" value=<%=l1.get(i).getNum()%>> <%-- hidden pour etre invisible 
			<input type="submit" name="submit" value="supprimer">
		</td>
	</form>	
	
	
			<%-- <td><a href="supprimer?Num=${l1.get(i).getNum()}">Edit </td> --%>
	
</tr>
<%} %>
<%} %>
</table>





<hr>
<hr>
<h2> Ajouter Un Etudiant :  </h2>
<form name="form1" method="POST" action="ajouter">
<p> Prenom  <input type="text" name="prenom" > </p>
<p> nom <input type="text" name="nom" > </p>
<p> Num Tele <input type="text" name="numtel" > </p>
<input type="submit" name="submit" value="Ajouter">
</form>
<hr>
<hr>
</body>
</html>